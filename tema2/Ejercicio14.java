package com.utad.poo.tema2;

public class Ejercicio14 {
    public static void main(String[] args) {
        // Definimos un array de enteros
        int[] numeros = {10, 20, 30, 40, 50};

        // Variable para almacenar la suma
        int suma = 0;

        // Bucle para recorrer el array y sumar los elementos
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Imprimimos el resultado por pantalla
        System.out.println("La suma de los elementos del array es: " + suma);
    }
}

