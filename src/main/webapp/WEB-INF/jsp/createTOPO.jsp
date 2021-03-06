<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <title>Registration Form</title>
</head>
<body>
<header>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</header>
<h1>Register Form</h1>
<form id="topoform" action="savetopo" method="post" >
    <table style="with: 50%">



        <input type="hidden" name="topoOwner" value="${sessionScope.member.login}">



        <tr>
            <td>Nom du lieu</td>

            <td>
                <select name="placeName" >

                    <c:forEach var="entry" items="${placeList}">
                        <option>${entry.name}</option>
                    </c:forEach>
                </select>
            </td>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/newPlace">Ajouter un lieu</a>
            </li>


        </tr>
        <tr>
            <td>Nom du TOPO</td>
            <td>
                <input type="text" name="name"/>
            </td>
        </tr>


    </table>
<p>
    <label for="url">Couverture du TOPO</label>

    <input type="url" name="urlimg" id="url"
           placeholder="http://example.com"
           required
    >
    </p>
<p>
    <tr>
        <td>Date de parution</td>
        <td>
            <input type="text" name="dateDeParution"/>
        </td>
    </tr>
</p>

    <p>
        <TEXTAREA name="description" rows="4" cols="40">Description</TEXTAREA>
        <input type="submit" value="Submit"/>
    </p>


</form>

</body>
</html>
