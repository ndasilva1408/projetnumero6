<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" %>

<head>
    <title>Détails voie</title>
    <link type="text/css" rel="stylesheet" href="bootstrap/dist/css/bootstrap.min.css">
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


                <div action="getPlacebyId" method="get">

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
                    <div  class="d-flex flex-row bd-highlight mb-3" >
                        <div  class="p-2 bd-highlight" >
                            <div  class="details_txt">
                            <label>Type:</label>
                            <label>
                                ${place.type}
                            </label>
                            </div>
                        </div>
                        <div  class="p-2 bd-highlight" >
                            <div  class="details_txt">

                            <label>Hauteur:</label>
                            <label>
                                ${place.height}
                            </label>
                            </div>
                        </div>
                        <div  class="p-2 bd-highlight">
                            <div  class="details_txt">
                            <label>Orientation:</label>
                            <label>
                                ${place.orientation}
                            </label>
                            </div>
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
                            <h2>Quand y aller? </h2>
                            <label>
                                Période idéale: ${place.bestMomentToGo}

                            </label>
                        </p>
                        <p>
                            <h2>A savoir</h2>
                            <label>
                                ${place.factToKnow}

                            </label>
                        </p>


                            <h2>Topos à ${place.name}</h2>

                        <c:forEach var="entry" items="${place.topo}">
                        <a href="topoRQPR?id=${entry.id}">
                                ${entry.name} </a>,
                        </c:forEach>


                </div>


            </div>
        </div>

    </div>
</div>

</body>
