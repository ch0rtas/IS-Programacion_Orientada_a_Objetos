package com.utad.poo.tema2.practicas;

public class Ejercicio08 {
    public static void main(String[] args) {
        // Recorremos las letras minúsculas desde 'a' hasta 'z'
        for (char letra = 'a'; letra <= 'z'; letra++) {
            // Imprimimos la letra y su valor ASCII
            System.out.println("Letra: " + letra + " - Código ASCII: " + (int)letra);
        }
    }
}
