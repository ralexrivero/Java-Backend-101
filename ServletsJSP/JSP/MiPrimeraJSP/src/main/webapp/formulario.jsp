<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulario</title>
</head>
<body>
    <h1>Formulario de registro</h1>
    <h2>Ingresa tus datos</h2>
    <form action="procesarFormulario" method="POST">
        <input type="text" name="nombre" placeholder="Nombre"><br>
        <input type="number" name="edad" placeholder="Edad"><br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
