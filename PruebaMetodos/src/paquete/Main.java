package paquete;

public class Main {

	
	public static int sumar(int a, int b, int res) {
		res = a + b;
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println("Prueba de Metodos ");
		
		int a = 5;
		int b = 5;
		int res = 0;
		System.out.println(res);
		System.out.println(sumar(a, b, res));
		System.out.println(res);
	}
	
}
