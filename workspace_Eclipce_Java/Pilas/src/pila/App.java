package pila;
public class App {
	public static void main(String [] args) {
		Pila pila=new Pila(10);
		pila.push(1);
		pila.push(3);
		pila.mostrar();
		
		while(! pila.empty()) {
			System.out.println(pila.peek());
			pila.pop();
		}
		
		pila.mostrar();
		
		
	}
}
