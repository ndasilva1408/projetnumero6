
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <title>Nouveau site d'escalade</title>
</head>
<body>
<header>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</header>
<h1>Nouveau site d'escalade</h1>
<form id="topoform" action="saveplace" method="post" >
    <table style="with: 50%">
        <tr>
            <td>Nom du lieu</td>
            <td> <input type="text" name="name"/></td>
        </tr>

        <tr>
            <td>Type</td>
            <td>   <form>
                <select type="text" name="type">
                    <option>falaise</option>
                    <option>bloc</option>
                    <option>falaise,bloc</option>
                </select>
            </form></td>
        </tr>
        <tr>
            <td>Region</td>
            <td> <input type="text" name="region"/></td>
        </tr>

        <tr>
            <td>Hauteur</td>
            <td> <input type="text" name="height"/></td>
        </tr>

        <tr>
            <td>A savoir</td>
            <td> <input type="text" name="factToKnow"/></td>
        </tr>

        <tr>
            <td>Meilleur moment pour s'y rendre</td>
            <td> <input type="text" name="bestMomentToGo"/></td>
        </tr>

        <tr>
            <td>Orientation</td>
            <td>   <form>
                <select type="text" name="orientation">
                    <option>N</option>
                    <option>NE</option>
                    <option>E</option>
                    <option>SE</option>
                    <option>S</option>
                    <option>SW</option>
                    <option>W</option>
                    <option>NW</option>
                </select>
            </form></td>
        </tr>



    </table>

    <label for="url">Photos du site</label>

    <input type="url" name="urlimg" id="url">

    <tr>
        <p>
            <TEXTAREA name="description" rows="4" cols="40">Description</TEXTAREA>
            <input type="submit" value="Submit"/>
        </p>
    </tr>



</form>



</body>
</html>
