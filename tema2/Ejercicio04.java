package com.utad.poo.tema2;

import java.util.Scanner;

public class Ejercicio04 {
	// Declaramos la variable pública
	public static final double PI = 3.1416;
	
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca el radio del círculo
        System.out.print("Introduce el radio del círculo: ");
        double radio = Double.parseDouble(scanner.nextLine());

        // Calculamos el área del círculo
        double area = PI * Math.pow(radio, 2);

        // Mostramos el resultado
        System.out.println("El área del círculo es: " + area);
    }
}
