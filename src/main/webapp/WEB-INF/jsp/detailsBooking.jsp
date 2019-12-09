
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" %>

<head>
    <title>Détails booking</title>
    <link rel="stylesheet" type="text/css"
          href="
           ${pageContext.request.contextPath}/bootstrap.min.css"/>
</head>

<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-body">
            <div class="form-group">


                <form action="getBookingId" method="get">

                    <p>
                        <label>Nom du propriétaire:</label>
                        <label>
                            ${topoOwner.login}
                        </label>
                    </p>
                </form>
                
                <form action="demandBooking" method="post">
                    <input type="hidden" name="topoOwner" value="${topoOwner.login}">
                    <input type="hidden" name="topoId" value="${topo.id}">
                    <button type="submit" name="booker" value="${sessionScope.member.login}"> Réserver</button>
                </form>
                



            </div>
        </div>

    </div>
</div>

</body>



