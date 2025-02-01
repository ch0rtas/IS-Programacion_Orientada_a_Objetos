package com.utad.poo.tema3.practicas;

public class Lampara {
    // Constante que define el número máximo de lámparas
    public static final Integer MAX_LAMPARAS = 5;

    // Variable estática privada para contar las instancias
    private static int contador = 0;

    // Constructor de la clase
    public Lampara() {
        // Comprobamos si no se ha superado el número máximo de lámparas permitidas
        if (contador < MAX_LAMPARAS) {
            contador++;
            System.out.println("Lámpara creada. Total de lámparas: " + contador);
        } else {
            System.out.println("No se pueden crear más lámparas. Límite alcanzado.");
        }
    }

    // Método para obtener la cantidad de lámparas creadas
    public static int getContador() {
        return contador;
    }

    public static void main(String[] args) {
        // Instanciamos lámparas según el máximo permitido
        for (int i = 0; i < MAX_LAMPARAS + 2; i++) {
            new Lampara();
        }

        // Mostramos el total de lámparas creadas
        System.out.println("Total de lámparas creadas: " + Lampara.getContador());
    }
}
