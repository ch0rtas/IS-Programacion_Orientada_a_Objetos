package com.utad.poo.tema3.practicas;

public class Operacion {

    // Método estático para sumar dos valores enteros
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método estático para restar dos valores enteros
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método principal (main) para probar los métodos de suma y resta
    public static void main(String[] args) {
        // Prueba de la suma
        int resultadoSuma = Operacion.sumar(5, 3);
        System.out.println("La suma de 5 y 3 es: " + resultadoSuma);

        // Prueba de la resta
        int resultadoResta = Operacion.restar(10, 4);
        System.out.println("La resta de 10 y 4 es: " + resultadoResta);
    }
}
