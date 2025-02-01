package com.utad.poo.tema4.practica3;

import java.time.LocalDate;

public class CuentaAhorros extends CuentaPersonal {
    private LocalDate fechaVencimiento;
    private double porcentajeInteres;

    public CuentaAhorros(int numeroDeCuenta, String nombreCliente, double saldo, LocalDate fechaVencimiento, double porcentajeInteres) {
        super(numeroDeCuenta, nombreCliente, saldo);
        this.fechaVencimiento = fechaVencimiento;
        this.porcentajeInteres = porcentajeInteres;
    }

    public boolean retira(double cantidad, LocalDate fecha) {
        if (fecha.equals(fechaVencimiento)) {
            return super.retira(cantidad);
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " [CuentaAhorros] Fecha de vencimiento: " + fechaVencimiento +
               ", Porcentaje de interés mensual: " + porcentajeInteres;
    }
}
