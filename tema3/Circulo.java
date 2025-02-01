package com.utad.poo.tema3;


public class Circulo {
// primero ponemos las constantes y las variables
	public static final Double DEFAULT_RADIO = 1.0;
	
	
	private Double radio;
	private Punto center;
// hacemos el constructor
	
	public Circulo(){
		this(Circulo.DEFAULT_RADIO);
	}
	
	public Circulo(Double radio){
		this(radio, new Punto());
	}
	
	public Circulo(Double radio,Punto center){
		this.radio=radio;
		this.center=center;
		// el constructor principal sirve para asignar valores iniciales a los atributos
	}
	
	public void setRadio(Double radio) {
		this.radio = radio;
	}
	
	public Double getRadio() {
		return this.radio;
	}

	public Punto getCenter() {
		return this.center;
	}

	public void setCenter(Punto center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + this.radio + ", center=" + this.center + "]";
	}
	
	/*public String toString() {
		return "[Circulo radio = " + this.radio + "; Centro= " + this.center + "]";
	}*/
	
	public void desplazarseHastaPunto(Punto punto) {
		this.center.moverseHastaElPunto(punto);
	}
	
	public static void main(String[] args) {
		
		Circulo circuloOrigen = new Circulo();
		Circulo circulo2 = new Circulo(3.0);
		Circulo circulo3 = new Circulo(3.0, new Punto(4, 4));
		
		
		System.out.println(circuloOrigen);
		System.out.println(circulo2);
		System.out.println(circulo3);
		circuloOrigen.desplazarseHastaPunto(circulo3.getCenter());
		System.out.println("Circulo origen desplazado " + circuloOrigen);
	}
}