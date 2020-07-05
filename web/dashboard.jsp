<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link type="text/css" href="style.css" rel="stylesheet">
    <title>Leilao</title>
</head>
<body>
<div id="flexbox"></div>
<div id="content">
    <h1>Produtos disponiveis:</h1>
    <c:forEach items="${leiloes}" var="leilao" varStatus="s">
        <div>
            <p>Produto:<c:out value="${leilao.produto}"/></p>
            <p>>Lance Inicial:<c:out value="${leilao.valorLance}"/></p>
            <c:if test="${leilao.aberto}">
                <a class="button" href="${pageContext.request.contextPath}/services/verLeilao">Dar Lance</a>
            </c:if>
        </div>
    </c:forEach>
</div>
</body>
</html>
