package com.utad.poo.tema4.practica2;

public abstract class GeometricFigure implements Figure {
    private String tag;

    public GeometricFigure(String tag) {
        this.tag = tag;
    }

    public final String getTag() {
        return tag;
    }

    public final void setTag(String tag) {
        this.tag = tag;
    }

    public final void printDescription() {
        System.out.println("Tag: " + getTag());
        System.out.println("Figure Type: " + getFigureType());
        System.out.println("Area: " + area());
    }
}
