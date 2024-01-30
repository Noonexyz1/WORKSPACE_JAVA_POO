package paquete;

public class Nino {

	
	private String nombre;
	private int edad;
	private Gato g;
	
	
	public Nino(String nombre, int edad/*Osea aqui para enviarlo al constructor del gato*/) {
		this.nombre = nombre;
		this.edad = edad;
		this.g = new Gato(/*Poner los atributos de nombre desde main si se quiere*/);
	}



	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Gato getG() {
		return this.g;
	}
	public void setG(Gato g) {
		this.g = g;
	}
	
	
	public void mostrarDatos() {
		System.out.println("nombre del niño: " + nombre);
		System.out.println("la edad del niño es: " + edad);
		//System.out.println("El nombre del gato es: " + g.getNombreGato());
		//System.out.println("La edad del gato es : " + g.getEdadGato());
		g.mostrarDatos();
	}
	

}
