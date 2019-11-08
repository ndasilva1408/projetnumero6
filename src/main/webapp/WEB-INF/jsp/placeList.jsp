
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
    <h3>Liste des lieux d'escalade</h3>

    <jsp:include page="navbar.jsp"></jsp:include>

    <form action="" method="post">
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

            <th class="th-sm">TOPOS

            </th>




        </tr>
        </thead>
        <tbody>

        <c:forEach  items="${placeList}" var ="place">
            <tr>
                <td>${place.name}</td>

                <td>
                    <a href="topoRQPR?id=${place.id}">
                        TOPOS
                    </a>
                </td>
                <c:if test="${sessionScope.role == 'Admin'}">
                    <td>
                        <form  method="post">
                            <button type="submit" name="button"  value="${place.id}"> Supprimer </button>

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
            <th>TOPOS
            </th>

        </tr>
        </tfoot>

    </table>

</div>
