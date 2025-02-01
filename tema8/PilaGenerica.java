package com.utad.poo.tema8;

import java.util.LinkedList;

public class PilaGenerica<T> {
    private LinkedList<T> items;

    public PilaGenerica() {
        this.items = new LinkedList<>();
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    // Agregar un elemento a la pila (en la parte superior)
    public void push(T item) {
        this.items.addFirst(item);
    }

    // Eliminar y retornar el elemento en la parte superior de la pila
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return this.items.removeFirst();
    }

    // Obtener el elemento en la parte superior de la pila sin eliminarlo
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return this.items.getFirst();
    }

    @Override
    public String toString() {
        return this.items.toString();
    }

    public static void main(String[] args) {
        // Crear una pila genérica de Strings
        PilaGenerica<String> pila = new PilaGenerica<>();

        // Agregar elementos a la pila
        pila.push("Jose");
        pila.push("Juan");
        pila.push("Maria");

        // Mostrar la pila después de los primeros 3 push
        System.out.println("Pila después de los 3 push: " + pila);

        // Eliminar y mostrar el primer elemento (pop)
        String elementoEliminado1 = pila.pop();
        System.out.println("Elemento eliminado: " + elementoEliminado1);
        System.out.println("Pila después del primer pop: " + pila);

        // Eliminar y mostrar el segundo elemento (pop)
        String elementoEliminado2 = pila.pop();
        System.out.println("Elemento eliminado: " + elementoEliminado2);
        System.out.println("Pila después del segundo pop: " + pila);

        // Agregar el último elemento (push)
        pila.push("Esteban");
        System.out.println("Pila después de agregar 'Esteban': " + pila);

        // Eliminar y mostrar el tercer elemento (pop)
        String elementoEliminado3 = pila.pop();
        System.out.println("Elemento eliminado: " + elementoEliminado3);
        System.out.println("Pila después del tercer pop: " + pila);
    }
}

