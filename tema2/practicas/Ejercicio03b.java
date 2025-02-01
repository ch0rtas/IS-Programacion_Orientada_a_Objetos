package com.utad.poo.tema2.practicas;

public class Ejercicio03b {

    // Definir constantes
    public static final int SIZE = 8;         // Tamaño del tablero
    public static final char NEGRO = 'B';     // Carácter para representar el color negro
    public static final char BLANCO = 'W';    // Carácter para representar el color blanco

    public static void main(String[] args) {

        // Ciclo para las filas
        for (int i = 0; i < Ejercicio03b.SIZE; i++) {
            // Ciclo para las columnas
            for (int j = 0; j < Ejercicio03b.SIZE; j++) {
                // Determina si es blanco o negro según la posición (par o impar)
                if ((i + j) % 2 == 0) {
                    System.out.print(Ejercicio03b.NEGRO);  // Color negro
                } else {
                    System.out.print(Ejercicio03b.BLANCO);  // Color blanco
                }
            }
            // Salto de línea al final de cada fila
            System.out.println();
        }
    }
}
