<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Leilao</title>
</head>
<body>
<h1>Leilao Aberto</h1>
<p>Produto .............:
    <c:out value="${leilao.produto}"/>
    <br>Lance Vencedor..:
    <c:out value="${leilao.valorLance}"/>
    <br>Nome Vencedor..:
    <c:out value="${leilao.vencedor}"/>
<h2> Relação de Lances </h2>
<table border="1">
    <c:forEach items="${leilao.lances}" var="p" varStatus="s">
        <tr bgcolor="#${s.count%2 == 0?'aaee88':'ffffff'}">
            <td>${s.count}</td>
            <td>${p.nome} </td>
            <td>${p.valor}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>