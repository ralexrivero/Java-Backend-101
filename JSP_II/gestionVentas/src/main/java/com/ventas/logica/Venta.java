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
