<%--
  Created by IntelliJ IDEA.
  User: Felip
  Date: 17-11-2022
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Libreria</title>
  <link rel="stylesheet" type="text/css" href="estilos.css">
</head>
<body style="background: url(images/libreria.jpg)" height=100% width=100% id="myimage">

<h1 class="encabezado"> Registro Cliente</h1>

<h2 class="subtitulo">Datos Incorrectos, por favor compruebe nuevamente</h2>

<form action="registroCliente" method="post">

  <div class="centrado">
    <label> Nombre:</label>
    <input name="nombre" type="text" class="campoTexto">
    <label> Rut:</label>
    <input name="rut" type="text" class="campoTexto">
    <label> Correo Electronico:</label>
    <input name="correoElectronico" type="text" class="campoTexto">
    <br><br>
    <input class="boton" type="submit" value="enviar">

    <a class="boton" href="/taller3_war_exploded/">Volver</a>

  </div>
</form>
</body>
</html>
