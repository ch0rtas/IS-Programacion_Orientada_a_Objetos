package com.utad.poo.tema3;

import java.util.Calendar;

public class Fecha {
    // Atributos privados
    private int day;
    private int month;
    private int year;

    // Constructor sin parámetros: asigna la fecha actual
    public Fecha() {
        Calendar hoy = Calendar.getInstance();
        this.day = hoy.get(Calendar.DAY_OF_MONTH);
        this.month = hoy.get(Calendar.MONTH) + 1; // Calendar.MONTH es cero indexado
        this.year = hoy.get(Calendar.YEAR);
    }

    // Constructor con un parámetro para el día
    public Fecha(int day) {
        this();
        this.day = day;
    }

    // Constructor con dos parámetros para el día y el mes
    public Fecha(int day, int month) {
        this(day);
        this.month = month;
    }

    // Constructor con tres parámetros para el día, mes y año
    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Métodos get
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Métodos set
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Método toString para la representación en cadena de la fecha
    @Override
    public String toString() {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return day + " de " + meses[month - 1] + " de " + year;
    }

    // Método compareTo para comparar fechas
    public int compareTo(Fecha otraFecha) {
        if (this.year < otraFecha.year) {
            return -1;
        } else if (this.year > otraFecha.year) {
            return 1;
        } else if (this.month < otraFecha.month) {
            return -1;
        } else if (this.month > otraFecha.month) {
            return 1;
        } else if (this.day < otraFecha.day) {
            return -1;
        } else if (this.day > otraFecha.day) {
            return 1;
        } else {
            return 0;
        }
    }

    // Método esAnterior para verificar si la fecha actual es anterior a otra
    public boolean esAnterior(Fecha otraFecha) {
        return this.compareTo(otraFecha) < 0;
    }

    // Método para obtener los días del mes actual
    public Integer diasMes() {
        return diasMes(this.year, this.month);
    }

    // Método sobrecargado para obtener los días de un mes específico
    public Integer diasMes(Integer year, Integer month) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29; // Año bisiesto
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }

    // Método main para probar la clase Fecha
    public static void main(String[] args) {
        // Uso de los diferentes constructores
        Fecha today = new Fecha();
        System.out.println(today + " cuyo mes tiene " + today.diasMes() + " días");

        Fecha octubre7 = new Fecha(7);
        System.out.println(octubre7);

        Fecha octubre10 = new Fecha(10, 10);
        System.out.println(octubre10);

        Fecha octubre10Del2003 = new Fecha(10, 10, 2003);
        System.out.println(octubre10Del2003);

        // Uso de getters y setters
        today.setDay(8);
        today.setMonth(10);
        today.setYear(2022);
        System.out.println("Fecha modificada: " + today.getDay() + " de " + today.getMonth() + " de " + today.getYear());

        // Uso del método esAnterior
        if (octubre7.esAnterior(octubre10)) {
            System.out.println("La fecha " + octubre7 + " es anterior a " + octubre10);
        } else {
            System.out.println("La fecha " + octubre7 + " no es anterior a " + octubre10);
        }
    }
}
