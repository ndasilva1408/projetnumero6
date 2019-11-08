<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>Se connecter</title>
</head>
<body>
<h1>S'identifier</h1>
<form action="Auth_login" method="post">
    <table style="with: 50%">
        <c:if test ="${!empty sessionScope.login}">

                <p>Vous êtes déjà connecté !</p>

            <a href="${pageContext.request.contextPath}index"> <b>Retour Accueil</b> </a>

        </c:if>


        <c:if test ="${empty sessionScope.login}">
        <tr>
            <td>Identifiant</td>
            <td><input type="text" name="login" required="required" /></td>
        </tr>
        <tr>
            <td>Mot de passe</td>
            <td><input type="password" name="password" required="required" /></td>
        </tr>
    </table>
    <input type="submit" value="Se Connecter" /></form>

<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.
token}" />
            </c:if>


<%--Le dernier input permet a Spring d’assurer la securite  de transmission de donnees, de se
proteger de "Cross Site Request Forgery" et de rediriger vers la page demandee apres
connexion--%>

</body>
</html>
