<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cuenta Banco</title>
</head>
<body>
<h2>Operaciones Bancarias</h2>
<form action="CuentaServlet" method="post">
    Usuario: <input type="text" name="usuario"><br>
    Contraseña: <input type="password" name="contrasenia"><br>
    Cantidad: <input type="text" name="cantidad"><br>
    <input type="submit" name="accion" value="Depositar">
    <input type="submit" name="accion" value="Retirar">
</form>
</body>
</html>
