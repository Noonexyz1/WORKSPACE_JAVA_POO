package paquete;

public class Principal {

	//Atributos de la clase
	
	
	//Metodos de la clase;
	public static void main(String[] args) {
		//Creando referencias (LLaves)
		AnimalCarnivoro animal;
		//no puedo.... cada ves que quiero crear a l mismo tiempo, siempre me pedira que inicialize primero
		Tigre t = new Tigre(velocidad, numPatas, cola, numGarras, colnillos, t);
		Tigre t2;
		//los objetos si o si debes ser construidos, deben ser inicializados si o si
		
		t2 = new Tigre(30, 4, true, 20, true, t);
		animal = new AnimalCarnivoro(20, 2, false, t );
//		animal.correr();
//		animal.comer();
//		animal.mostrarDatos();
		
		
		
	}
}
