<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>Registration Form</title>
</head>
<body>
<h1>Register Form</h1>
<form action="savemember" method="post">
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
            <td><input type="date" name="birth_date" min="1970-01-01" max="2008-01-31" /></td>
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
            <td>Adresse</td>
            <td><input type="text" name="address" /></td>
        </tr>
        <tr>
            <td>N° de licence</td>
            <td><input type="text" name="license_number" /></td>
        </tr>
        <tr>
            <td>Niveau</td>
            <td>
                <p>
                    <input type="radio" name="climbing lvl" value="1" />1
                <input type="radio" name="climbing lvl" value="2"/>2
                <input type="radio" name="climbing lvl" value="3"/>3
                <input type="radio" name="climbing lvl" value="4"/>4
                <input type="radio" name="climbing lvl" value="5a"/>5a
                <input type="radio" name="climbing lvl" value="5b"/>5b
                <input type="radio" name="climbing lvl" value="5c"/>5c
                <input type="radio" name="climbing lvl" value="6a"/>6a
                <input type="radio" name="climbing lvl" value="6a+"/>6a+
                <input type="radio" name="climbing lvl" value="6b"/>6b
                <input type="radio" name="climbing lvl" value="6b+"/>6b+
                <input type="radio" name="climbing lvl" value="6c"/>6c
                <input type="radio" name="climbing lvl" value="6c+"/>6c+
                <input type="radio" name="climbing lvl" value="7a"/>7a
                <input type="radio" name="climbing lvl" value="7a+"/>7a+
                </p>
                <p>
                <input type="radio" name="climbing lvl" value="7b"/>7b
                <input type="radio" name="climbing lvl" value="7b+"/>7b+
                <input type="radio" name="climbing lvl" value="7c"/>7c
                <input type="radio" name="climbing lvl" value="7c+"/>7c+
                <input type="radio" name="climbing lvl" value="8a"/>8a
                <input type="radio" name="climbing lvl" value="8a+"/>8a+
                <input type="radio" name="climbing lvl" value="8b"/>8b
                <input type="radio" name="climbing lvl" value="8b+"/>8b+
                <input type="radio" name="climbing lvl" value="8c"/>8c
                <input type="radio" name="climbing lvl" value="8c+"/>8c+
                <input type="radio" name="climbing lvl" value="9a"/>9a
                <input type="radio" name="climbing lvl" value="9a+"/>9a+
                <input type="radio" name="climbing lvl" value="9b"/>9b
                <input type="radio" name="climbing lvl" value="9b+"/>9b+
                <input type="radio" name="climbing lvl" value="9c"/>9c
                </p>
            </td>
        </tr>

    </table>
    <input type="submit" value="Submit" /></form>
</body>
</html>
