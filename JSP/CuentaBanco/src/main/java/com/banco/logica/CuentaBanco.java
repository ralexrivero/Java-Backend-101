package com.banco.logica;

public  class CuentaBanco {
    private String usuario;
    private String contrasenia;
    private double saldo;

    public CuentaBanco(String usuario, String contrasenia, double saldo) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.saldo = saldo;
    }

    // metodo para depositar
    public void despositar(String usuario, String contrasenia, double cantidad) {
        if (this.usuario.equals(usuario) && this.contrasenia.equals(contrasenia) && cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    // metodo para retirar
       public double retirar(String usuario, String contrasenia, double cantidad) {
        if (this.usuario.equals(usuario) && this.contrasenia.equals(contrasenia) && cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            return cantidad;
        }
        return 0;
       }

       // getters y setters
        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getContrasenia() {
            return contrasenia;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
}