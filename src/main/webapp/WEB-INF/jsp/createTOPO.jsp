
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <title>Registration Form</title>
</head>
<body>
<h1>Register Form</h1>
<form id="topoform" action="savetopo" method="post"  enctype="multipart/form-data" target="_blank">
    <table style="with: 50%">






        <tr>
            <td>Nom du lieu</td>

      <td>


        <select name="name">
            <option class="even first" value="Alpes-de-Haute-Provence">Alpes-de-Haute-Provence</option>
            <option class="odd" >Alpes-Maritimes</option>
            <option class="even">Ardèche</option>
            <option class="odd" >Ariège</option>
            <option class="even">Aude</option>
            <option class="odd" >Auvergne</option>
            <option class="even" >Aveyron</option>
            <option class="odd" >Bas-Rhin</option>
            <option class="even" >Bouches-du-Rhône</option>
            <option class="odd" >Bourgogne</option>
            <option class="even" >Charente</option>
            <option class="odd" >Corse-du-Sud</option>
            <option class="even">Côtes-d’Armor</option>
            <option class="odd" >Doubs</option>
            <option class="even" >Drôme</option>
            <option class="odd" >Finistère</option>
            <option class="even">Gard</option>
            <option class="odd">Haut-Rhin</option>
            <option class="even" >Haute-Corse</option>
            <option class="odd" >Haute-Marne</option>
            <option class="even" >Haute-Savoie</option>
            <option class="odd" >Hautes-Alpes</option>
            <option class="even" >Hautes-Pyrénées</option>
            <option class="odd" >Hérault</option>
            <option class="even" >Isère</option>
            <option class="odd" >Jura</option>
            <option class="even">Loire-Atlantique</option>
            <option class="odd" >Lot</option>
            <option class="even" >Lozère</option>
            <option class="odd" >Marne</option>
            <option class="even" >Meuse</option>
            <option class="odd" >Moselle</option>
            <option class="even" >Pyrénées-Atlantiques</option>
            <option class="odd">Pyrénées-Orientales</option>
            <option class="even" >Savoie</option>
            <option class="odd" >Seine-et-Marne</option>
            <option class="even" >Tarn-et-Garonne</option>
            <option class="odd" >Var</option>
            <option class="even" >Vaucluse</option>
            <option class="odd" >Yonne</option>
            <option class="even currentPage last">Yvelines</option>
        </select>
      </td>

        </tr>



    </table>

    <label for="url">Photos du site</label>

    <input type="url" name="urlimg" id="url"
       placeholder="http://example.com"
           required
           >


<p>
    <TEXTAREA  name="description"  rows="4" cols="40">Description</TEXTAREA>
    <input type="submit" value="Submit" />
</p>
</form>

</body>
</html>
