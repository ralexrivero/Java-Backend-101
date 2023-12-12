<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulario</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<h2>Introduce tus datos</h2>
<form id="formularioRegistro" action="procesarFormulario" method="POST">
    <input type="text" name="nombre" placeholder="nombre"><br>
    <input type="number" name="edad" placeholder="edad"><br>
    <input type="email" name="email" placeholder="email"><br>
    <input type="tel" name="telefono" placeholder="telefono"><br>
    <input type="text" name="direccion" placeholder="direccion"><br>
    <input type="submit" value="Enviar">
</form>
<script src="validaciones.js"></script>
</body>
</html>
