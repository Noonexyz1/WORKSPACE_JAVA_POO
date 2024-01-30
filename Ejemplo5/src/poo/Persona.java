package poo;

public class Persona {

	//atributos mienbros de la clase Persona
	String nombre;
	int edad;
	int dni;
	
	//metodo mienbro Constructor
	//CNSTRUCTORES
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(int dni) {
		this.dni = dni;
	}
	
	//metodos mienbros de la clase Persona
	public void correr() {
		System.out.println("Mi nombre es " + nombre + " tengo " + edad + " años y estoy corriendo una maraton...");
	}
	
    public void correr(int km) {
    	System.out.println("He corrido " + km + "Kilometros");
    }
	
	
	
}
