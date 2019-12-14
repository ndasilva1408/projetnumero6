<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <title>Registration Form</title>
</head>

<body>
<header>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</header>

<h1>Register Form</h1>
<form id="cbform" action="" method="post" >
    <table style="with: 50%">

        <td>Nom du TOPO lié a cette voie</td>

        <td>
            <select name="topoName" >

                <c:forEach var="entry" items="${topoList}">
                    <option>${entry.name}</option>
                </c:forEach>
            </select>
        </td>


        <tr>
            <td>Nom de la voie</td>
            <td> <input type="text" name="name"/></td>
        </tr>

        <tr>
            <td>Niveau</td>
            <td>
                <form>
                    <select type="text" name="lvl">
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
    </table>
    <input type="submit" value="Submit" />


</form>

</body>
</html>
