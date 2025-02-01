package com.utad.poo.tema4.practica1;

public class Process {
    private static int counter = 1; // Contador para el PID
    private int processId;
    private int priority;
    private String name;

    // Constructor solo con el nombre (prioridad predeterminada 2)
    public Process(String name) {
        this.processId = counter++;
        this.priority = 2;
        this.name = name;
    }

    // Constructor con nombre y prioridad
    public Process(String name, int priority) {
        this.processId = counter++;
        this.priority = priority;
        this.name = name;
    }

    // Getters para atributos
    public int getPriority() { return priority; }
    public int getProcessId() { return processId; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Process [processId=" + processId + ", priority=" + priority + ", name=" + name + "]";
    }
}
