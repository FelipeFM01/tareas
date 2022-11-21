<%--
  Created by IntelliJ IDEA.
  User: Felip
  Date: 17-11-2022
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Libreria</title>
  <link rel="stylesheet" type="text/css" href="estilos.css">
</head>
<body style="background: url(images/libreria.jpg)" height=100% width=100% id="myimage">
<h1 class="encabezado">Clientes ingresados</h1>
<div class="centrado">
  <form action="mostrarClientes.jsp" method="post">
  <table>
    <tr>
      <th>Nombre de Cliente</th>
      <th>Rut</th>
      <th>Correo Electrónico</th>
    </tr>
    <c:forEach items="${cliente}" var="cliente">
      <tr>
        <td><c:out value="${cliente.getNombre()}"></c:out> </td>
        <td> <c:out value="${cliente.getRut()}"></c:out> </td>
        <td> <c:out value="${cliente.getCorreoElectronico()}"></c:out> </td>
      </tr>
    </c:forEach>
  </table>
  <a class="boton" href="/taller3_war_exploded/">Volver</a>
  </form>
</div>
</body>
</html>
