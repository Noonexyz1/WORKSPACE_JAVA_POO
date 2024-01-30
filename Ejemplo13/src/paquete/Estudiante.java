package paquete;

public class Estudiante extends Persona {
	//Atributos de la Clase estudiante
//	private String nombre;
//	private String apellido;
//	private int edad;
	private int codigoEstudiante;
	private float notaFinal;	//Persona ref, Lo estoy creando en vano y solo ocupa, memoria pero al mismo tiempo crea un objeto de Persona..
 								//...si instancio un objeto de estudiante;
	private Persona ref = new Persona("Jose","Chambi" , 25);//Se sobrepone el objeto Persona, mas las sobras del objeto Estudiante
 														//y crea otro objeto pero de tipo Estudiante modificado...
 													//cada ves que creo un objeto Estudiante, siempre se va ha crear con un objeto Persona...
 												//...dentro reemplazando en todos los Atributos que tiene la clase Persona?????		
 	
	//metodos de la clase Estudiante
	public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
		super(nombre, apellido, edad);//Oye Java, estos atributos ya estan inicializados en la clase padre Persona
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
	}
								
	public void mostrarDatos() {		// + nombre); protected/ o trayendo los metodos
		System.out.println("Nombre de Estudiante: " + getNombre());
		System.out.println("Apellido de Estudiante: " + getApellido()); 
		System.out.println("Edad de Estudiante: " + getEdad());
		System.out.println("Codigo de Estudiante: " + codigoEstudiante );
		System.out.println("Nota final de Estudiante: " + notaFinal);
	}
	
	public int getCodigoEstudiante() {
		return codigoEstudiante;
	}
	public float getNotaFinal() {
		return notaFinal;
	}
//	public Persona getespejoEstudiante() {
//		return ref;
//	}
	
	public Persona getPersona() {
		return ref;
	}
	
}
