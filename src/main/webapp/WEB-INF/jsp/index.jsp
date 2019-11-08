<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page pageEncoding="UTF-8" %>

<head>
    <title>Bienvenue</title>

    <link type="text/css" rel="stylesheet" href="bootstrap/dist/css/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="bootstrap/static.css/indexstyle.css">
</head>
<body>
<header>

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
<p> <b> Pour les non-initiés, voici quelques éléments du vocabulaire du grimpeur : </b></p>

<ul>
    <li>Un site ou spot, c’est un lieu où il est possible de grimper.</li>
    <li>Les sites peuvent être découpés en plusieurs secteurs qui regroupent un ensemble de voies.</li>
    <li>« Lao Tzeu l'a dit : il faut trouver la voie » : c’est le chemin à emprunter par le grimpeur pour arriver à destination : le haut de la voie.</li>
    <li>si la voie est découpée en plusieurs « parties » à grimper les unes après les autres, ces parties s’appellent des longueurs et on trouve un relai en haut de chaque longueur.</li>
    <li>Quand le grimpeur arrive en haut de la longueur, c’est à ce relai qu’il se vache, c’est à dire qu’il s’y accroche, à l’aide de sa vache ou longe (corde nouée sur le baudrier du grimpeur et équipée d’un mousqueton à verrouillage).</li>
    <li>Les points ou spits sont des ancrages fixes que l’on trouve dans les voies dites « équipées » et qui permettent au grimpeur de s’assurer au fur et à mesure de sa progression, à l’aide de dégaines</li>
    <li>La cotation d’une longueur ou d’une voie, représente sa difficulté. En France, le système de cotation va, en gros, par ordre croissant de difficulté, de 3 à 9c. Le chiffre est en quelque sorte, l’unité principale et la lettre une sous-unité (de « a » à « c »)</li>
    <li>Un topo est un recueil contenant toutes les informations utiles sur les sites d’escalade d’une région (les secteurs, les voies, leur hauteur, leur cotation, le nombre de points…). Une bible quoi !</li>
</ul>
</div>

</body>

</html>
