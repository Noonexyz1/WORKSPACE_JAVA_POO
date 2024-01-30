package paquete;

public class Principal {

	//Atributos de la Clase
	
	//constructores, getters and setters y metodos de la clase
	public static void main(String[] args) {
		ClaseA a,b;
		a = new ClaseA(1, 2.2, "A", true);
		b = new ClaseA(2, 2.4, "B");
		
		b.mostrarDatos();
		System.out.println(b.getBit());
		
		a.mostrarDatos();
		System.out.println(a.getBit());
		
		
		
	}

}
