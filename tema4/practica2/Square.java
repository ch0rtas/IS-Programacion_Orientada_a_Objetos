package com.utad.poo.tema4.practica2;

public class Square extends Rectangle {
    public Square(String tag, int side) {
        super(tag, side, side);
    }

    @Override
    public String getFigureType() {
        return "Square";
    }
}
