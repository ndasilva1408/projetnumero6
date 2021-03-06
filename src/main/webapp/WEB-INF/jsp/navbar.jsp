<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>

<body>

<p>
    <link type="text/css" rel="stylesheet" href="bootstrap/dist/css/bootstrap.min.css">
    <nav class="navbar navbar-expand-sm bg-dark justify-content-center ">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/index">Accueil </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/memberList">Liste des Membres</a>
            </li>

            <c:if test="${sessionScope.member.login == null}">
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/register">Cr&eacute;er un compte</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/login">Se connecter</a>
                </li>
            </c:if>

            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/regionList">Topo</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/placeList">Lieux</a>
            </li>

            <c:if test="${!empty sessionScope.member.login}">
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/newPlace">Ajouter un lieu</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/newtopo">Ajouter un TOPO</a>
                </li>
            </c:if>
        </ul>


        <div>
            <ul class="navbar-nav ml-auto">
                <c:if test="${!empty sessionScope.member.login}">
                    <li class="nav-item">
                        <a class="nav-link"
                           href="${pageContext.request.contextPath}/pageperso"> ${sessionScope.member.login} </a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/logout"> <u>Se Déconnecter</u> </a>
                    </li>

                </c:if>
            </ul>
        </div>

    </nav>


</body>

