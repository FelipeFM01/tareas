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
<a class="boton" href="/taller3_war_exploded/">Volver</a>

h1 class="encabezado"> Registro Articulo </h1>
<h2 class="subtitulo"> Registro Exitoso </h2>

<form action="registroArticulo.jsp" method="post">


    <div class="centrado">

        <label class="campoTexto"> Nombre de Articulo : <input type="text" name="nombreArticulo"/><c:out value="${articulo.getNombreArticulo()}"></c:out></label>
        <br>
        <label class="campoTexto"> Tipo de Articulo : <input type="text" name="tipoArticulo"/><c:out value="${articulo.getTipoArticulo()}"></c:out></label>
        <br>
        <label class="campoTexto"> Codigo del articulo seleccionado: <input type="text" name="codigo"/><c:out value="${articulo.getCodigo()}"></c:out></label>
        <br>
        <label class="campoTexto"> Peso ( en [kg] ): <input type="text" name="peso"/><c:out value="${articulo.getPeso()}"></c:out></label>
        <br>
        <label class="campoTexto"> Año : <input type="text" name="año"/><c:out value="${libro.getAño()}"></c:out></label>
        <br>


        <a class="boton" href="/taller3_war_exploded/">Volver</a>

    </div>
    </form>
</body>
</html>
