<%--
  Created by IntelliJ IDEA.
  User: Felip
  Date: 17-11-2022
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="estilos.css">
  <title>Libreria</title>
</head>
<body style="background: url(images/libreria.jpg)" height=100% width=100% id="myimage">

<h1 class="encabezado"> Registro Cliente</h1>
<h2 class="subtitulo">Registro Exitoso </h2>

<form action="registroCliente" method="post">


<div class="centrado">
  <p class="subtitulo">Registro exitoso</p> <br>
  <label class="campoTexto"> Usuario : <c:out value="${cliente.getNombre()}"></c:out> </label>
  <br>
  <label class="campoTexto">Rut : <c:out value="${cliente.getRut()}"></c:out></label>
  <br>
  <label class="campoTexto">Correo Electronico : <c:out value="${cliente.getCorreoElectronico()}"></c:out></label>

  <a class="boton" href="/taller3_war_exploded/">Volver</a>

</div>
</form>
</body>
</html>
