<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" %>

<head>
    <title>Nos regions</title>
    <link rel="stylesheet" type="text/css"
          href="
    ${pageContext.request.contextPath}/bootstrap.min.css"/>

</head>
<header>
    <jsp:include page="navbar.jsp"></jsp:include>
</header>
<body>
<div class="container">
<form>
    <select class="goto chosen-select" data-placeholder="Département">
        <option>Département</option>
        <option class="even first" onclick="window.location.href='site-escalade-alpes-de-haute-provence'">
            Alpes-de-Haute-Provence
        </option>
        <option class="odd" onclick="window.location.href='site-escalade-alpes-maritimes'">Alpes-Maritimes</option>
        <option class="even" onclick="window.location.href='site-escalade-ardeche'">Ardèche</option>
        <option class="odd" onclick="window.location.href='site-escalade-ariege'">Ariège</option>
        <option class="even" onclick="window.location.href='site-escalade-aude'">Aude</option>
        <option class="odd" onclick="window.location.href='site-escalade-auvergne'">Auvergne</option>
        <option class="even" onclick="window.location.href='site-escalade-aveyron'">Aveyron</option>
        <option class="odd" onclick="window.location.href='site-escalade-bas-rhin'">Bas-Rhin</option>
        <option class="even" onclick="window.location.href='site-escalade-bouches-du-rhone'">Bouches-du-Rhône</option>
        <option class="odd" onclick="window.location.href='site-escalade-bourgogne'">Bourgogne</option>
        <option class="even" onclick="window.location.href='site-escalade-charente'">Charente</option>
        <option class="odd" onclick="window.location.href='site-escalade-corse-du-sud'">Corse-du-Sud</option>
        <option class="even" onclick="window.location.href='site-escalade-cotes-armor'">Côtes-d’Armor</option>
        <option class="odd" onclick="window.location.href='site-escalade-doubs'">Doubs</option>
        <option class="even" onclick="window.location.href='site-escalade-drome'">Drôme</option>
        <option class="odd" onclick="window.location.href='site-escalade-finistere'">Finistère</option>
        <option class="even" onclick="window.location.href='site-escalade-gard'">Gard</option>
        <option class="odd" onclick="window.location.href='site-escalade-haut-rhin'">Haut-Rhin</option>
        <option class="even" onclick="window.location.href='site-escalade-haute-corse'">Haute-Corse</option>
        <option class="odd" onclick="window.location.href='site-escalade-haute-marne'">Haute-Marne</option>
        <option class="even" onclick="window.location.href='site-escalade-haute-savoie'">Haute-Savoie</option>
        <option class="odd" onclick="window.location.href='site-escalade-hautes-alpes'">Hautes-Alpes</option>
        <option class="even" onclick="window.location.href='site-escalade-hautes-pyrenees'">Hautes-Pyrénées</option>
        <option class="odd" onclick="window.location.href='site-escalade-herault'">Hérault</option>
        <option class="even" onclick="window.location.href='site-escalade-isere'">Isère</option>
        <option class="odd" onclick="window.location.href='site-escalade-jura'">Jura</option>
        <option class="even" onclick="window.location.href='site-escalade-loire-atlantique'">Loire-Atlantique</option>
        <option class="odd" onclick="window.location.href='site-escalade-lot'">Lot</option>
        <option class="even" onclick="window.location.href='site-escalade-lozere'">Lozère</option>
        <option class="odd" onclick="window.location.href='site-escalade-marne'">Marne</option>
        <option class="even" onclick="window.location.href='site-escalade-meuse'">Meuse</option>
        <option class="odd" onclick="window.location.href='site-escalade-moselle'">Moselle</option>
        <option class="even" onclick="window.location.href='site-escalade-pyrenees-atlantiques'">Pyrénées-Atlantiques</option>
        <option class="odd" onclick="window.location.href='site-escalade-pyrenees-orientales'">Pyrénées-Orientales</option>
        <option class="even" onclick="window.location.href='site-escalade-savoie'">Savoie</option>
        <option class="odd" onclick="window.location.href='site-escalade-seine-et-marne'">Seine-et-Marne</option>
        <option class="even" onclick="window.location.href='site-escalade-tarn-et-garonne'">Tarn-et-Garonne</option>
        <option class="odd" onclick="window.location.href='site-escalade-var'">Var</option>
        <option class="even" onclick="window.location.href='site-escalade-vaucluse'">Vaucluse</option>
        <option class="odd" onclick="window.location.href='site-escalade-yonne'">Yonne</option>
        <option class="even currentPage last" onclick="window.location.href='site-escalade-yvelines'">Yvelines</option>
    </select>
</form>

<h3>Tous les sites d'escalade</h3>
<p>Accédez à la liste des sites d'escalade que nous avons répertoriés pour vous.</p>

<table  id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th class="th-sm">
           Départements
        </th>
        <th class="th-sm">Param Name

        </th>

        <th class="th-sm">Détails
        </th>

    </tr>
    </thead>
<c:forEach  items="${topoList}" var ="topo">
    <tr>
        <td>${topo.region}</td>

        <td>${topo.place}</td>

        <td>
            <a href="topoRQPR?id=${topo.id}">
                Details
            </a>
        </td>
        <c:if test="${sessionScope.role == 'Admin'}">
            <td>
                <form  method="post">
                    <button type="submit" name="button"  value="${topo.id}"> Supprimer </button>

                </form>
            </td>
        </c:if>

    </tr>

</c:forEach>
</table>
</div>
</body>



