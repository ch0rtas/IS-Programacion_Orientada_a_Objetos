package com.utad.poo.tema2;

import java.util.Scanner;

public class Ejercicio00_SumaDosNumeros {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int suma;
		
		System.out.print("Escriba el primer número a sumar: ");
		numero1 = scanner.nextInt();
		System.out.print("Escriba el segundo número a sumar: ");
		numero2 = scanner.nextInt();
		
		suma = numero1 + numero2;
		System.out.printf("\nLa suma de %d y %d es %d.\n", numero1, numero2, suma);
		scanner.close();
	}
}
