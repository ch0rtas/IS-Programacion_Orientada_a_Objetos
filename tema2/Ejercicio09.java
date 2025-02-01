package com.utad.poo.tema2;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int N;

        // Pedir al usuario que ingrese un número entero mayor que 0
        do {
            System.out.print("Introduce un número entero mayor que 0: ");
            N = scanner.nextInt();
        } while (N <= 0); // Repetir hasta que el número sea mayor que 0

        // Calcular la suma de 1 a N
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i; // Sumar cada número desde 1 hasta N
        }

        // Mostrar el resultado
        System.out.println("La suma de los números de 1 a " + N + " es: " + suma);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

