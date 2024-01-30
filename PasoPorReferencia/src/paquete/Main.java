package paquete;


public class Main {

	private static Persona a;
	
	//los cambios se realizan siempre a diferencia de los paso por valir
	public static void pasoReferencia(Persona a, Mascota m) {
		a.setNombre("JOSE");
		m.setNombreMascota("BOBY");
		System.out.println("Mostrando los cambios hechos a mis objetos");
		a.mostrarDatos();
		m.mostrarDatos();
	}
	
	public static void modificarDatosObjetos() {
		
		a = new Persona("Diego", 24);
		a.mostrarDatos();
		
	}
	
	public static void main(String[] args) {
		System.out.println("Prueba Paso por metros...");
		
		Persona p = new Persona("Jorge", 10);		
		Mascota m = new Mascota("Fido", "Cafe");
		p.mostrarDatos();
		m.mostrarDatos();
		System.out.println("Cambiando los datos de mis objetos");
		pasoReferencia(p, m);
		System.out.println("Verificando si ahora los cambios hechos se hicieron en todos");
		
		System.out.println("---Haciendo prueba el objeto global----");
		modificarDatosObjetos();
		
	}
}
