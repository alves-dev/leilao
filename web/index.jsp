<%@ page import="me.arkenum.leilao.Constants" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link type="text/css" href="style.css" rel="stylesheet">
    <title>Leilao</title>
</head>
<body>
<div id="flexbox"></div>
<div id="content" align="center">
    <%
        String message = request.getParameter(Constants.MSG_PARAMETER_KEY);
        if (message != null && !message.isEmpty()) {
    %>
    <div id="message">
        <p><c:out value="${message}"/></p>
    </div>
    <%
        }
    %>
    <h1>Seja bem-vindo!</h1>
    <h2>Por favor logue-se ou registre-se:</h2>
    <form action="${pageContext.request.contextPath}/services">
        <input type="hidden" name="cmd" value="login"/>
        Usuário: <input name="user"/>
        Senha: <input type="password" name="password"/>
        <input type="submit" value="login"/>
    </form>
    <p>Não registrado? Registre-se <a href="register.jsp">aqui</a>!</p>
</div>
</body>
</html>
