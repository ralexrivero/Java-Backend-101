<%@ page import="java.util.List" %>`
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <h1>Reporte de errores</h1>
    <h2>Error en el formulario</h2>
    <%
        List<String> errores = (List<String>) request.getAttribute("errores");
        if (errores != null && !errores.isEmpty()) {
            for (String error: errores) {
                out.write("<p>" + error + "</p>");
            }
        }
    %>
    <a href="formulario.jsp">Volver al formulario</a>
</body>
</html>
