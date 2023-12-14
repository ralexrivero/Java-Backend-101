<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cuenta de Banco</title>
</head>
<body>
    <h1>cuenta de Banco</h1>
    <h2>Operaciones en la cuenta</h2>
    <form action="CuentaServlet" method="POST">
        <input type="text" name="usuario" placeholder="Usuario">
        <input type="password" name="contrasenia" placeholder="Contraseña">
        <input type="text" name="cantidad" placeholder="Cantidad">
        <input type="submit" name="accion" value="Depositar">
        <input type="submit" name="accion" value="Retirar">
    </form>
</body>
</html>
