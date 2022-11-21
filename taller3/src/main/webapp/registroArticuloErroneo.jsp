<%--
  Created by IntelliJ IDEA.
  User: Felip
  Date: 18-11-2022
  Time: 2:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Libreria</title>
    <link rel="stylesheet" type="text/css" href="estilos.css">

</head>
<body style="background: url(images/libreria.jpg)" height=100% width=100% id="myimage">

<h1 class="encabezado"> Registro Articulo</h1>

<h2 class="subtitulo">Datos Incorrectos, favor comprobar nuevamente</h2>

<form action="registroLibro" method="post">

    <div class="centrado">

        <br>
        <label class="campoTexto"> Nombre : <c:out value="0"></c:out></label>
        <br>
        <label class="campoTexto"> Categoria : <c:out value="0"></c:out></label>
        <br>
        <label class="campoTexto"> Editorial : <c:out value="0"></c:out></label>
        <br>
        <label class="campoTexto"> Año : <c:out value="0"></c:out></label>
        <br>
        <label class="campoTexto"> Tipo : <c:out value="0"></c:out></label>
        <br>
        <input class="boton" type="submit" value="Enviar">

        <a class="boton" href="/taller3_war_exploded/">Volver</a>

    </div>
</form>

</body>
</html>
