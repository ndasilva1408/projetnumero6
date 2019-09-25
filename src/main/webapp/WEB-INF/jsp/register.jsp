<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Form</title>
</head>
<body>
<h1>Register Form</h1>
<form action="auth_register" method="post">
    <table style="with: 50%">
        <tr>
            <td>Identifiant</td>
            <td><input type="text" name="login" /></td>
        </tr>
        <tr>
            <td>Mot de Passe</td>
            <td><input type="password" name="password" /></td>
        </tr>
        <tr>
            <td>Date de naissance</td>
            <td><input type="date" name="birth_date" min="1970-01-01" /></td>
        </tr>
        <tr>
            <td>Prénom</td>
            <td><input type="text" name="first_name" /></td>
        </tr>
        <tr>
            <td>Nom</td>
            <td><input type="text" name="last_name" /></td>
        </tr>
        <tr>
            <td>address</td>
            <td><input type="text" name="address" /></td>
        </tr>
        <tr>
            <td>N° de licence</td>
            <td><input type="text" name="license_number" /></td>
        </tr>
        <tr>
            <td>Niveau</td>
            <td><input type="text" name="climbing lvl" /></td>
        </tr>
    </table>
    <input type="submit" value="Submit" /></form>
</body>
</html>
