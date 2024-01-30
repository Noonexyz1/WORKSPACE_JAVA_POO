package paquete;

public class Estudiante extends Persona{

	
	
	public Estudiante(String nombre, int edad) {
		super(nombre, edad);
	}

	
	@Override
	public void mostrarDatos() {
		System.out.println("edad estudiante es: " + getEdad());
		System.out.println("el nombre del estudiante es: " + getNombre());
	}
	
	public void cambiarDeColegio() {
		System.out.println("Me cambie al colegio sdfsdfsdf");
	}
	
}
