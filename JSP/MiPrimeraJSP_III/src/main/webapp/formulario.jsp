<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulario</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<h1>Formulario de registro</h1>
<h2>Introduce tus datos</h2>
<form id="formularioRegistro" action="procesarFormulario" method="POST">
    <input type="text" name="nombre" placeholder="nombre">
    <input type="number" name="edad" placeholder="edad">
    <input type="email" name="email" placeholder="email">
    <input type="tel" name="telefono" placeholder="telefono">
    <input type="text" name="direccion" placeholder="direccion">
    <input type="password" name="contrasena" placeholder="password">
    <input type="password" name="confirmarContrasena" placeholder="confirme el password"><br>
    <input type="submit" value="Enviar">
</form>
<script src="validaciones.js"></script>
</body>
</html>
