package paquete;

public class Persona {

	 //Atributos de la Clase Persona
	private String nombre; //Para las Hijas, cambiar el modificardor a Protected
	private String apellido;
	private int edad;
	
//	private Estudiante refA;
//	private Persona refP;
	
	//Metodos de la Clase Persona}
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	
//	public void mostrarMiHijo() {
//		//fijarse Muy bien el tipo de dato que estoy manejando con los returns
//		float a;
//		a = refA.getNotaFinal();
//	}
//	 public void espejo() {
//		 //Enviar y traer Metodos con referencias!!
//		 refP = refA.getespejoEstudiante();
//	 }
	
}
