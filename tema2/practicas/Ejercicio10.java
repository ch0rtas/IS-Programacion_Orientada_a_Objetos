package com.utad.poo.tema2.practicas;

public class Ejercicio10 {

    // Método clonador que recibe un array de enteros y devuelve un nuevo array idéntico
    public static int[] clonarArray(int[] arrayOriginal) {
        // Creamos un nuevo array del mismo tamaño que el original
        int[] arrayClonado = new int[arrayOriginal.length];
        
        // Copiamos los elementos del array original al nuevo array
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayClonado[i] = arrayOriginal[i];
        }
        
        // Devolvemos el array clonado
        return arrayClonado;
    }

    public static void main(String[] args) {
        // Ejemplo de uso del método clonarArray
        int[] arrayOriginal = {1, 2, 3, 4, 5};

        // Llamamos al método para clonar el array
        int[] arrayClonado = clonarArray(arrayOriginal);

        // Imprimimos el array clonado
        System.out.print("Array clonado: ");
        for (int i : arrayClonado) {
            System.out.print(i + " ");
        }
    }
}

