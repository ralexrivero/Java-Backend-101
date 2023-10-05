package com.rrivero.banco;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if(monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if(monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }
}
