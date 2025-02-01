package com.utad.poo.tema8;

import java.util.LinkedList;

public class ColaGenerica<T> {
    private LinkedList<T> items;

    public ColaGenerica() {
        this.items = new LinkedList<>();
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    // Agregar un elemento al final de la cola
    public void enqueue(T item) {
        this.items.addLast(item);
    }

    // Eliminar y retornar el elemento en el frente de la cola
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return this.items.removeFirst();
    }

    // Obtener el elemento al frente de la cola sin eliminarlo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return this.items.getFirst();
    }

    @Override
    public String toString() {
        return this.items.toString();
    }

    public static void main(String[] args) {
        // Crear una cola genérica de enteros
        ColaGenerica<Integer> cola = new ColaGenerica<>();

        // Agregar elementos a la cola
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        cola.enqueue(4);

        // Mostrar la cola
        System.out.println("Cola después de agregar elementos: " + cola);

        // Obtener y eliminar el elemento en el frente de la cola
        Integer elemento = cola.dequeue();
        System.out.println("Elemento eliminado: " + elemento);
        System.out.println("Cola después de eliminar el elemento: " + cola);

        // Ver el elemento al frente sin eliminarlo
        System.out.println("Elemento actual: " + cola.peek());
    }
}

