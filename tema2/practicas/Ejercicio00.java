package com.utad.poo.tema2.practicas;

public class Ejercicio00 {
    public static void main(String[] args) {
        // c. Declara una variable String denominada shortMsg con valor inicial "Short Message".
        String shortMsg = "Short Message";
        
        // d. Declara otra variable String denominada longMsg, con valor inicial "Loooooooooong message".
        String longMsg = "Loooooooooong message";
        
        // e. Declara una variable boolean de nombre printShort, cuyo valor inicial sea true.
        boolean printShort = true;
        
        // f. Declara una variable int de nombre counter, y no le asignes ningún valor inicial.
        // int counter;  // No inicializada
        // System.out.printf("Valor inicial de counter %d\n", counter);  // Esto daría un error de compilación.

        // Inicializamos counter para evitar error
        int counter = 0;
        System.out.printf("Valor inicial de counter: %d\n", counter);

        // g. Instrucción if para imprimir shortMsg sólo si printShort es true.
        if (printShort) {
            System.out.println(shortMsg);
        } else {
            // h. Else que imprime longMsg si printShort es false.
            System.out.println(longMsg);
        }

        // i. Mensaje que siempre se imprime, independientemente del valor de printShort.
        System.out.println("This message is always printed");

        // j. Bucle for que imprime "Are we there yet?" diez veces seguidas y el valor de i en cada iteración.
        for (int i = 1; i <= 10; i++) {
            System.out.println("Are we there yet? " + " (i = " + i + ")");
        }

        // k. Bucle while que imprime 7 veces "I'm going to pass this course" y el valor de i en cada iteración.
        int i = 1;  // Se reutiliza la variable i
        while (i <= 7) {
            System.out.println("I'm going to pass this course (i = " + i + ")");
            i++;
        }
    }
}
