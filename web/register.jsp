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
        String error = request.getParameter(Constants.ERROR_PARAMETER_KEY);
        if (error != null && !error.isEmpty()) {
    %>
    <div id="error">
        <p id="errorMsg">
            Erro: <% Constants.getErrorMsg(Byte.parseByte(error)); %>
        </p>
    </div>
    <%
        }
    %>
    <h2>Informe os seguintes dados:</h2>
    <form action=" ${pageContext.request.contextPath}/services">
        <input type="hidden" name="cmd" value="register"/>
        Usuário: <input name="user"/>
        Senha: <input type="password" name="password"/>
        <input type="submit" value="Registrar"/>
    </form>
</div>
</body>
</html>
