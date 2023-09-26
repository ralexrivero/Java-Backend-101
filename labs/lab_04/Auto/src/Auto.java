public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double velocidadActual;
    private double velocidadMaxima;
    private boolean encendido;
    private double combustible; // cantidad en litros
    private double consumoPorKm = 0.1; // Consumo por cada kilometro
    private String ubicacionActual = "Inicio";

    public Auto(String marca, String modelo, int anio, String color, double velocidadMaxima, double combustibleInicial) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
        this.encendido = false;
        this.combustible = combustibleInicial;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Auto encendido.");
        } else {
            System.out.println("El auto ya esta encendido");
        }
    }

    public void apagar() {
        if(encendido) {
            encendido = false;
            velocidadActual = 0;
            System.out.println("Auto apagado con velocidad cero");
        } else {
            System.out.println("El auto ya esta apagado");
        }
    }

    public void acelerar(double cantidad) {
        if (encendido) {
            velocidadActual += cantidad;
            if (velocidadActual > velocidadMaxima) {
                velocidadActual = velocidadMaxima;
            }
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        } else {
            System.out.println("El auto esta apagado. No puede acelerar.");
        }
    }

    public void frenar(double cantidad) {
        velocidadActual -= cantidad;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }

    public void cargarCombustible(double cantidad) {
        combustible += cantidad;
        System.out.println("Se cargaron " + cantidad + " litros de combustible");
        System.out.println("Combustible actual es: " + combustible + " litros");
    }

    public void mover (String nuevoDestino, double kilometros) {
        if(encendido) {
            double combustibleNecesario = kilometros * consumoPorKm;
            if(combustible >= combustibleNecesario) {
                combustible -= combustibleNecesario;
                ubicacionActual = nuevoDestino;
                System.out.println("Auto movido a : " + nuevoDestino + ". Combustible restante: " + combustible + " litros");
            } else {
                System.out.println("No hay suficiente combustible para ir a: " + nuevoDestino);
            }
        } else {
            System.out.println("El auto esta apagado. No se puede mover");
        }
    }
    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("Encendido: " + (encendido ? "Sí" : "No" ));
        System.out.println("Combustible: " + combustible + " litros");
        System.out.println("Ubicacion actual: " + ubicacionActual);
    }

    public static void main(String[] args) {
        Auto miAuto = new Auto("toyota", "Corolla", 2020, "verde", 180, 50);
        System.out.println("Estado incial del auto");
        miAuto.mostrarEstado();

        miAuto.cargarCombustible(10);
        miAuto.mover("Tienda", 5);

        miAuto.encender();
        miAuto.mover("Tienda", 5);

        System.out.println("Estado final del auto");
        miAuto.mostrarEstado();
    }
}
