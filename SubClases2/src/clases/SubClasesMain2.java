package clases;



//import clases.ClaseSuperior.ClaseInterior;

public class SubClasesMain2 {

	public static void main(String[] args) {
		System.out.println("Prueba de clases Interiores");
		
		System.out.println("-------Creando un objeto de la clase superior");
		ClaseSuperior superior = new ClaseSuperior("Jose", 25);
		superior.mostrarDatos();
		
		System.out.println("------Creando un objeto de la clase interior");
		//ClaseInterior interior = superior.new ClaseInterior("Carlos", 15);
		//interior.mostrarDatosInterior(); //Nesecito un objeto de la clase superior para instanciar una de una clase interior
		
		System.out.println("-----Craendo otro objeto de la clase interior sin importacion de clase");
		//ClaseSuperior.ClaseInterior intertior2 = superior.new ClaseInterior("Carlos", 23);
		//intertior2.mostrarDatosInterior();
		
		
		
		System.out.println("------Creando un objeto del aclase interior statica no se puede ");
		//ClaseSuperior.ClaseInterior a = superior.new ClaseInterior("HOla ", 34);
		//a.mostrarDatosInterior(); //Objeto normal que en su interior tiene metodo statico
		//a.metodoMensajeStatico();
		
		System.out.println("------trayendo el metodo statico de la clase interior");
		ClaseSuperior.ClaseInterior.metodoMensajeStatico();
		
//		System.out.println("------Creano un objeto de la claseSuperior2");
//		//no necesito crear un objeto para referenciar a una clase statica interior
//		ClaseSuperior2.ClaseInferior2 a = new ClaseSuperior2.ClaseInferior2("SDFSDFSdf", 45);
//
//		a.mostrarDatosInferior2();
//		String aux = ClaseInferior2.staticoString();
//		System.out.println("El valor estatico de ClaseInterior2 es " + aux);
		
		
		System.out.println("Prueba");
		
		ClaseSuperior2 x = new ClaseSuperior2("Pablo", 45);
		ClaseSuperior2.ClaseInferior2 y = x.new ClaseInferior2("SDFSDFSDFSDFSDF", 45454545);
		//Llamando al atributo statico
		System.out.println(y.staticoString());
		
	}
}
