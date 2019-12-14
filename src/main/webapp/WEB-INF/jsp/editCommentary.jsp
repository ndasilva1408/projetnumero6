<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" %>

<head>
    <title>Editer un commentaire</title>
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


                <form action="newEdit" method="post">

                    <label for="newComment">Nouveau commentaire:</label>
                    <input type="hidden" name="noteId" value="${note.id}"/>
                    <input type="hidden" name="editor" value="${member.id}">
                    <input type="text" id="newComment" name="newComment"
                           size="200" height="150">
                    <p>Ancien commentaire :</p>

                    <p>${note.text}</p>
                    <input type="submit" name="Valider">


                </form>


            </div>
        </div>

    </div>
</div>

</body>
