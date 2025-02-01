package com.utad.poo.tema2.practicas;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12_Ahorcado {
    // Palabras disponibles para el juego
    private static final String[] palabras = {"Paco", "Pilar", "Eva", "Vanessa", "Rafael", "Javier", "Samuel", "Laura"};

    // Método para seleccionar una palabra aleatoria
    public static String obtenerPalabraAleatoria() {
        Random rand = new Random();
        int indice = rand.nextInt(palabras.length); // Selecciona un índice aleatorio
        return palabras[indice].toLowerCase(); // Devolvemos la palabra en minúsculas para facilitar el juego
    }

    // Método principal del juego
    public static void jugar() {
        // Seleccionamos una palabra aleatoria
        String palabra = obtenerPalabraAleatoria();
        int intentosRestantes = 6; // Número máximo de intentos
        char[] progreso = new char[palabra.length()]; // Estado del progreso de la palabra

        // Inicializamos el progreso con guiones bajos (sin descubrir las letras)
        for (int i = 0; i < progreso.length; i++) {
            progreso[i] = '_';
        }

        Scanner scanner = new Scanner(System.in);

        // Bucle del juego
        while (intentosRestantes > 0) {
            System.out.println("Palabra: " + String.valueOf(progreso));
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Introduce una letra: ");
            char letra = scanner.next().toLowerCase().charAt(0); // Leemos la letra del usuario

            boolean acierto = false;
            // Comprobamos si la letra está en la palabra
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    progreso[i] = letra; // Actualizamos el progreso con la letra correcta
                    acierto = true;
                }
            }

            // Si no se acierta ninguna letra, se pierde un intento
            if (!acierto) {
                intentosRestantes--;
                System.out.println("Letra incorrecta.");
            }

            // Comprobamos si la palabra ha sido completada
            if (String.valueOf(progreso).equals(palabra)) {
                System.out.println("¡Felicidades! Has adivinado la palabra: " + palabra);
                break;
            }
        }

        // Si el jugador se queda sin intentos
        if (intentosRestantes == 0) {
            System.out.println("¡Has perdido! La palabra era: " + palabra);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        // Llamamos al método para iniciar el juego
        jugar();
    }
}
