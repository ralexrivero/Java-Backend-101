<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/tags/core" prefix="c" %>
<html>
<head>
    <title>Gestión de Expositores</title>
</head>
<body>
<h2>Gestión de Alumnos y Expositores</h2>

<!-- Formulario para agregar alumno -->
<form action="gestion" method="post">
    <h3>Agregar Alumno</h3>
    <label for="nombreAlumno">Nombre del Alumno:</label>
    <input type="text" id="nombreAlumno" name="nombreAlumno"><br>
    <input type="hidden" name="accion" value="agregar">
    <input type="submit" value="Agregar Alumno">
</form>

<!-- Formulario para seleccionar expositor -->
<form action="gestion" method="post">
    <h3>Seleccionar Expositor</h3>
    <input type="hidden" name="accion" value="seleccionar">
    <input type="submit" value="Seleccionar Expositor">
</form>

<!-- Lista de Alumnos -->
<h3>Lista de Alumnos</h3>
<c:forEach items="${alumnos}" var="alumno">
    <p>${alumno}</p>
</c:forEach>
</body>
</html>
