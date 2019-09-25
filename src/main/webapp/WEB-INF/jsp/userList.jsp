<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User List</title>
    <link rel="stylesheet" type="text/css"
          href=""${pageContext.request.contextPath}/bootstrap.css"/>
</head>
<body>
<h1>User List</h1>

<div>
    <table border="1">
        <tr>
            <th>Login</th>
            <th>Password</th>
        </tr>
        <c:forEach  items="${user}" var ="user">
            <tr>
                <td>${user.login}</td>
                <td>${user.password}</td>
            </tr>
        </c:forEach>
    </table>
</div>


</body>
</html>
