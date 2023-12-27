<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Agregar usuario</title>
</head>
<body>
    <h1>Agregar usuario</h1>
    <form action="usuario" method="post">
        <label for="nombre">Nombre</label><br/>
        <input type="text" id="nombre" name="nombre"><br/>
        <label for="email">email</label><br/>
        <input type="text" id="email" name="email"><br/><br/>
        <input type="submit" value="Agregar Usuario">
    </form>
    <br/>
    <a href="index.jsp">Volver al inicio</a>
</body>
</html>
