
<%@ page import="java.util.List" %>
<%@ page import="com.miaplicacion.model.Usuario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Usuario> listaUsuarios = (List<Usuario>) request.getAttribute("usuarios");
%>
<html>
<head>
    <title>Ver Usuarios</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1>Lista de Usuarios</h1>
        <% if (listaUsuarios != null && listaUsuarios.size() > 0) { %>
        <table class="table mt-4">
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>email</th>
            </tr>
            <% for (Usuario usuario: listaUsuarios) { %>
            <tr>
                <td><%= usuario.getId() %></td>
                <td><%= usuario.getNombre() %></td>
                <td><%= usuario.getEmail() %></td>
            </tr>
            <% } %>
        </table>
        <% } else { %>
        <p>No hay usuarios registrados</p>
        <% } %>
        <br/>
        <a href="index.jsp" class="btn btn-outline-primary mt-5">Volver al inicio</a>
    </div>

</body>
</html>
