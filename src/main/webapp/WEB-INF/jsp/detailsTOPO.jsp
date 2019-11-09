
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page pageEncoding="UTF-8" %>

<head>
    <title>${topo.place}</title>
    <link rel="stylesheet" type="text/css"
          href=""${pageContext.request.contextPath}/bootstrap.min.css"/>
</head>

<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">TOPO n°${topo.id}</div>
        <div class="panel-body">
            <div class="form-group">

                <form action="getTopoById" method="get">


                    <p>
                        <label>Region:</label>
                        <label >
                            ${topo.name}
                        </label>
                    </p>
                    <p>
                        <label>Nom du Lieu:</label>
                        <label >
                            ${topo.place}
                        </label>
                    </p>

                    <p>
                        <label>Description du lieu:</label>
                        <label >
                            ${topo.description}
                        </label>
                    </p>

                    <p>
                        <label >
                            <c:if test="${topo.available == true}">
                            Disponible
                            </c:if>
                            <c:if test="${topo.available == false}">
                             Tuto Indisponible
                            </c:if>
                        </label>
                    </p>

                    <p>

                        <img src="${topo.urlimg}" alt="Pas d'image disponible" />
                    </p>

                    <p>
                        <c:forEach var="entry" items="${topo.noteList}">
                            ${entry}
                        </c:forEach>

                    </p>


                </form>
                <c:if test="${sessionScope.role == 'Admin' || sessionScope.role == 'Membre'}">


                    <form action="addComment" method="post" >
                        <input type="hidden" name="topoId" value="${topo.id}">
                        <label for="comments">Donnez nous vos impressions :</label>
                        <textarea id="comments" name="comments" maxlength="255">
                        </textarea>
                        <button type="submit"  name="login" value="${sessionScope.login}"> Enregistrer </button>
                    </form>
                </c:if>

            </div>
        </div>

    </div>
</div>

</body>
