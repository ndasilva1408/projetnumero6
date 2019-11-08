<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>Page Perso de ${sessionScope.login}</title>
</head>

<jsp:include page="navbar.jsp"></jsp:include>


<body>
<a><b>Bonjour ${sessionScope.login}</b></a>
<p>(Profil Picture)</p>


<p>Messagerie</p>
<p>Modifier informations</p>
<td> <a href="${pageContext.request.contextPath}index"> <b>Retour accueil</b> </a> </td>



</body>
</html>
