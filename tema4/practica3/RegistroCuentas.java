package com.utad.poo.tema4.practica3;

import java.util.ArrayList;

public class RegistroCuentas {
    private ArrayList<CuentaPersonal> cuentas;

    public RegistroCuentas() {
        this.cuentas = new ArrayList<>();
    }

    public boolean anyadeCuenta(CuentaPersonal cuenta) {
        return cuentas.add(cuenta);
    }

    public boolean eliminaCuenta(int numeroDeCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroDeCuenta() == numeroDeCuenta);
    }

    public CuentaPersonal getCuentaPersonal(int numeroDeCuenta) {
        return cuentas.stream()
                      .filter(cuenta -> cuenta.getNumeroDeCuenta() == numeroDeCuenta)
                      .findFirst()
                      .orElse(null);
    }
}
