package paquete;

public class Principal {

	//Atributos de la clase Principal
	
	//Metodos de la clase principal
	public static void main(String[] args) {
		//Creando mis referencias o mis llaver de cada tipo
		SerVivo servivo;
		Persona humano;
		Perro dober;
		
		//construyendo cada uno de los objeto
		servivo = new SerVivo("ET", 300, "Gris");
		humano = new Persona("Diego", 24, "Moreno", "Estudiante");
		dober = new Perro("FIDO", 5, "Plateado", "Pastor"); 
		
		
		servivo.despertar();
		servivo.comer();
		servivo.dormir();
		servivo.mostrarDatos();
		System.out.println();
		
		humano.despertar();
		humano.comer();
		humano.dormir();
		humano.mostrarDatos();
		System.out.println();
		
		
		dober.despertar();
		dober.comer();
		dober.dormir();
		dober.mostrarDatos();
		System.out.println("Pero mi nombre de peroo es.. " + dober.getNombre());
		System.out.println();
		
	}
}
