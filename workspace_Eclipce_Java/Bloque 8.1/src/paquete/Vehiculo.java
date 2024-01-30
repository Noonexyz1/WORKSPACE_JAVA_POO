package paquete;

public class Vehiculo {

	private String color;
	private int cv,ruedas;
	private int velocidad;
	private int cristales;
	
	public Vehiculo(String color,int cv,int ruedas) {
		this.color=color;
		this.cv=cv;
		this.ruedas=ruedas;
	}
	
	
	
	
	public int getRuedas() {
		return ruedas;
	}

	
	public int getCv() {
		return cv;
	}

	public int getVelocidad() {
		return velocidad;
	}
	
	
	
	public void acelera() {
		velocidad=velocidad+10;
	}
	
	public void frena() {
		velocidad = 0;
	}
}
