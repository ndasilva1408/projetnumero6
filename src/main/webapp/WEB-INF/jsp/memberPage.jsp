<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<p>Affichage des topos du membre
<div>

    <c:forEach var="entry" items="${sessionScope.topo}">
      <div> ${entry.name}</div>
        <div><c:if test="${entry.available == true}">
           <button style="background-color: #1e7e34" type="button">
               Disponible</button>
        </c:if>
            <c:if test="${entry.available == false}">
            <button style="background-color: #a71d2a" type="button">
                Indisponible
            </c:if>
        </div>

</c:forEach>
</div>
</p>

<p>Messagerie</p>
<p>Modifier informations</p>
<td> <a href="${pageContext.request.contextPath}index"> <b>Retour accueil</b> </a> </td>



</body>
</html>
