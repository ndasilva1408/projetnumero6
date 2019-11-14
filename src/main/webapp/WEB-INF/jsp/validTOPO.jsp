
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page pageEncoding="UTF-8" %>

<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>Bienvenue</title>
    <link rel="stylesheet" type="text/css"
          href=""${pageContext.request.contextPath}/bootstrap.min.css"/>
</head>

<body>
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">Confirmation</div>
        <div class="panel-body">
            <div class="form-group">

                <form action="validtopo" method="post">
                <p>
                <label>ID:</label>
                <label >
                    <% String id = request.getParameter("id"); %>
                    <% out.println(id); %>
                </label>
                </p>

                <p>
                <label>Titre:</label>
                <label >
                    <% String name = request.getParameter("name"); %>
                    <% out.println(name); %>
                </label>
                </p>
                <p>
                <label>Nom du Lieu:</label>
                <label >
                   ${topo.place.name}
                </label>
                </p>

                <p>
                <label>Description du lieu:</label>
                <label >
                    <% String description = request.getParameter("description"); %>
                    <% out.println(description); %>
                </label>
                </p>

                <p>
                <label >
                  TOPO : Disponible
                </label>
                </p>
                <p>
                <%String urlimg = request.getParameter("urlimg");%>
                <img src="<%out.println(urlimg);%>" alt="Camarchepas" />
                </p>

                <input type="submit" value="Valider" />
                </form>

            </div>
        </div>

    </div>
</div>

</body>
