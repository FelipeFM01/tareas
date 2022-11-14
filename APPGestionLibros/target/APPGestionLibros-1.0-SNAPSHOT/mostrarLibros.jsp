<%@ page import="java.util.List" %>
<%@ page import="controller.RegistroLibroServlet" %><%--
  Created by IntelliJ IDEA.
  User: Felip
  Date: 11-11-2022
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Mostrar libros</title>
    <link rel="stylesheet" type="text/css" href="estilos.css">
</head>
<body>
<h1 class="encabezado">Libros ingresados</h1>
<div class="centrado">
    <table>
        <tr>
            <th>Nombre  de libro</th>
            <br>
            <th>Editorial</th>
            <th>Categoria</th>
            <th>Año</th>
            <th>Tipo</th>
        </tr>
        <c:forEach items="${libros}" var="libro">
            <tr>
                <td><c:out value="${libro.getNombre()}"></c:out> </td>
                <br>
                <td> <c:out value="${libro.getEditorial()}"></c:out> </td>
                <td> <c:out value="${libro.getCategoria()}"></c:out> </td>
                <td> <c:out value="${libro.getAño()}"></c:out> </td>
                <td> <c:out value="${libro.getTipo()}"></c:out> </td>
            </tr>
        </c:forEach>


    </table>
    <a class="boton" href="/APPGestionLibros_war_exploded/">Volver</a>
</div>
</body>
</html>
