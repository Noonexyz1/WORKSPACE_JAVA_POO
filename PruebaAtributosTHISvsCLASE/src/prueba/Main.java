package prueba;

public class Main {

	public static void main(String[] args) {
	
		Auto a = new Auto("Nissan", 0);
		Auto b = new Auto();
		
		Auto.setPrecio(5000);
		a.mostrarDatos();
		b.mostrarDatos();
		
		
	}
}
