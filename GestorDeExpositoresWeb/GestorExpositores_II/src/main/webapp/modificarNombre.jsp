<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modficar nombre del alumno</title>
</head>
<body>
    <h1>Modificar nombre del alumno</h1>
    <form action="ModificarNombreServlet" method="post">
        <label for="nombreAntiguo">Nombre del alumno</label>
        <input type="text" id="nombreAntiguo" name="nombreAntiguo" required>
        <label for="nuevoNombre">Nombre actualizado</label>
        <input type="text" id="nuevoNombre" name="nuevoNombre" required>
        <input type="submit" value="Modificar">
    </form>
</body>
</html>
