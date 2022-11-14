<%--
  Created by IntelliJ IDEA.
  User: Felip
  Date: 11-11-2022
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro libro</title>
    <link rel="stylesheet" type="text/css" href="estilos.css">
</head>
<body>
<h1 class="encabezado"> Registro libro</h1>
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
        <a class="boton" href="/APPGestionLibros_war_exploded/">Volver</a>
    </div>
</form>
</body>
</html>