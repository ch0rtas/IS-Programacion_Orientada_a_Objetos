package com.utad.poo.tema2.practicas;

public class Ejercicio05 {

    public static void main(String[] args) {
        final int MAX_ITEMS = 10;
        int[] items = { 2, 4, 6, 8, 10, 9, 7, 5, 3, 1 };
        boolean found = false;
        int find = 10;

        // Bucle for equivalente al while
        int i;
        for (i = 0; (!found) && (i < MAX_ITEMS); i++) {
            found = (items[i] == find);
        }

        // El índice donde se encontró el valor o el último valor examinado
        System.out.println(i - 1);
    }
}
