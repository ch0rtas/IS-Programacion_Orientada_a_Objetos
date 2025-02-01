package com.utad.poo.tema4.practica2;

public class Rectangle extends GeometricFigure {
    private int base;
    private int height;

    public Rectangle(String tag, int base, int height) {
        super(tag);
        this.base = base;
        this.height = height;
    }

    public String getFigureType() {
        return "Rectangle";
    }

    public Double area() {
        return (double) base * height;
    }

    public void drawTxt() {
        for (int i = 0; i < height; i++) {
            System.out.println(" * ".repeat(base));
        }
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
