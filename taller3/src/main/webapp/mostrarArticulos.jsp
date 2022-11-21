<%--
  Created by IntelliJ IDEA.
  User: Felip
  Date: 17-11-2022
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Libreria</title>
    <link rel="stylesheet" type="text/css" href="estilos.css">

</head>
<body style="background: url(images/libreria.jpg)" height=100% width=100% id="myimage">
<h1 class="encabezado">Articulos ingresados</h1>
<div class="centrado">
    <form action="mostrarArticulos.jsp" method="post">
        <table>
            <tr>
                <th>Nombre de Articulo</th>
                <th>Tipo de Articulo</th>
                <th>Codigo de Articulo</th>
                <th>Peso ( en [kg] )</th>
                <th>Precio  ( en clp )</th>
            </tr>
            <c:forEach items="${articulo}" var="articulo">
                <tr>
                    <td><c:out value="${articulos.getnombreArticulo()}"></c:out> </td>
                    <td> <c:out value="${articulos.getTipoArticulo()}"></c:out> </td>
                    <td> <c:out value="${articulos.getCodigoArticulo()}"></c:out> </td>
                    <td> <c:out value="${articulos.getPeso()}"></c:out> </td>
                    <td> <c:out value="${articulos.getPrecio()}"></c:out> </td>
                </tr>
            </c:forEach>
        </table>
        <a class="boton" href="/taller3_war_exploded/">Volver</a>
    </form>
</div>
</body>
</html>
