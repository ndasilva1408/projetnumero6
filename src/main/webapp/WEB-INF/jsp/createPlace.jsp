
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
<form id="topoform" action="saveplace" method="post" >
    <table style="with: 50%">
        <tr>
            <td>Nom du lieu</td>
            <td> <input type="text" name="name"/></td>
        </tr>
    </table>
        <input type="submit" value="Submit" />
</form>

</body>
</html>
