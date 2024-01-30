package paquete;

public class Persona extends SerVivo{

	//atributos de la clase perro
	private String profecion;
	
	//metodos de la Clase perro, constructor y gets and sets
	public Persona(String nombre, int edad, String color, String profecion) {
		super(nombre, edad, color);
		this.profecion = profecion;
	}
	
	//no puedo construir otro constructor pero para ello tengo el SET
	
//	public Persona(String profecion) {
//		this.profecion = profecion;
//	}
	
	@Override
	public void comer() {
		System.out.println("Estoy comiendo sentado en la mesa... soy persona");
	}
	@Override //Prueba
	public void mostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Edad: " + getEdad());
		System.out.println("Color: " + getEdad());
		System.out.println("Profecion: " + profecion);
	}
	
	
	
	public void setProfecion(String profecion) {
		this.profecion = profecion;
	}
	
	public String getProfecion() {
		return profecion;
	}
	
	
	
}
