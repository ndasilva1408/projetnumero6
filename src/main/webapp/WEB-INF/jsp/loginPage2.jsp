<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    <title>Se connecter</title>
</head>
<body>
<h1>S'identifier</h1>
<div class="panel-body">
    <form action="/login" method="post"> <!--Essayé déjà avec juste login, sans method , avec get etc?-->
        <div class="form-group">
            <label class="custom-control-label">Username</label>
            <input class="form-control" type="text" name="username">
        </div>
        <div class="form-group">
            <label class="custom-control-label">Password</label>
            <input class="form-control" type="password" name="password">
        </div>
        <button class="btn btn-success" type="submit">Login</button>
    </form>


</div>


</body>
</html>
