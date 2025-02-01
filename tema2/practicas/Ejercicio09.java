package com.utad.poo.tema2.practicas;

public class Ejercicio09 {
    public static void main(String[] args) {
        // Declaramos dos variables String con valores "Hola" y "lector"
        String str1 = "Hola";
        String str2 = "lector";
        
        // Presentamos por pantalla las dos variables String
        System.out.println("La variable 1 es: " + str1);
        System.out.println("La variable 2 es: " + str2);

        // Comprobamos si son iguales
        boolean sonIguales = str1.equals(str2);
        System.out.println("¿Son iguales? " + sonIguales);

        // Longitud de cada String
        System.out.println("Longitud de '" + str1 + "': " + str1.length());
        System.out.println("Longitud de '" + str2 + "': " + str2.length());

        // Segundo carácter de cada String
        System.out.println("Segundo carácter de '" + str1 + "': " + str1.charAt(1)); // Índice 1 es el segundo carácter
        System.out.println("Segundo carácter de '" + str2 + "': " + str2.charAt(1));

        // Concatenar las dos cadenas
        // String concatenado = str1 + str2;
        String concatenado = str1.concat(str2);
        System.out.println("Concatenado: " + concatenado);

        // Imprimir el substring de 2 a 6 del concatenado
        String substring = concatenado.substring(2, 6); // Substring desde índice 2 hasta el 5 (6 no incluido) 0 1 2 3 4 5 6
        System.out.println("Substring de 2 a 6 del concatenado: " + substring);
    }
}
