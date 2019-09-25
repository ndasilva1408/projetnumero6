<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
    <meta charset="utf-8" />
    <title>Bienvenue</title>
    <link rel="stylesheet" type="text/css"
          href=""${pageContext.request.contextPath}/bootstrap.css"/>
</head>
<header>


</header>
<body>
<h1>Welcome</h1>
<h2>Message : ${message}</h2>
<%-- Ceci est un commentaire JSP, non visible dans la page HTML finale.  --%>
<!-- Ceci est un simple commentaire HTML. -->
<p>Ceci est un simple texte.</p>
<table class="table">
    <td class="table-info">
<a href="${pageContext.request.contextPath}/userList">Person List</a>
    </td>
    <td class="table-active">
<a href="${pageContext.request.contextPath}/register">Cr&eacute;er un compte</a>
    </td>
    <td class="table-warning">
<a href="${pageContext.request.contextPath}/loginPage">Se connecter</a>
    </td>
    <td class="table-warning">
        <a href="${pageContext.request.contextPath}/topo">TOPO</a>
    </td>
</table>
</body>
</html>
