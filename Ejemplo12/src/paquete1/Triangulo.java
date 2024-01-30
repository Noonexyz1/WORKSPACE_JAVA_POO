package paquete1;

public class Triangulo {

	//Atributos de la Clase
	private double base;
	private double lado;
	
	//metodos de la clase
	public Triangulo(double base, double lado) {
		this.base = base;
		this.lado = lado;
	}
	
	public double obtenerPerimetro() {
		return 2*lado + base;
	}
	
	public double obtenerArea() {
		return (base * (Math.sqrt(lado * lado - (base * base / 4 )) ) )/2;
	}
	
	public String mostrarDatos() {
		return "Base: " + base + " Lado: " + lado + " Perimetro: " + obtenerPerimetro() + " Area: " + obtenerArea() ;
	}
	
}
