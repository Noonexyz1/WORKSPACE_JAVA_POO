package prueba;

public class Principal {

	public static void main(String[] args) {
		//Creando un objeto de SerVivo
		//Declaracion de referencias de objeto
		SerVivo sv1;
		
		sv1 = new SerVivo(2, "Tigre");
		sv1.mostrarDatos();
		
		
		//Creando un objeto de Humano
		Humano h;
		h = new Humano(25, "Diego", "Ingeniero");
		h.mostrarDatos();
		
		Humano h1;
		h1 = new Humano("Ingeniero");
		h1.mostrarDatos();
	}
}
