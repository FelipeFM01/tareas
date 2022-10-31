<%--
  Created by IntelliJ IDEA.
  User: Felip
  Date: 30-10-2022
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro usuario</title>
    <link rel="stylesheet" type="text/css" href="estilos.css">

</head>
<body>
<h1 class="encabezado"> Registro usuario </h1>
<h2 class="subtitulo">Datos incorrectos, favor comprobar nuevamente</h2>
<form action="registroErroneo.jsp" method="post">
    <div class="centrado">
        <label> Nombre:</label>

        <label>
            <input name="nombre" type="text" class="campoTexto" >
        </label>

        <label>Edad:</label>

        <label>
            <input name="edad" type="number" class="campoTexto" >
        </label>

        <label> Rut:</label>

        <label>
            <input rut="rut" type="text" class="campoTexto" >
        </label>

        <br><br>
        <input class="boton" type="submit" value="enviar" >
    </div>
</form>
</body>
</html>
