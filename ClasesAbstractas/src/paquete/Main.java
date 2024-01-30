package paquete;

public class Main {

	public static void main(String[] args) {
		
		Persona p = new Estudiante("Jose", 15);
		p.mostrarDatos();
		
		Estudiante e = new Estudiante("Carlos", 16);
		p.mostrarDatos();
		p.cambiarDeColegio();//Este metodo no los ejecuta por a clase abstracta que tengo
		//La clase abstravta redefine todas la clase de una sola manera
		
		/*
		 *Pero haciendo un casting se puede solucionar*/
		((Estudiante) p).cambiarDeColegio();
		
		/*
		 *O bien definir la cabezera de este metodo en la clase abstracta Persona
		 * */
		
	}
}
