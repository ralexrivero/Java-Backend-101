<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Agregar usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1>Agregar usuario</h1>
    <form action="usuario" method="post">
        <div class="form-group">
            <label for="nombre" class="form-label">Nombre</label>
            <input type="text" id="nombre" name="nombre" class="form-control">
        </div>
        <div class="form-group">
            <label for="email" class="form-label">email</label>
            <input type="text" id="email" name="email" class="form-control">
        </div>
        <input type="submit" value="Agregar Usuario" class="btn btn-primary mt-3">
    </form>
        <a href="index.jsp" class="btn btn-outline-primary mt-5">Volver al inicio</a>
</div>

</body>
</html>
