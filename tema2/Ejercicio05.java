package com.utad.poo.tema2;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca un número entero
        System.out.print("Introduce un número entero: ");
        int numero = Integer.parseInt(scanner.nextLine());

        // Multiplicamos el número por 20
        int multiplicacion = numero * 20;

        // Imprimimos la división de la multiplicación por 10
        int division1 = multiplicacion / 10;
        System.out.println("La división de la multiplicación por 10 es: " + division1);

        // Sumamos el número original a la multiplicación
        int suma = multiplicacion + numero;

        // Imprimimos la división de la suma por 10
        int division2 = suma / 10;
        System.out.println("La división de la suma por 10 es: " + division2);

        // Si el resto no es 0, lo imprimimos
        int resto = suma % 10;
        if (resto != 0) {
            System.out.println("El resto de la suma al dividir por 10 es: " + resto);
        }
    }
}
