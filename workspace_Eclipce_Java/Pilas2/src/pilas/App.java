package pilas;

public class App {

	public static void main(String [] args) {
		Pila objeto=new Pila();
		Pila objeto2=new Pila();
		Pila objeto3=new Pila();
		
		
		
		objeto.llenar();
		objeto.mostrar();
		
		System.out.println("---------------------");
		
		objeto2.llenar();
		objeto2.mostrar();
		
		System.out.println("---------------------");
		
		objeto3.sumaDePilas(objeto,objeto2,objeto3);
		objeto3.mostrar();
		
		
		
	}
}
