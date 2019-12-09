
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page pageEncoding="UTF-8" %>

<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>TOPO</title>
    <link rel="stylesheet" type="text/css"
          href=""${pageContext.request.contextPath}/bootstrap.min.css"/>
</head>

<div class="container">
    <h3>Nos TOPOS</h3>

    <jsp:include page="navbar.jsp"></jsp:include>

    <form action="" method="get">
        <table>
            <tr>
                <td>Mot Clé:</td>
                <td> <input type="text" name="mc"></td>
                <td> <input type="submit" value="chercher"></td>
            </tr>
        </table>
    </form>


    <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%" >
        <thead>
        <tr>
            <th class="th-sm">
                <a href="">Lieu</a>

            </th>

            <th class="th-sm">Région

            </th>
            <th class="th-sm">Détails
            </th>



        </tr>
        </thead>
        <tbody>

        <c:forEach  items="${topoList}" var ="topo">
            <tr>
                <td>${topo.place.name}</td>

                <td>${topo.name}</td>

                <td>
                    <a href="topoRQPR?id=${topo.id}">
                        Details
                    </a>
                </td>
                <c:if test="${sessionScope.rang == 'ADMIN'}">
                    <td>
                        <form  method="post">
                            <button type="submit" name="button"  value="${topo.id}"> Supprimer </button>

                        </form>
                    </td>
                </c:if>

            </tr>

        </c:forEach>


        </tbody>
        <tfoot>
        <tr>
            <th>Lieu
            </th>
            <th>Région
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
                    <a href="regionList?page=${status.index}">
                    <c:out value="${status.index}"/>
                    </a>
                </c:forEach>

            </li>
        </ul>
    </div>

</div>