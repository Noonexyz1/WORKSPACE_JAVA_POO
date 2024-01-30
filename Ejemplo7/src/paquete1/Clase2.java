package paquete1;

public class Clase2 {

	public static void main(String[] args) {
		
		Clase1 o = new Clase1();
		o.setEdad(10);
		o.setNombre("Dieguito");
		
		System.out.println("La edad es " + o.getEdad());
		System.out.println("El nombre es " + o.getNombre());
	}
}
