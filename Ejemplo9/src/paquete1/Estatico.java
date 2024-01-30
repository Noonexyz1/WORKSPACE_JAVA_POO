package paquete1;

public class Estatico {
 
	//atributos mienbro de la clase Estatico
	private static String frase = "Primera Frase...";
	//Los atributos staticos ya no necesita que instanciemos un objetos
	
	
	//metodos mienbros staticos de la clase Estaticos
	public static int sumar(int num1, int num2) {
		int suma = num1 + num2;
		return suma;
	}
	//Ya no necesitan ser instanciados, se pueden llamar directamente
	
	
	
	//metodo Main mienbro de la Clase  Estatico
	public static void main(String[] args) {
					// el codigo despues del igual se llama INSTANCIAR
		Estatico ob1 = new Estatico();
		Estatico ob2 = new Estatico();
		
		ob2.frase = "Segunda Frase...";
		
		System.out.println(ob1.frase);
		System.out.println(ob2.frase);
		
		System.out.println("La suma es... " + sumar(10, 5)); 
		
		
	}
}
