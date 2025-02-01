package com.utad.poo.tema2.practicas;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca un número real
        System.out.print("Introduce un número real: ");
        double numero = Double.parseDouble(scanner.nextLine());

        // Multiplicamos el número por 20.0
        double multiplicacion = numero * 20.0;

        // Imprimimos la división de la multiplicación por 10.0
        double division1 = multiplicacion / 10.0;
        System.out.println("Tu número multiplicado por 20 y seguidamente dividido entre 10 es: " + division1);

        // Sumamos el número original a la multiplicación
        double suma = multiplicacion + numero;

        // Imprimimos la división de la suma por 10.0
        double division2 = suma / 10.0;
        System.out.println("La división de la suma por 10 es: " + division2);

        // Si el resto no es 0, lo imprimimos
        double resto = suma % 10.0;
        if (resto != 0) {
            System.out.println("El resto de la suma al dividir por 10 es: " + resto);
        }
    }
}
