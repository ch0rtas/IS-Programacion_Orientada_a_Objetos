package com.utad.poo.tema3.practicas;

public class Persona {
    // Atributos de la clase Persona
    private String nombre;
    private int edad;

    // Constructor que inicializa los atributos nombre y edad
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método getter para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Método estático que recibe dos personas y retorna la mayor por edad
    public static Persona mayor(Persona p1, Persona p2) {
        if (p1.getEdad() >= p2.getEdad()) {
            return p1; // Retorna p1 si su edad es mayor o igual que la de p2
        } else {
            return p2; // Retorna p2 si es mayor que p1
        }
    }

    // Sobrescribimos el método toString para mostrar el nombre y la edad
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }

    // Método principal (main)
    public static void main(String[] args) {
        // Creamos dos objetos Persona con diferentes edades
        Persona persona20 = new Persona("Inés", 20);
        Persona persona25 = new Persona("Paco", 25);

        // Usamos el método mayor para obtener la persona con mayor edad
        System.out.println("Entre Inés y Paco, la mayor es " +
                Persona.mayor(persona20, persona25));
    }
}
