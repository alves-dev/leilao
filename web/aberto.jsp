<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Aberto</title>
</head>
<body>
<h1>Leilao Aberto</h1>

<p>Produto...... :
    <c:out value="${leilao.produto}"/>
<p>Lance Inicial.:
    <c:out value="${leilao.valorLance}"/>
<p style="color:red">
    <c:out value="${erro}"/>
</p>
<form name="darLance" action="fc" method="POST">
    <input type="hidden" name="cmd" value="lance"/>
    <table border="0">

        <tbody>
        <tr>
            <td>Nome.....:</td>
            <td><input type="text" name="nome" value="" size="40"/></td>
        </tr>
        <tr>
            <td>Lance....:</td>
            <td><input type="text" name="lance" value="" size="12"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="DarLance" name="iniciar"/></td>
            <td><input type="reset" value="Limpar"/></td>
        </tr>
        </tbody>
    </table>
</form>
<form name="encerrar" action="fc" method="POST">
    <input type="hidden" name="cmd" value="encerrar"/>
    <table border="0">

        <tbody>
        <tr>
            <td><input type="submit" value="Encerrar" name="iniciar"/></td>
        </tr>
        </tbody>
    </table>
</form>
</html>