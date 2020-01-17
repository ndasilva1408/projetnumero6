<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>Page Perso de ${sessionScope.login}</title>
</head>

<jsp:include page="navbar.jsp"></jsp:include>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>

<body>
<a><b>Bonjour ${sessionScope.member.login}</b></a>
<p></p>
<p><u>Vos TOPOS:</u></p>
<div>
    <!-- Affichage de tous les TOPOS du membre -->
    <c:forEach var="entry" items="${sessionScope.topo}">
        <div> ${entry.name}</div>
        <div><c:if test="${entry.available == true}">
            <button style="background-color: #1e7e34" type="button">
                Disponible
            </button>
        </c:if>
            <c:if test="${entry.available == false}">
                <p>
                    <button style="background-color: #a71d2a" type="button">
                        Indisponible
                    </button>
                </p>
                </p>
                <form action="pageperso" method="post">
                    <p>
                        <input type="hidden" name="topoName" value="${entry.name}"/>
                        <input type="submit" name="value" value="rendre disponible"/>
                    </p>
                </form>

            </c:if>
        </div>
    </c:forEach>
    <!-- Système d'affichage des demandes de prêt -->
    <c:if test="${sessionScope.demande == true}">

        <form action="pageperso" method="post">
            <c:forEach var="entry" items="${sessionScope.booking}">

                <c:if test="${entry.demandeEnCours == true}">

                    ${entry.booker.login} souhaite emprunter votre exemplaire de "${entry.topo.name}"

                    <input type="hidden" name="topoName" value="${entry.topo.name}"/>
                    <input type="submit" name="value" value="oui"/>

                    <input type="submit" name="value" value="non"/>

                </c:if>

            </c:forEach>

        </form>
    </c:if>

    <!-- Affichage de vos demandes en cours -->

    <c:forEach var="entry" items="${sessionScope.demandBooking}">
        <p>
            <c:if test="${entry.demandeEnCours == true}">
                Votre réservation pour "${entry.topo.name}" est toujours en attente de la réponse de ${entry.owner.login} !

            </c:if>
        </p>

    </c:forEach>


</div>

<a href="${pageContext.request.contextPath}index"> <b>Retour accueil</b> </a>


</body>
</html>
