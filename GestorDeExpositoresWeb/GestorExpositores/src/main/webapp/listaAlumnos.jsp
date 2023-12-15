<%@ page import="java.util.ArrayList" %>
<%@ page import="com.expositores.logica.Alumno" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Alumnos</title>
</head>
<body>
<%
    ArrayList<Alumno> alumnos = (ArrayList<Alumno>) request.getAttribute("alumnos");
    if (alumnos != null && !alumnos.isEmpty()) {
        out.write("<ul>");
            for (Alumno alumno : alumnos) {
                out.write("<li>" + alumno.getNombre() + " Promedio: " + alumno.calcularPromedio());
            }
        out.write("</ul>");
    } else {
        out.write("<p>No hay alumnos registrados</p>");
    }
%>
</body>
</html>
