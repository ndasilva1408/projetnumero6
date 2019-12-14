<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page pageEncoding="UTF-8" %>

<head>
    <title>Bienvenue</title>

    <link type="text/css" rel="stylesheet" href="bootstrap/dist/css/bootstrap.css">
</head>
<body>
<header>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <jsp:include page="navbar.jsp"></jsp:include>
</header>
<div class="container">
    <div class="col-xs-4 col-sm-3 col-lg-2 ">
        <header class="row">
            <div class="span6 text-center">
                <a class="navbar-brand">

                    <img  src="bootstrap/bankimage/LesAmisDelEscalade.png" style="width:150px" alt="Logo" />

                </a>
            </div>
        </header>
    </div>
</div>


<div class="container">
    <h1>Vous n'êtes pas autorisé a accéder a cette page !</h1>
</div>

</body>

</html>
