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
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Libreria</title>
</head>
<body style="background: url(images/libreria.jpg)" height=100% width=100% id="myimage">

<h1 class="encabezado"> Registro Cliente</h1>

<form action="registroCliente.jsp" method="post">

    <div class="centrado">

        <label id="no" class="campoTexto"> Nombre : <input type="text" name="nombre"/><c:out value="${cliente.getNombre()}"></c:out> </label>
        <br>
        <label id="ru" class="campoTexto"> Rut : <input type="text" name="rut"/><c:out value="${cliente.getRut()}"></c:out> </label>
        <br>
        <label id="ce" class="campoTexto"> Correo Electronico : <input type="text" name="correoElectronico"/><c:out value="${cliente.getCorreoElectronico()}"></c:out> </label>
        <br><br>
        <input type="submit" value="enviar" href="registroClienteExitoso.jsp" class="boton">
    </div>
    <a class="boton" href="/taller3_war_exploded/">Volver</a>
</form>

</body>
</html>
