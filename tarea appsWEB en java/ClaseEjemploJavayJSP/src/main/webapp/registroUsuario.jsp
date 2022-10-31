<%--
  Created by IntelliJ IDEA.
  User: Felip
  Date: 28-10-2022
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Registro usuario</title>
</head>
<body>
<h1 class="encabezado"> Registro usuario </h1>
<form action="registroUsuario.jsp" method="post">
    <div class="centrado">
        <label> Nombre:</label>

        <label>
            <input name="nombre" type="text" class="campoTexto">
        </label>

        <label>Edad:</label>

        <label>
            <input name="edad" type="number" class="campoTexto">
        </label>

        <label> Rut:</label>

        <label>
            <input rut="rut" type="text" class="campoTexto">
        </label>

        <br><br>
        <input type="submit" value="enviar" class="boton">
    </div>
</form>
</body>
</html>
