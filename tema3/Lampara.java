package com.utad.poo.tema3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lampara implements Comparable<Lampara> {
    public static final Integer LAMPARA_MAX = 5;
    public static final Integer POR_DEFECTO = 0;
    // Escribe una clase Lampara que lleve la cuenta de cuántas instancias de dicha
    // clase se han creado
    private static Integer numero;
    private Integer id;

    static {
        numero = 0;
    }

    // Constructores
    public Lampara() {
        this(Lampara.numero);
    }

    public Lampara(Integer id) {
        this.id = id;
        Lampara.numero++;
    }

    @Override
    public String toString() {
        return "Lampara [id=" + this.id + "]";
    }

    @Override
    public int compareTo(Lampara otraLampara) {
        int resultado = 0;
        // Devuelve 0 si son iguales, 1 si es mayor, -1 si es menor
        if (this.id > otraLampara.id) {
            resultado = 1;
        } else if (this.id < otraLampara.id) {
            resultado = -1;
        }
        return resultado;
    }

    @Override
    public boolean equals(Object otroObjeto) {
        boolean iguales = false;
        if (otroObjeto instanceof Lampara) {
            // Conversión del objeto a Lampara
            Lampara otraLampara = (Lampara) otroObjeto;
            // iguales = this.id.equals(otraLampara.id);
            iguales = this.compareTo(otraLampara) == 0;
        }
        return iguales;
    }

    // Método para buscar lámparas
    // Dos parámetros: Lista + Lampara a buscar.
    // Retorna la posición de la lámpara a buscar dentro de la lista
    // Devuelve -1 si no está
    public static int buscarLampara(List<Lampara> lamparas, Lampara lamparaBuscada) {
        for (int i = 0; i < lamparas.size(); i++) {
            if (lamparas.get(i).equals(lamparaBuscada)) {
                return i; // Retorna la posición de la lámpara
            }
        }
        return -1; // Devuelve -1 si no está
    }

    public static void main(String[] args) {
        List<Lampara> lamparas = new ArrayList<Lampara>();

        for (int i = Lampara.LAMPARA_MAX; i > 0; i--) {
            Lampara lampara = new Lampara(i);
            System.out.println(lampara);
            lamparas.add(lampara);
        }
        System.out.println(lamparas);
        System.out.println(Lampara.numero);

        // Ahora ordenadas ->
        Collections.sort(lamparas);
        System.out.println(lamparas);

        Lampara otraLampara = new Lampara(1);
        System.out.println("otraLampara es igual a la primera de la lista");
        System.out.println(otraLampara.equals(lamparas.get(0)));

        // Ejemplo de uso del método buscarLampara
        int posicion = buscarLampara(lamparas, otraLampara);
        if (posicion != -1) {
            System.out.println("La lámpara buscada está en la posición: " + posicion);
        } else {
            System.out.println("La lámpara buscada no se encontró.");
        }
    }
}

