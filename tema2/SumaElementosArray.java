package com.utad.poo.tema2;

import java.util.Scanner;

public class SumaElementosArray {
    public static final int NUM_ELEMENTOS_POR_DEFECTO = 10;
    private int numeros[];
    private int numElementos;
    private int sumaElementos;

    public void SumarElementos() {
        sumaElementos = 0;
        for (int i = 0; i < numElementos; i++) {
            sumaElementos += numeros[i];
        }
    }

    public void RellenaArray() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < numElementos) {
            System.out.println("Introduce un número: ");
            numeros[i] = scanner.nextInt();
            i++;
        }
        scanner.close();
    }

    public SumaElementosArray() {
        this(SumaElementosArray.NUM_ELEMENTOS_POR_DEFECTO);
    }

    public SumaElementosArray(int num) {
        numeros = new int[num];
        numElementos = num;
        RellenaArray();
        SumarElementos();
    }

    public int getSumaElementos() {
        return sumaElementos;
    }
}