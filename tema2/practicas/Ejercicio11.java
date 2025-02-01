package com.utad.poo.tema2.practicas;

public class Ejercicio11 {

    // Método que multiplica dos matrices bidimensionales
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        // Filas de la primera matriz
        int filasM1 = matriz1.length;
        // Columnas de la primera matriz (que es igual al número de filas de la segunda matriz)
        int columnasM1 = matriz1[0].length;
        // Columnas de la segunda matriz
        int columnasM2 = matriz2[0].length;

        // La matriz resultante tendrá el número de filas de matriz1 y el número de columnas de matriz2
        int[][] matrizResultado = new int[filasM1][columnasM2];

        // Realizamos la multiplicación de matrices
        for (int i = 0; i < filasM1; i++) {
            for (int j = 0; j < columnasM2; j++) {
                // Inicializamos el valor en 0 para cada celda de la matriz resultante
                matrizResultado[i][j] = 0;
                // Calculamos el producto escalar fila i de M1 por columna j de M2
                for (int k = 0; k < columnasM1; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return matrizResultado;
    }

    public static void main(String[] args) {
        // Definimos las dos matrices
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6}
        }; // M1 (2x3)
        
        int[][] matriz2 = {
            {7, 8},
            {9, 1},
            {2, 3}
        }; // M2 (3x2)

        // Llamamos al método para multiplicar las matrices
        int[][] matrizResultado = multiplicarMatrices(matriz1, matriz2);

        // Imprimimos la matriz resultante
        System.out.println("Matriz resultado:");
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado[i].length; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println(); // Salto de línea para cada fila
        }
    }
}
