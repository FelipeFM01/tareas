<%--
  Created by IntelliJ IDEA.
  User: Felip
  Date: 11-11-2022
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Registro libro</title>
</head>
<body>
<h1 class="encabezado"> Registro libro</h1>
<div class="centrado">
    <p class="subtitulo">Registro exitoso</p>
    <br>
    <form action="proceso" method="post">
    <label class="campoTexto"> Nombre : <input type="text" name="nombre"/><c:out value="${libro.getNombre()}"></c:out> </label>
    <br>
    <label class="campoTexto"> Editorial : <input type="text" name="editorial"/><c:out value="${libro.getEditorial()}"></c:out></label>
    <br>
    <form action="cate">
        <%--@declare id="cate"--%><label for="cate">Categorias</label>
        <select name="categorias" id="cate">
            <option value="cientifico">Cientifico</option>
            <option value="literario">Literario</option>
            <option value="biografia">Biografia</option>
            <option value="monografia">Monografia</option>
            <option value="filosofia">Filosofia</option><option value="de viajes">De Viajes</option>
            <option value="ilustrativos">Ilustrativos</option>
            <option value="recreativos">Recreativos</option>
            <option value="poeticos">Poeticos</option>
            <option value="juveniles">Juveniles</option>
            <option value="ficcion">Ficcion</option>
            <option value="comedia">Comedia</option>
            <option value="de texto">De Texto</option>
        </select>

    </form>
    <br>
    <label class="campoTexto"> Año : <input type="text" name="año"/><c:out value="${libro.getAño()}"></c:out></label>
    <br>
    <form>
        <label for="tip">Tipo</label>
        <select name="tipos" id="tip">
            <option value="fisico">Fisico</option>
            <option value="digital">Digital</option>
        </select>
    </form>
    <br>
        <input type="submit" value="Enviar">
        <a class="boton" href="/APPGestionLibros_war_exploded/">Volver</a>
    </form>
</div>

</body>
</html>
