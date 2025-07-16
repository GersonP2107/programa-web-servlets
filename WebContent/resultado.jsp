<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Resultado</title>
</head>
<body>
  <h2>Datos recibidos:</h2>
  <p>Nombre: <strong><%= request.getAttribute("nombre") %></strong></p>
  <p>Correo: <strong><%= request.getAttribute("correo") %></strong></p>
  <a href="formulario.jsp">Volver al formulario</a>
</body>
</html>
