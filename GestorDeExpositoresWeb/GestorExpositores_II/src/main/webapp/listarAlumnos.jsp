<%@ page import="java.util.ArrayList" %>
<%@ page import="com.expositores.logica.Alumno" %>
<%@ page import="com.expositores.logica.GestorDeAlumnos" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Alumnos</title>
</head>
<body>
<%
    GestorDeAlumnos gestor = (GestorDeAlumnos) request.getServletContext().getAttribute("gestor");
    ArrayList<Alumno> alumnos = null;
    if (gestor != null) {
        alumnos = gestor.getAlumnos();
    }

    if (alumnos != null && !alumnos.isEmpty()) {
        out.write("<ul>");
        for (Alumno alumno : alumnos) {
            out.write("<li>" + alumno.getNombre() + " - Promedio: " + alumno.calcularPromedio() + "</li>");
        }
        out.write("</ul>");
    } else {
        out.write("<p>No hay alumnos registrados</p>");
    }




%>
</body>
</html>
