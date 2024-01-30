package clasesAnonimas2;

import java.awt.Color;

public class Figurin {

	private Color _color;
	private double perimetro;
	
	
	public Figurin() {
			
	}
	
	public Figurin(Color c, double p) {
		this._color = c;
		this.perimetro = p;
	}
	
	public void mostrarDatos() {
		System.out.println("El objeto color es: " + _color);
		System.out.println("El perimetro es: " + perimetro);
	}
	
	
	public void metodoInterno1() {
		System.out.println("Metodo interno Figurin 1");
	}
	public void metodoInterno2() {
		System.out.println("Metodo interno Figurin 2");
	}
	
	
}
