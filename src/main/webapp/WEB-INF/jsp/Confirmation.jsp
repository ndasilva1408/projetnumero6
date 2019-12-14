<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page pageEncoding="UTF-8" %>

<head>
    <meta content="text/html"; charset="UTF-8" http-equiv="Content-Type">
    <title>Bienvenue</title>
    <link rel="stylesheet" type="text/css"
          href=""${pageContext.request.contextPath}/bootstrap.min.css"/>
</head>
<header>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</header>

<body>
    <div class="container">
        <div class="panel panel-default">
            <div class="panel-heading">Confirmation</div>
            <div class="panel-body">
                <div class="form-group">

                    <p>

                    <label>Login:</label>
                    <label >
                        <% String login = request.getParameter("login"); %>
                        <% out.println(login); %>
                    </label>
                    </p>

                    <p>
                    <label>Date de Naissance:</label>
                    <label >
                        <% String birth_date = request.getParameter("birthDate"); %>
                        <% out.println(birth_date); %>
                    </label>
                    </p>
                    <p>
                    <label>Pr&eacute;nom:</label>
                    <label >
                        <% String first_name = request.getParameter("firstName"); %>
                        <% out.println(first_name); %>
                    </label>
                    </p>
                    <p>
                    <label>Nom:</label>
                    <label >
                        <% String last_name = request.getParameter("lastName"); %>
                        <% out.println(last_name); %>
                    </label>
                    </p>
                    <p>
                    <label>Addresse:</label>
                    <label >
                        <% String address = request.getParameter("address"); %>
                        <% out.println(address); %>
                    </label>
                    </p>
                    <p>
                    <label>Num&eacute;ro de licence:</label>
                    <label >
                        <% String license_number = request.getParameter("licenseNumber"); %>
                        <% out.println(license_number); %>
                    </label>
                    </p>
                    <p>
                    <label>Niveau:</label>
                    <label >
                        ${member.climbingLvl}
                    </label>
                    </p>
                </div>
                 <a href="${pageContext.request.contextPath}index"> <b>Home</b> </a>
        </div>

    </div>
    </div>

</body>
