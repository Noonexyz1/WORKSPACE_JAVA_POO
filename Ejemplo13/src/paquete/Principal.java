package paquete;

public class Principal {

	public static void main(String[] args) {
		Estudiante e = new Estudiante("Carlos", "Mamani", 24, 1234, 90.5f);
		//cada vez que creo un objeto estudiante, al mismo tiempo se va ha crear un objeto Persona
		e.mostrarDatos();
		Persona refA; //Esto quiere decir que si, de verdad se crean al mismo tiempo por eso no hago en (  new Persona()) como en la linea 6
 		
		//con una sola instancia puedo crear varias al mismo tiempo ya se padre o hijas
		//y para utilizar los metodos y atributos debo respetar la herencia, (Para elevar un plano mas alto) ejemplo lineas 6 y 9
		
		refA = e.getPersona();
		System.out.println( refA.getNombre());
	
	}
}
