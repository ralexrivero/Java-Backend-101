Para desarrollar una aplicación web que gestione ventas con la funcionalidad descrita, necesitaremos construir tanto la capa lógica como la capa gráfica. Comenzaremos con la capa lógica y luego nos centraremos en la interfaz de usuario con JSP y un Servlet para manejar las acciones.

### Parte I: Capa Lógica (Clase `Venta`)

Primero, definiremos la clase `Venta` que incluirá los atributos `total`, `maxima` y `cantidad`, junto con los métodos necesarios.

#### Clase `Venta` en Java

```java
package com.ventas.logica;

public class Venta {
    private int total;
    private int maxima;
    private int cantidad;

    public Venta() {
        this.total = 0;
        this.maxima = 0;
        this.cantidad = 0;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int venta) {
        this.total += venta;
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima(int venta) {
        if (venta > this.maxima) {
            this.maxima = venta;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad() {
        this.cantidad++;
    }

    @Override
    public String toString() {
        return "Venta{" + "total=" + total + ", maxima=" + maxima + ", cantidad=" + cantidad + '}';
    }
}
```

### Parte II: Capa Gráfica (JSP y Servlet)

Para la interfaz de usuario, utilizaremos un archivo JSP y un Servlet para procesar las solicitudes. La página JSP permitirá al usuario ingresar la cantidad de una venta, y el Servlet actualizará los datos de `Venta` y mostrará los resultados en la misma página.

#### `venta.jsp`

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gestión de Ventas</title>
</head>
<body>
    <h2>Ingresar Venta</h2>
    <form action="VentaServlet" method="post">
        Cantidad Venta: <input type="text" name="venta"><br>
        <input type="submit" value="Ingresar">
    </form>
</body>
</html>
```

#### Servlet `VentaServlet`

```java
package com.ventas.servlet;

import com.ventas.logica.Venta;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "VentaServlet", urlPatterns = {"/VentaServlet"})
public class VentaServlet extends HttpServlet {
    private Venta venta = new Venta();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int ventaCantidad = Integer.parseInt(request.getParameter("venta"));
        venta.setTotal(ventaCantidad);
        venta.setMaxima(ventaCantidad);
        venta.setCantidad();

        request.setAttribute("total", venta.getTotal());
        request.setAttribute("maxima", venta.getMaxima());
        request.setAttribute("cantidad", venta.getCantidad());

        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    }
}
```

#### `resultado.jsp`

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado de Ventas</title>
</head>
<body>
    <h2>Resultados de Venta</h2>
    <p>Total Ventas: ${total}</p>
    <p>Venta Máxima: ${maxima}</p>
    <p>Cantidad Ventas: ${cantidad}</p>
    <a href="venta.jsp">Volver a Ingresar Venta</a>
</body>
</html>
```

### Instrucciones para Ejecutar la Aplicación

1. **Configura tu Entorno**: Asegúrate de que tu entorno de desarrollo (como IntelliJ IDEA) esté configurado para usar Jakarta EE y Tomcat.
2. **Compila y Despliega**: Compila el proyecto y despliégalo en el servidor Tomcat.
3. **Prueba la Aplicación**: Abre un navegador y navega a la página `venta.jsp` para probar la funcionalidad de la aplicación.

### Notas Importantes

- **Validación de Entrada**: Asegúrate de agregar validación para la entrada del usuario en el Servlet.
- **Manejo de Excepciones**: Incluye el manejo adecuado de excepciones en el Servlet para evitar errores en tiempo de ejecución.
- **Pruebas**:

 Realiza pruebas exhaustivas para asegurarte de que la aplicación funcione correctamente bajo diferentes escenarios.

Esta estructura proporciona una aplicación web sencilla que gestiona ventas, permitiendo al usuario ingresar nuevos montos de venta y ver los resultados actualizados.