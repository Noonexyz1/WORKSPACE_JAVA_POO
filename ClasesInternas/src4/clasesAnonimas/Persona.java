package clasesAnonimas;

public class Persona {

	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		// TODO Auto-generated constructor stub
		this.edad = edad;
		this.nombre = nombre;
	}
	
	
	public void mostrarDatos() {
		System.out.println("el nombre de la persona es: " + nombre);
		System.out.println("La edad de la persona es: " + edad);
	}
	
	
	/*
	 * La clase anónima no sólo puede implementar una interfaz sino que también
	 *  puede derivar o extender una clase*/
	public void mostrar(Inmaterial q) {
		String px;
		px = q.datCadena(); //Metodo que a lo futuro voy a implementar, pero que no se aun el como;
		System.out.println("Muestra:" + px);
	}
	
}
