<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Agregar alumno</title>
</head>
<body>
    <h1>Agregar Alumno</h1>
    <form action="AgregarAlumnoServlet" method="post">
        <label for="nombreAlumno">Nombre del alumno</label>
        <input type="text" id="nombreAlumno" name="nombre" required>
        <input type="submit" value="Agregar">
    </form>
</body>
</html>
