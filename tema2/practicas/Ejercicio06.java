package com.utad.poo.tema2.practicas;

public class Ejercicio06 {

    public static void main(String[] args) {
        int num = 5;  // Ejemplo de número cuyo factorial se va a calcular
        
        // Factorial con bucle for
        System.out.println("Factorial (for): " + factorialFor(num));

        // Factorial con bucle while
        System.out.println("Factorial (while): " + factorialWhile(num));

        // Factorial con recursión
        System.out.println("Factorial (recursión): " + factorialRecursivo(num));
    }

    // Factorial utilizando bucle for
    public static int factorialFor(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Factorial utilizando bucle while
    public static int factorialWhile(int n) {
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        return factorial;
    }

    // Factorial utilizando recursión
    public static int factorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }
}
