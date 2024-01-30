package prueba;

public class Humano extends SerVivo{

	//Atributos de la Clase Humano
	private String profecion;
	
	//Constructores, Getters and Setters y los metodos propios
	
	public Humano(String profecion) {
		super();
		this.profecion = profecion;
	}
	public Humano(int edad, String nombre, String profecion) {
		super(edad, nombre);
		this.profecion = profecion;
	}
	
	public void setProfecion(String profecion) {
		this.profecion = profecion;
	}
	public String getProfecion() {
		return profecion;
	}
	
	
	public void mostrarDatos() {
		System.out.println("La Edad del humano es: " + getEdad());
		System.out.println("El nombre del humano es: " + getNombre());
		System.out.println("La profecion del humano es: " + profecion);
	}
	
	
	
	
	
}
