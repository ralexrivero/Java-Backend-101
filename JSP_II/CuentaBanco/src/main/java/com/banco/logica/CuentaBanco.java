package com.banco.logica;

public class CuentaBanco {
    private String usuario;
    private String contrasenia;
    private double saldo;

    public CuentaBanco(String usuario, String contrasenia, double saldo) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.saldo = saldo;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(String usuario, String contrasenia, double cantidad) {
        if (this.usuario.equals(usuario) && this.contrasenia.equals(contrasenia) && cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    // Método para retirar dinero de la cuenta
    public double retirar(String usuario, String contrasenia, double cantidad) {
        if (this.usuario.equals(usuario) && this.contrasenia.equals(contrasenia) && cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            return cantidad;
        }
        return 0;
    }

    // Getters y Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
