<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" %>

<head>
    <link rel="stylesheet" type="text/css"
          href="bootstrap/dist/css/pagePresentation.css"/>

    <link type="text/css" rel="stylesheet" href="bootstrap/dist/css/bootstrap.css">
</head>

<body>
<header>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</header>
<div id="container">

    <div class="panel-heading">
        <label>"${topo.name}" (Edition du: ${topo.dateDeParution})</label>
    </div>
    <div class="panel-body">

        <form action="getTopoById" method="get">
            <div class="zone-texte">
                <p class="Lieu">
                    <label>Nom du Lieu:</label>
                    <label>
                        <c:forEach  var ="entry" items="${topo.place}">
                            <div><a href="detailsPlace?id=${entry.id}">${entry.name}</a></div>
                        </c:forEach>
                    </label>
                </p>

                <p>
                    <label>Description du lieu:</label>
                    <label>
                        ${topo.description}
                    </label>
                </p>


                <p>
                    <c:forEach var="entry" items="${topo.climbPathList}">
                <div> ${entry.name}</div>
                <div><a href="detailsClimbPath?id=${entry.id}">Détails</a></div>
                </c:forEach>

                </p>

                <p>
                    <label>
                        <c:if test="${topo.available == true}">
                            Disponible

                            <c:if test="${sessionScope.rang == 'ADMIN' || sessionScope.rang == 'MEMBRE' || sessionScope.rang == 'INVITE'}">


                                <c:forEach var="entry" items="${topo.member}">
                                    <c:if test="${sessionScope.member.login != entry.login}">
                                    <div>

                                        <a href="detailsBooking?id=${entry.id}&topo.id=${topo.id}">Réservez auprès
                                            de ${entry.login} </a>

                                    </div>
                                    </c:if>
                                    <c:if test="${sessionScope.member.login == entry.login}">
                                        <a class="nav-link" href="${pageContext.request.contextPath}/createClimbPath">Ajouter
                                            une voie </a>
                                    </c:if>
                                </c:forEach>

                            </c:if>
                        </c:if>


                        <c:if test="${topo.available == false}">
                            Topo Indisponible
                        </c:if>

                    </label>


                </p>
            </div>

            <div class="imgTopo">

                <img src="${topo.urlimg}" alt="Pas d'image disponible"/>
            </div>

            <p>
        </form>

        <c:forEach var="entry" items="${topo.noteList}">
            <div class="commentary">

                <div class="text"> "${entry.text}"
                </div>
                <div class="auteur"><b>${entry.member.login}</b></div>
                <c:if test="${sessionScope.rang == 'ADMIN' || sessionScope.rang == 'MEMBRE' }">

                    <a class="btn btn-default btn-lg active" role="button"

                       href="${pageContext.request.contextPath}/editCommentary?id=${entry.id}&memberId=${sessionScope.member.login}">Edit</a>

                    <form action="deleteCommentary" method="post">
                        <button type="submit" name="button" value="${entry.id}"> Supprimer</button>
                    </form>
                </c:if>

            </div>
        </c:forEach>


        </p>


        <c:if test="${sessionScope.rang == 'ADMIN' || sessionScope.rang == 'MEMBRE' || sessionScope.rang == 'INVITE'}">


            <form action="addComment" method="post">
                <input type="hidden" name="topoId" value="${topo.id}">
                <label for="comments">Donnez nous vos impressions :</label>
                <textarea id="comments" name="comments" maxlength="255">
                        </textarea>
                <button type="submit" name="login" value="${sessionScope.member.login}"> Enregistrer</button>
            </form>


        </c:if>
        <c:if test="${topo.officiel == true}">
            <p>« Officiel Les amis de l’escalade »</p>
            <img src="bootstrap/bankimage/LesAmisDelEscalade.png" style="width:150px" alt="Logo"/>

        </c:if>

        <c:if test="${sessionScope.rang == 'ADMIN' || sessionScope.rang == 'MEMBRE' }">

            <c:if test="${topo.officiel == false}">
                <form action="topoRQPR" method="post">
                    <input type="hidden" name="topoName" value="${topo.name}"/>
                    <input type="submit" value="Officiel" name="Officiel"/>
                </form>
            </c:if>
        </c:if>


    </div>

</div>
</div>

</body>
