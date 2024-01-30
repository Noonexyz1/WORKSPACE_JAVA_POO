package ejercicio1;

public class Cuadrilatero {

	//atributos de la clase
	private float lado1;
	private float lado2;
	
	//metodos de la clase
	
	public Cuadrilatero(float lado1, float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	public Cuadrilatero(float lado1) {
		this.lado1 = lado1;
		this.lado2 = lado1;
	}
		
	public float getPerimetro() {
		return 2*(lado1 + lado2);
	}
	public float getArea() {
		return lado1 * lado2;
	}
	
	
	
}
