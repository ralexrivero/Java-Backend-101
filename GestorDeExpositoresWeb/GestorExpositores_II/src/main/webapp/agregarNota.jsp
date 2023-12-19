<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Agregar nota</title>
</head>
<body>
    <h1>Agregar nota al ultimo expositor</h1>
    <form action="AgregarAlumnoServlet" method="post">
        <label for="nota">Nota:</label>
        <input type="number" id="nota" name="nota" required>
        <input type="submit" value="Agregar">
    </form>
</body>
</html>
