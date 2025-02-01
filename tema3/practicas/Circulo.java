package com.utad.poo.tema3.practicas;

import java.util.Scanner;

public class Circulo {
    // Constante de la clase para el valor de Pi
    public static final Double PI = 3.1416;

    // Atributo de instancia para el radio del círculo
    private Double radio;

    // Constructor vacío
    public Circulo() {
    }

    // Método getter para obtener el radio
    public Double getRadio() {
        return radio;
    }

    // Método setter para establecer el radio
    public void setRadio(Double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public Double area() {
        return PI * radio * radio; // Fórmula: π*r^2
    }

    // Método para calcular la longitud de la circunferencia
    public Double longitud() {
        return 2 * PI * radio; // Fórmula: 2π*r
    }

    // Método principal (main)
    public static void main(String[] args) {
        // Creamos una instancia de la clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Creamos un objeto de la clase Circulo
        Circulo circulo = new Circulo();

        // Pedimos al usuario que ingrese el radio del círculo
        System.out.print("Introduce el radio del círculo: ");
        Double radio = scanner.nextDouble();

        // Establecemos el valor del radio en el objeto circulo
        circulo.setRadio(radio);

        // Calculamos el área y la longitud del círculo
        Double area = circulo.area();
        Double longitud = circulo.longitud();

        // Mostramos los resultados
        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);
    }
}
