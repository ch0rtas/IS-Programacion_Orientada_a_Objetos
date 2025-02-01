package com.utad.poo.tema4.practica3;

public class CuentaCheque extends CuentaPersonal {
    private boolean enRojo;
    private double comisionUsoChequera;
    private double comisionSaldoInsuficiente;

    public CuentaCheque(int numeroDeCuenta, String nombreCliente, double saldo, double comisionUsoChequera, double comisionSaldoInsuficiente) {
        super(numeroDeCuenta, nombreCliente, saldo);
        this.comisionUsoChequera = comisionUsoChequera;
        this.comisionSaldoInsuficiente = comisionSaldoInsuficiente;
        this.enRojo = false;
    }

    @Override
    public boolean retira(double cantidad) {
        if (getSaldo() >= cantidad) {
            super.retira(cantidad);
            return true;
        } else {
            super.retira(comisionSaldoInsuficiente);
            enRojo = true;
            return false;
        }
    }

    @Override
    public void deposita(double cantidad) {
        super.deposita(cantidad);
        if (getSaldo() > 0) {
            enRojo = false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [CuentaCheque] Comisión de uso de chequera: " + comisionUsoChequera +
               ", Comisión de saldo insuficiente: " + comisionSaldoInsuficiente + ", En rojo: " + enRojo;
    }
}
