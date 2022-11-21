<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<head>

    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Libreria</title>
</head>
<body style="background: url(images/libreria.jpg)" height=100% width=100% id="myimage">
<h1 class="encabezado"> Menú principal Libreria </h1>
<br>
<h2>Bienvenido</h2>
<br>
<form action="registroCliente" method="get">
    <div class="centrado">
        <input type="submit" value="Registrar cliente" class="boton">
    </div>
</form>

<form action="mostrarClientes" method="get">
    <div class="centrado">
        <input type="submit" value="Mostrar cliente" class="boton">
    </div>
</form>

<form action="registroArticulos" method="get">
    <div class="centrado">
        <input type="submit" value="Registrar articulos" class="boton">
    </div>
</form>

<form action="mostrarArticulos" method="get">
    <div class="centrado">
        <input type="submit" value="Mostrar articulos" class="boton">
    </div>
</form>

<form action="buscarArticulo" method="get">
    <div class="centrado">
        <input type="submit" value="Buscar por tipo de Articulo" class="boton">
    </div>
</form>

</body>
</html>
