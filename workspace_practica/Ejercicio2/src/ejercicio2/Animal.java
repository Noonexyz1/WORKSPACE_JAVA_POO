package ejercicio2;

public class Animal {

	private String tamaño;
	private int edad;
	private String nombre;
	private int altura;
	private int ancho;
	
	public Animal(String tamaño,int edad,String nombre,int altura,int ancho) {
		this.tamaño=tamaño;
		this.edad=edad;
		this.nombre=nombre;
		this.altura=altura;
		this.ancho=ancho;
			
	}
	public String getTamaño() {
		return tamaño;
	}
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void come() {
		System.out.println("el animal esta comiendo...");
	}
	
	public void dormir() {
		System.out.println("el animal esta durmiendo...");
	}
	public int getVolumen() {
		int x;
		x=altura*ancho;
		return x;
	} 
	
	
}
