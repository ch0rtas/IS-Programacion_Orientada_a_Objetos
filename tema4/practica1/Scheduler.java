package com.utad.poo.tema4.practica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Scheduler {
    private List<Process> processList;
    private int maxCapacity;

    public Scheduler(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.processList = new ArrayList<>();
    }

    // Método para agregar un proceso ordenado por prioridad
    public void addProcess(Process process) {
        if (processList.size() < maxCapacity) {
            processList.add(process);
            processList.sort(Comparator.comparingInt(Process::getPriority).reversed());
        }
    }

    // Método para obtener el próximo proceso (de mayor prioridad)
    public Process getNextProcess() {
        if (!processList.isEmpty()) {
            return processList.remove(0);
        }
        return new Process("Null Process", 0); // Retorno del proceso nulo
    }

    // Método main para prueba
    public static void main(String[] args) {
        Process normalProgram = new Process("NormalProgram", 2);
        Process realTimeProgram = new RealTimeProgram("RealTime");
        Process backgroundProgram = new BackGroundProgram("Background");

        Scheduler scheduler = new Scheduler(3);

        scheduler.addProcess(normalProgram);
        scheduler.addProcess(realTimeProgram);
        scheduler.addProcess(backgroundProgram);

        System.out.println(scheduler.getNextProcess());
        System.out.println(scheduler.getNextProcess());
        scheduler.addProcess(backgroundProgram);
        System.out.println(scheduler.getNextProcess());
        scheduler.addProcess(realTimeProgram);
        System.out.println(scheduler.getNextProcess());
        System.out.println(scheduler.getNextProcess());
        System.out.println(scheduler.getNextProcess());
    }
}
