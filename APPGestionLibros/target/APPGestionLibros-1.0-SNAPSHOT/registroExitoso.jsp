<%--
  Created by IntelliJ IDEA.
  User: Felip
  Date: 11-11-2022
  Time: 12:05
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
<form action="registroLibro" method="post">
    <div class="centrado">
        <p class="subtitulo">Registro exitoso</p>
        <br>
        <label class="campoTexto"> Nombre : <c:out value="${libro.getNombre()}"></c:out></label>
        <br>
        <label class="campoTexto"> Categoria : <c:out value="${libro.getCategoria()}"></c:out></label>
        <br>
        <label class="campoTexto"> Editorial : <c:out value="${libro.getEditorial()}"></c:out></label>
        <br>
        <label class="campoTexto"> Año : <c:out value="${libro.getAño()}"></c:out></label>
        <br>
        <label class="campoTexto"> Tipo : <c:out value="${libro.getTipo()}"></c:out></label>

        <try>
            <c:catch>Ingresado Correctamente<a class="boton" href="/APPGestionLibros_war_exploded/">Volver</a></c:catch>
        </try>



    </div>
</form>
</body>
</html>

