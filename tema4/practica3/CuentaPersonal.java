package com.utad.poo.tema4.practica3;

public class CuentaPersonal {
    private int numeroDeCuenta;
    private String nombreCliente;
    private double saldo;

    public CuentaPersonal(int numeroDeCuenta, String nombreCliente, double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public CuentaPersonal(int numeroDeCuenta, String nombreCliente) {
        this(numeroDeCuenta, nombreCliente, 0.0);
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double cantidad) {
        saldo += cantidad;
    }

    public boolean retira(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaPersonal [numeroDeCuenta=" + numeroDeCuenta + 
               ", nombreCliente=" + nombreCliente + ", saldo=" + saldo + "]";
    }
}
