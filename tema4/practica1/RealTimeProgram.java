package com.utad.poo.tema4.practica1;

public class RealTimeProgram extends Process {
    public RealTimeProgram(String name) {
        super(name, 4); // Prioridad alta fija para tiempo real
    }

    @Override
    public String toString() {
        return "RealTimeProgram " + super.toString();
    }
}
