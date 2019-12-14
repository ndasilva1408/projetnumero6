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
</head>

<body>
<header>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</header>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-body">
            <div class="form-group">


                <form action="getClimbPathbyId" method="get">

                    <p>
                        <label>Nom de la voie:</label>
                        <label>
                            ${climbPath.name}

                        </label>
                    </p>
                    <p>
                        <label>Difficulté:</label>
                        <label>
                            ${climbPath.lvl}
                        </label>
                    </p>

                </form>


            </div>
        </div>

    </div>
</div>

</body>
