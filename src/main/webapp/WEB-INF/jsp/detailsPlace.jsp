<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" %>

<head>
    <title>Détails voie</title>
    <link rel="stylesheet" type="text/css"
          href="
           ${pageContext.request.contextPath}/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css"
          href="bootstrap/dist/css/pagePlace.css"/>
</head>

<body>
<header>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</header>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-body">
            <div class="form-group">


                <form action="getPlacebyId" method="get">

                    <div class="name" >
                        <h1>
                            <label>
                                ${place.name}

                            </label>
                        </h1>
                    </div>
                    <p>
                    <h2>
                        <label>
                            ${place.region}
                        </label>
                    </h2>

                    </p>
                    <div class="details">
                        <div class="details_txt" style="font-size:1vw">
                            <label>Type:</label>
                            <label>
                                ${place.type}
                            </label>
                        </div>
                        <div class="details_txt" style="font-size:1vw">

                            <label>Hauteur:</label>
                            <label>
                                ${place.height}
                            </label>
                        </div>
                        <div class="details_txt" style="font-size:1vw">
                            <label>Orientation:</label>
                            <label>
                                ${place.orientation}
                            </label>
                        </div>
                        <div class="details_txt" style="font-size:1vw">

                            <label>Nombre de voies:</label>
                            <label>
                                <c:forEach var="entry" items="${place.topo}">
                                    ${entry.climbPathList.size()}
                                </c:forEach>
                            </label>
                        </div>
                    </div>

                    <div class="name">
                        <label>
                            ${place.name}
                        </label>
                    </div>
                    <div class="description">

                        ${place.description}

                        <label>
                            <c:forEach var="entry" items="${place.topo}">
                                <c:forEach var="entry2" items="${entry.climbPathList}">
                                    ${entry2.name},
                                </c:forEach>

                            </c:forEach>
                        </label>

                        <p>
                            <label>
                                ${place.bestMomentToGo}

                            </label>
                        </p>
                        <p>
                            <label>
                                ${place.factToKnow}

                            </label>
                        </p>

                        <c:forEach var="entry" items="${place.topo}">
                        <a href="topoRQPR?id=${entry.id}">
                                ${entry.name} </a>,
                        </c:forEach>


                </form>


            </div>
        </div>

    </div>
</div>

</body>
