<%--
  Created by IntelliJ IDEA.
  User: Felip
  Date: 17-11-2022
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Libreria</title>
    <link rel="stylesheet" type="text/css" href="estilos.css">

</head>
<body style="background: url(images/libreria.jpg)" height=100% width=100% id="myimage">

<h1 class="encabezado"> Registro Articulos</h1>
<div class="centrado">
    <br>
    <form action="registroArticulo.jsp" method="post">

<label class="campoTexto"> Nombre de Articulo : <input type="text" name="nombreArticulo"/><c:out value="${articulo.getNombreArticulo()}"></c:out></label>
<br>
<label class="campoTexto"> Tipo de Articulo : <input type="text" name="tipoArticulo"/><c:out value="${articulo.getTipoArticulo()}"></c:out></label>

<select name="tipo" id="tipo">
    <option value="cuadernos">Cuaderno</option>
    <option value="lapices">Lapiz</option>
    <option value="libros">Libro</option>
</select>
<br>
<label class="campoTexto"> Codigo del articulo seleccionado: <input type="text" name="codigo"/><c:out value="${articulo.getCodigo()}"></c:out></label>
        <select name="codAr" id="codAr">
            <option value="0001">0001 (Cuaderno)</option>
            <option value="0002">0002 (Lapiz)</option>
            <option value="0003">0003 (Libro)</option>
        </select>
        <br>
        <br>
        <label class="campoTexto"> Peso ( en [kg] ): <input type="text" name="peso"/><c:out value="${articulo.getPeso()}"></c:out></label>
        <br>
        <br>
        <label class="campoTexto"> Año : <input type="text" name="año"/><c:out value="${libro.getAño()}"></c:out></label>
        <br>
        <input type="submit" value="enviar" href="registroArticuloExitoso.jsp" class="boton">
        <a class="boton" href="/taller3_war_exploded/">Volver</a>
</form>
</div>
</body>
</html>
