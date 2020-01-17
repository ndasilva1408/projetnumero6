<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" %>

<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>TOPO</title>
    <link rel="stylesheet" type="text/css"
          href="
    ${pageContext.request.contextPath}/bootstrap.min.css"/>
</head>

<header>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</header>

<div class="container">

    <jsp:include page="navbar.jsp"></jsp:include>

    <form action="" method="get">
        <table>
            <tr>
                <td>Recherche:</td>
                <td><input type="text" name="nr"></td>
                <td><input type="submit" value="chercher"></td>
            </tr>
        </table>


    </form>


    <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th class="th-sm">
                <a href="">Nom</a>

            </th>

            <th class="th-sm">Région

            </th>
            <th class="th-sm">Nombre de Topos

            </th>
            <th class="th-sm">Type
            </th>
            <th class="th-sm">Détails
            </th>


        </tr>
        </thead>
        <tbody>

        <c:forEach items="${placeList}" var="place">
            <tr>

                <td>
                        ${place.name}
                </td>


                <td>${place.region}</td>
                <td>${place.topo.size()}</td>
                <td>${place.type}</td>

                <td><a href="detailsPlace?id=${place.id}">Détails</a>
                </td>
                <c:if test="${sessionScope.rang == 'ADMIN'}">
                    <td>
                        <form method="post">
                            <button type="submit" name="button" value="${place.id}"> Supprimer</button>

                        </form>
                    </td>
                </c:if>

            </tr>

        </c:forEach>


        </tbody>
        <tfoot>
        <tr>
            <th>Nom
            </th>
            <th>Région
            </th>
            <th>Nombre de Topos

            </th>
            <th>Type
            </th>
            <th>Détails
            </th>

        </tr>
        </tfoot>

    </table>
    <div>
        <ul class="nav nav-pills">
            <li>

                <c:forEach items="${pages}" var="pa" varStatus="status">
                    <a href="placeList?page=${status.index}">
                        <c:out value="${status.index}"/>
                    </a>
                </c:forEach>

            </li>
        </ul>
    </div>

</div>
