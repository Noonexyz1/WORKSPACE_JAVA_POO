package paquete;

public class Main {

	public static void main(String[] args) {
		Bolsa q;
		q = new Bolsa1();
		q.insertar("Manzanas");
		
		q = new Bolsa2();
		q.insertar(new Integer(5));
		
	}
}
