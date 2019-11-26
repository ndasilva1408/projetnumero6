<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" %>

<head>
    <title>${topo.place}</title>
    <link rel="stylesheet" type="text/css"
          href="
           ${pageContext.request.contextPath}/bootstrap.min.css"/>
</head>

<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">TOPO n°${topo.id}</div>
        <div class="panel-body">
            <div class="form-group">

                <c:if test="${sessionScope.role == 'Admin' || sessionScope.role == 'Membre'}">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/createClimbPath">Ajouter une
                            voie </a>
                    </li>
                    <c:if test="${topo.officiel == false}">
                        <form action="topoRQPR" method="post">
                            <input type="hidden" name="topoName" value="${topo.name}"/>
                            <input type="submit" value="Officiel" name="Officiel"/>
                        </form>
                    </c:if>
                </c:if>

                <form action="getTopoById" method="get">


                    <p>
                        <label>Titre:</label>
                        <label>
                            ${topo.name}

                        </label>
                    </p>
                    <p>
                        <label>Nom du Lieu:</label>
                        <label>
                            ${topo.place.name}
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


                                <c:if test="${sessionScope.role == 'Admin' || sessionScope.role == 'Membre'}">


                                    <c:forEach var="entry" items="${topo.member}">
                                        <div>

                                            <a href="detailsBooking?id=${entry.id}&topo.id=${topo.id}">Réservez auprès
                                                de ${entry.login}</a>

                                        </div>
                                    </c:forEach>

                                </c:if>
                            </c:if>


                            <c:if test="${topo.available == false}">
                                Tuto Indisponible
                            </c:if>

                        </label>


                    </p>

                    <p>

                        <img src="${topo.urlimg}" alt="Pas d'image disponible"/>
                    </p>

                    <p>
                        <c:forEach var="entry" items="${topo.noteList}">
                    <div> ${entry.text}</div>
                    <div>${entry.member.login}</div>
                    </c:forEach>

                    </p>


                </form>
                <c:if test="${sessionScope.role == 'Admin' || sessionScope.role == 'Membre'}">


                    <form action="addComment" method="post">
                        <input type="hidden" name="topoId" value="${topo.id}">
                        <label for="comments">Donnez nous vos impressions :</label>
                        <textarea id="comments" name="comments" maxlength="255">
                        </textarea>
                        <button type="submit" name="login" value="${sessionScope.member.login}"> Enregistrer</button>
                    </form>


                </c:if>
                <c:if test="${topo.officiel == true}">
                    « Officiel Les amis de l’escalade »

                </c:if>

            </div>
        </div>

    </div>
</div>

</body>
