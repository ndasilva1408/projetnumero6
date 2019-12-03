<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" %>

<html lang="en">
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>User List</title>
    <link rel="stylesheet" type="text/css"
          href=""
    ${pageContext.request.contextPath}/bootstrap.css"/>
</head>
<header>
    <jsp:include page="navbar.jsp"></jsp:include>
</header>
<body>
<h1>User List</h1>

<div>
    <table border="1">
        <tr>
            <th>Login</th>
            <th>Password</th>
            <th>Rang</th>
        </tr>

        <c:forEach items="${memberList}" var="member">
            <tr>
                <td>${member.login}</td>
                <td>${member.password}</td> <!-- A EFFACER POUR LA SOUTENANCE -->
                <td>${member.role.rang}
                </td>


                <c:if test="${sessionScope.rang == 'ADMIN'}">
                    <c:if test="${member.role.rang == 'INVITE'}">
                        <td>

                            <form method="post">
                                <button type="submit" name="button" value="${member.email}"> Passer au rang de membre
                                </button>

                            </form>

                        </td>
                    </c:if>

                </c:if>

            </tr>
        </c:forEach>

    </table>
</div>


</body>
</html>
