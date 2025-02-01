package com.utad.poo.tema2.practicas;

public class Ejercicio07 {

    public static void main(String[] args) {
        double tiempo = 10;  // Ejemplo de tiempo en segundos
        double espacioRecorrido = calcularEspacioRecorrido(tiempo);
        System.out.println("Espacio recorrido tras " + tiempo + " segundos: " + espacioRecorrido + " m");
    }

    // Método que calcula el espacio recorrido
    public static double calcularEspacioRecorrido(double t) {
        double x0 = 5.5;  // Espacio inicial en metros
        double v = 3.2;   // Velocidad constante en m/s
        
        // Ecuación del espacio: x = x0 + v * t
        double x = x0 + v * t;
        return x;
    }
}
