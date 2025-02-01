package com.utad.poo.tema5;

public class ArrayIndex {
    public static void main(String[] args) {
        int numeros[] = {0, 1, 2, 3, 4, 5};
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
        }
        System.out.println();
        
        // Provocar que se genere la excepción
        int indiceDelVector = 10; // Índice fuera de rango
        try {
            System.out.println("Inicio de la región protegida");
            System.out.println(numeros[indiceDelVector]);
            System.out.println("Fin de la región protegida");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El índice no es válido, excepción " + e.getClass());
            System.out.println(e.getMessage());
        }
        System.out.println("Fuera de la región protegida");
    }
}
