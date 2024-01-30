package paquete;

public class AnimalCarnivoro {

	//Atributos de la clase
	private int velocidad;
	private int numPatas;
	private boolean cola;
	private Tigre t; //poner el Set y el Get de esta referencia, sino me marca memoria sin usar...
	
	//Metodos de la clase... osea metodos, Constructores y sets and Gets
	//Constructor
	public AnimalCarnivoro(int velocidad, int numPatas, boolean cola, Tigre t) {
		this.velocidad = velocidad;
		this.numPatas = numPatas;
		this.cola = cola;
		this.t = t;
	}
	
	
	//Ningun tipo de operacion debe estar fuera de los metodos::::
	

	//Setters and Getters
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public boolean getCola() {
		return cola;
	}

	public void setCola(boolean cola) {
		this.cola = cola;
	}
	
	public Tigre getT() {
		return t;
	}

	public void setT(Tigre t) {
		this.t = t;
	}

	//Metodos de AnimalCarnivoro
	public void comer() {
		System.out.println("Estoy comiendo carne... soy carnivoro.");
	}
	public void correr() {
		System.out.println("Estoy corriendo muy rapido.. soy carnivoro.");
	}
	public void mostrarDatos() {
		System.out.println("Velocidad: " + velocidad);
		System.out.println("Num. de Patas: " + numPatas);
		System.out.println("Cola: " + cola);
	}
	
}
