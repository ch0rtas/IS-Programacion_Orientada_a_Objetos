package com.utad.poo.tema4.practica2;

public class FiguresTesting {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("R1", 6, 3);
        rectangle.printDescription();
        rectangle.drawTxt();

        Square square = new Square("S1", 5);
        square.printDescription();
        square.drawTxt();
    }
}
