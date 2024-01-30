package poo;


public class Main {

	public static void main(String[] args) {
		
		Persona person1 = new Persona("Diego", 24);
		Persona persona2 = new Persona(1234);
		
		person1.correr();
		persona2.correr(100); 
		
		
	}
}
