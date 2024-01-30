package paquete1;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona("Diego", 15);
		p.mostrarDatos(); 
		
		p.setEdad(16);
		p.mostrarDatos();
		System.out.println("La edad actual es " + p.getEdad());
	}
}
