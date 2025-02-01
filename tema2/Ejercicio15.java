package com.utad.poo.tema2;

import java.util.Arrays;

public class Ejercicio15 {
    public static void main(String[] args) {
        // Array de origen con valores
        int[] origen = {12, 27, 32, 44, 18, 60, 25, 30};
        
        // Array destino, misma longitud que el array de origen
        int[] destino = new int[origen.length];
        
        // Índice para el array destino
        int indiceDestino = 0;

        // Filtrar los valores pares y mayores que 25
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] % 2 == 0 && origen[i] > 25) {
                destino[indiceDestino++] = origen[i];
            }
        }

        // Ajustar el tamaño del array destino (opcional)
        destino = Arrays.copyOf(destino, indiceDestino);

        // Mostrar los arrays
        System.out.println("Array de origen: " + Arrays.toString(origen));
        System.out.println("Array de destino (pares y > 25): " + Arrays.toString(destino));
    }
}

