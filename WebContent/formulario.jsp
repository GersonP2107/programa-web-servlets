<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Formulario de Registro</title>
</head>
<body>
  <h1>Registro de Usuario</h1>
  <% if (request.getAttribute("error") != null) { %>
    <p style="color:red;"><%= request.getAttribute("error") %></p>
  <% } %>
  <form action="RegistroUsuario" method="post">
    <label>Nombre:</label>
    <input type="text" name="nombre" required><br><br>
    <label>Correo:</label>
    <input type="email" name="correo" required><br><br>
    <input type="submit" value="Enviar">
  </form>
</body>
</html>