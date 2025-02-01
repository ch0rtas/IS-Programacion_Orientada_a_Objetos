package com.utad.poo.tema4.practica3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CuentaPersonal cuentaDePaco = new CuentaPersonal(1, "Paco", 10.0);
        CuentaPersonal cuentaDeJose = new CuentaAhorros(2, "Jose", 20.0, LocalDate.of(2022, 12, 31), 2.0);
        CuentaPersonal cuentaDePilar = new CuentaCheque(3, "Pilar", 30.0, 3.0, 0.05);

        RegistroCuentas registroDeCuentas = new RegistroCuentas();
        registroDeCuentas.anyadeCuenta(cuentaDePaco);
        registroDeCuentas.anyadeCuenta(cuentaDeJose);
        registroDeCuentas.anyadeCuenta(cuentaDePilar);

        CuentaPersonal cuentaDeBusqueda;

        // Operar con la cuenta de Jose
        cuentaDeBusqueda = registroDeCuentas.getCuentaPersonal(2);
        System.out.println("Cuenta de " + cuentaDeBusqueda.getNombreCliente() + " antes de operar \n" + cuentaDeBusqueda);
        cuentaDeBusqueda.deposita(20);
        cuentaDeBusqueda.retira(30);
        System.out.println("Cuenta de " + cuentaDeBusqueda.getNombreCliente() + " después de operar \n" + cuentaDeBusqueda);

        // Operar con la cuenta de Pilar
        cuentaDeBusqueda = registroDeCuentas.getCuentaPersonal(3);
        System.out.println("Cuenta de " + cuentaDeBusqueda.getNombreCliente() + " antes de operar \n" + cuentaDeBusqueda);
        cuentaDeBusqueda.deposita(20);
        cuentaDeBusqueda.retira(60);
        System.out.println("Cuenta de " + cuentaDeBusqueda.getNombreCliente() + " después de operar \n" + cuentaDeBusqueda);
    }
}
