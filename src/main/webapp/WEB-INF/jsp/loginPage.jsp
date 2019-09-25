<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Se connecter</title>
</head>
<body>
<h1>S'identifier</h1>
<form action="Auth_login" method="post">
    <table style="with: 50%">
        <tr>
            <td>Identifiant</td>
            <td><input type="text" name="login" /></td>
        </tr>
        <tr>
            <td>Mot de passe</td>
            <td><input type="password" name="password" /></td>
        </tr>
    </table>
    <input type="submit" value="Se Connecter" /></form>
</body>
</html>
