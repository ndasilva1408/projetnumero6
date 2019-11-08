<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>

<body>
<p>
<link type="text/css" rel="stylesheet" href="bootstrap/static.css/navbarstyle.css">
<link type="text/css" rel="stylesheet" href="bootstrap/dist/css/bootstrap.min.css">
    <nav class="navbar navbar-expand-sm bg-dark justify-content-center ">
        <ul class="navbar-nav mr-auto" >
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/index">Accueil </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/memberList">Person List</a>
            </li>

  <c:if test="${sessionScope.login == null}">
        <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/register">Cr&eacute;er un compte</a>
        </li>

        <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/loginPage">Se connecter</a>
        </li>
  </c:if>

            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/regionList">TOPO</a>
            </li>

<c:if test="${!empty sessionScope.login}">
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/newtopo">Rajouter un TOPO</a>
            </li>
</c:if>
        </ul>



    <div >
        <ul class="navbar-nav ml-auto">
        <c:if test="${!empty sessionScope.login}">
    <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/pageperso"> ${sessionScope.login} </a>
    </li>

            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/deconnect"> <u>Se Déconnecter</u> </a>
            </li>

        </c:if>
        </ul>
    </div>

    </nav>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

</body>

