package paquete;

public class Main {

	
	public static void main(String[] args) {
		Persona p = new Persona("Jose", 24);
		
		System.out.println("el nombre del objeto es: " + p.objeto().getNombre());
		
		
//		System.out.println("El nombre de la persona es:" + p.getNombre());
	}
}
