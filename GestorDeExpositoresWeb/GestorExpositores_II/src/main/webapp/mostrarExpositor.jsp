<%@ page import="com.expositores.logica.Alumno" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expositor seleccionado</title>
</head>
<body>
    <h1>Expositor seleccionado</h1>
<%
    Alumno expositor = (Alumno) request.getAttribute("expositor");
    if (expositor != null) {
        out.write("<p>Nombre: " + expositor.getNombre() + "</p>");
        out.write("<p>Promedio: " + expositor.calcularPromedio() + "</p>");
    } else {
        out.write("<p>No se ha seleccionado un expositor.</p>");
    }
%>
</body>
</html>
