package com.expositores.logica;

import java.io.Serializable; // necesario para genear la secuencia de bytes
import java.util.ArrayList;

public class Alumno implements Serializable {
    /*
        almacena y gestiona la informacion del alumno
     */
    // propiedades
    private String nombre;
    private boolean haSidoSeleccionado;
    private int vecesSeleccionado;
    private ArrayList<Double> notas;

    // constructor
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.haSidoSeleccionado = false;
        this.vecesSeleccionado = 0;
        this.notas = new ArrayList<>();
    }

    // getters y setters
    public void setHaSidoSeleccionado(boolean haSidoSeleccionado) {
        this.haSidoSeleccionado = haSidoSeleccionado;
    }

    public void incrementarContador() {
        this.vecesSeleccionado++;
    }

    public void agregarNota(double nota) {
        this.notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre +
                (haSidoSeleccionado ? " (Ya ha sido seleccionado" : "") +
                " - Veces seleccionado: " + vecesSeleccionado +
                " - Promedio: " + calcularPromedio();
    }
}
