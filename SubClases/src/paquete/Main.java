package paquete;


//import paquete.Persona.Ropa;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola mundo...");
		Persona p1 = new Persona();
		p1.mostrarDatosPersona();
		Persona.Ropa r1 = new Persona.Ropa();
		r1.getMarca();
		
		Persona.Ropa.setColor("Hola");
		
		
	}
}
