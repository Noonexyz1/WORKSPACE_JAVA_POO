package prueba;

public class SerVivo {

	//Atributos de la Clase
	private int edad;
	private String nombre;
	
	//Metodosd de la clase, Constructores, Getters and setters y Metodos
	public SerVivo(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	public SerVivo() {
		
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void mostrarDatos() {
		System.out.println("La Edad del ser vivo es: " + edad);
		System.out.println("El nombre del ser vivo es: " + nombre);
	}
	
	
	
}
