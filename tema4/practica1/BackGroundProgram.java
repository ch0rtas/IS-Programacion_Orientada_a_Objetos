package com.utad.poo.tema4.practica1;

public class BackGroundProgram extends Process {
    public BackGroundProgram(String name) {
        super(name, 1); // Prioridad baja fija para segundo plano
    }

    @Override
    public String toString() {
        return "BackGroundProgram " + super.toString();
    }
}
