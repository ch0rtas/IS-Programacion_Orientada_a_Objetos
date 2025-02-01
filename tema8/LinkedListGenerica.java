package com.utad.poo.tema8;

import java.util.LinkedList;
import com.utad.inso.tema3.practicas.baraja.Carta;
import com.utad.inso.tema3.practicas.baraja.Palo;

public class LinkedListGenerica<T> {
    private LinkedList<T> items;

    public LinkedListGenerica() {
        this.items = new LinkedList<>();
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public void addFirst(T item) {
        this.items.addFirst(item);
    }

    public void addLast(T item) {
        this.items.addLast(item);
    }

    public T removeFirst() {
        return this.items.removeFirst();
    }

    public T removeLast() {
        return this.items.removeLast();
    }

    public T getFirst() {
        return this.items.getFirst();
    }

    public T getLast() {
        return this.items.getLast();
    }

    @Override
    public String toString() {
        return this.items.toString();
    }

    public static void main(String[] args) {
        // Crear una lista genérica de cartas
        LinkedListGenerica<Carta> cartasLinkedList = new LinkedListGenerica<>();

        // Agregar cartas al principio y al final
        cartasLinkedList.addFirst(new Carta(1, Palo.ESPADAS)); // As de Espadas
        cartasLinkedList.addFirst(new Carta(6, Palo.OROS));    // Seis de Oros
        cartasLinkedList.addLast(new Carta(3, Palo.BASTOS));  // Tres de Bastos
        cartasLinkedList.addFirst(new Carta(12, Palo.ESPADAS));


        // Mostrar la lista
        System.out.println("Lista inicial de cartas: " + cartasLinkedList);

        // Obtener y eliminar la primera carta
        Carta primeraCarta = cartasLinkedList.removeFirst();
        System.out.println("Primera carta eliminada: " + primeraCarta);
        System.out.println("Lista después de eliminar la primera carta: " + cartasLinkedList);

        // Obtener y eliminar la última carta
        Carta ultimaCarta = cartasLinkedList.removeLast();
        System.out.println("Última carta eliminada: " + ultimaCarta);
        System.out.println("Lista después de eliminar la última carta: " + cartasLinkedList);

        // Mostrar la primera y última carta actual
        System.out.println("Primera carta actual: " + cartasLinkedList.getFirst());
        System.out.println("Última carta actual: " + cartasLinkedList.getLast());
    }
}