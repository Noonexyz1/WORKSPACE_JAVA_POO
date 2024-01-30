package paquete;

public class Tigre extends AnimalCarnivoro{

	//Atributos de la clase
	private int numGarras;
	private boolean colnillos;
	
	//Metodos de la clase... osea metodos, Constructores y sets and Gets
	//Constructor
	public Tigre(int velocidad, int numPatas, boolean cola, int numGarras, boolean colnillos, Tigre t) {
		super(velocidad, numPatas, cola, t);
		this.numGarras = numGarras;
		this.colnillos = colnillos;
	}
	
	//Getters and Setters
	public int getNumGarras() {
		return numGarras;
	}

	public void setNumGarras(int numGarras) {
		this.numGarras = numGarras;
	}

	public boolean isColnillos() {
		return colnillos;
	}

	public void setColnillos(boolean colnillos) {
		this.colnillos = colnillos;
	}
	
	//Metodos
	@Override
	public void comer() {
		System.out.println("Estoy comiendo carne... soy un Tigre.");
	}
	@Override
	public void correr() {
		System.out.println("Estoy corriendo muy rapido.. soy un Tigre.");
	}
	@Override
	public void mostrarDatos() {
		System.out.println("Velocidad: " + getVelocidad());
		System.out.println("Num. de Patas: " + getNumPatas());
		System.out.println("Cola: " + getCola());
	}
	
	public void caracteristica() {
		System.out.println("Soy un Tigre y tendo MANCHAS en la piel...");
	}
	
}
