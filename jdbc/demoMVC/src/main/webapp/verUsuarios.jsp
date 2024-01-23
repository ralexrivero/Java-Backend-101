
<%@ page import="java.util.List" %>
<%@ page import="com.miaplicacion.model.Usuario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Usuario> listaUsuarios = (List<Usuario>) request.getAttribute("usuarios");
%>
<html>
<head>
    <title>Ver Usuarios</title>
</head>
<body>
    <h1>Lista de Usuarios</h1>
    <% if (listaUsuarios != null && listaUsuarios.size() > 0) { %>
        <table border="1">
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
    <a href="index.jsp">Volver al inicio</a>
</html>
