package com.utad.poo.tema2.practicas;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño del tablero
        System.out.print("Introduce el tamaño del tablero (entero): ");
        int size = scanner.nextInt();

        // Solicitar el carácter para el color negro
        System.out.print("Introduce el carácter para representar el color negro: ");
        char negro = scanner.next().charAt(0);

        // Solicitar el carácter para el color blanco
        System.out.print("Introduce el carácter para representar el color blanco: ");
        char blanco = scanner.next().charAt(0);

        // Ciclo para las filas
        for (int i = 0; i < size; i++) {
            // Ciclo para las columnas
            for (int j = 0; j < size; j++) {
                // Determina si es blanco o negro según la posición (par o impar)
                if ((i + j) % 2 == 0) {
                    System.out.print(negro);  // Color negro
                } else {
                    System.out.print(blanco);  // Color blanco
                }
            }
            // Salto de línea al final de cada fila
            System.out.println();
        }

        scanner.close();  // Cerrar el objeto scanner
    }
}
