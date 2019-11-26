<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>Nouveau compte</title>

</head>
<body>

<img class="bann-amicale" src="bootstrap/bankimage/LesAmisDelEscalade.png" style="width:150px" alt="Logo"/>

<form action="savemember" method="post">
    <table style="with: 50%">

        <tr>
            <td>Identifiant</td>
            <td><input type="text" name="login"/></td>
        </tr>
        <tr>
            <td>Mot de Passe</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>Date de naissance</td>
            <td><input type="date" name="birthDate" min="1970-01-01" max="2008-01-31"/></td>
        </tr>
        <tr>
            <td>Prénom</td>
            <td><input type="text" name="firstName"/></td>
        </tr>
        <tr>
            <td>Nom</td>
            <td><input type="text" name="lastName"/></td>
        </tr>
        <tr>
            <td>Adresse</td>
            <td><input type="text" name="address"/></td>
        </tr>
        <tr>
            <td>N° de licence</td>
            <td><input type="text" name="licenseNumber"/></td>
        </tr>
        <tr>
            <td>Niveau</td>
            <td>
                <form>
                    <select type="text" name="climbingLvl">
                        <option>3</option>
                        <option>3+</option>
                        <option>4a</option>
                        <option>4b</option>
                        <option>4c</option>
                        <option>5a</option>
                        <option>5b</option>
                        <option>5c</option>
                        <option>6a</option>
                        <option>6a+</option>
                        <option>6b</option>
                        <option>6b+</option>
                        <option>7a</option>
                        <option>7a+</option>
                        <option>7b</option>
                        <option>7b+</option>
                        <option>7c</option>
                        <option>7c+</option>
                        <option>8a</option>
                        <option>8a+</option>
                        <option>8b</option>
                        <option>8b+</option>
                        <option>8c</option>
                        <option>8c+</option>
                        <option>9a</option>
                        <option>9a+</option>
                    </select>
                </form>


            </td>
        </tr>
        <tr>
            <td>Adresse Email</td>
            <td><input type="text" name="email"/></td>
        </tr>

    </table>
    <input type="submit" value="Submit"/></form>
</body>
</html>
