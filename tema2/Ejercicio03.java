package com.utad.poo.tema2;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int producto;
		
		System.out.print("Escriba el primer número a multiplicar: ");
		numero1 = scanner.nextInt();
		System.out.print("Escriba el segundo número a multiplicar: ");
		numero2 = scanner.nextInt();
		System.out.print("Escriba el tercer número a multiplicar: ");
		numero3 = scanner.nextInt();
		
		producto = numero1 * numero2 * numero3;
		System.out.printf("\nLa operación (%d * %d * %d) es %d.\n", numero1, numero2, numero3, producto);
		scanner.close();
	}
}
