<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" %>

<html lang="en">
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>User List</title>
    <link rel="stylesheet" type="text/css"
          href="
    ${pageContext.request.contextPath}/bootstrap.css"/>
</head>
<header>
    <jsp:include page="navbar.jsp"></jsp:include>

    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</header>
<body>
<h1>Liste des utilisateurs enregistrés</h1>

<div>
    <table class="table table-striped table-bordered table-sm">
        <tr>
            <th>Login</th>
            <th>Niveau</th>
            <th>Mail</th>
            <th>Rang</th>

        </tr>

        <c:forEach items="${memberList}" var="member">
            <tr>
                <c:if test="${member.active == true}">
                    <c:if test="${member.role.rang != 'ADMIN'}">
                        <td>${member.login}</td>
                        <td>${member.climbingLvl}</td>
                        <td>${member.email}</td>
                        <td>${member.role.rang}</td>
                    </c:if>
                </c:if>


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
