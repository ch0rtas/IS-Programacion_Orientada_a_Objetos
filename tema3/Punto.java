package com.utad.poo.tema3;

public class Punto {
    
    public static final Integer DEFAULT_VALUE = 0;
    
    private Integer x;
    private Integer y;
    
    private boolean desplazado;
    
    public Punto() {
        this(Punto.DEFAULT_VALUE);
    }
    
    public Punto(Integer x) {
        this(x, Punto.DEFAULT_VALUE);
    }
    
    public Punto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
        this.desplazado = false;
    }
    
    public Integer getX() {
        return this.x;
    }
    
    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return this.y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + ", desplazado=" + desplazado + "]";
    }
    
    public void moverseHastaElPunto(Punto punto) {
        this.x = punto.x;
        this.y = punto.y;
        this.desplazado = true;  // Marcando como desplazado
    }
    
    public static void main(String[] args) {
        Punto punto = new Punto();
        Punto punto2 = new Punto(2);
        Punto punto3 = new Punto(3, 4);
        
        System.out.println(punto);
        System.out.println(punto2);
        System.out.println(punto3);
        
        punto.moverseHastaElPunto(punto3);
        System.out.println("Desplazo " + punto);

    }
}
