package ejercicio7;

public class Main {

	public static void main(String [] args) {
		
		Pila objeto1=new Pila();
		Pila objeto2=new Pila();
		
		objeto1.llenarPila();
		objeto1.imprimir();
		
		
		objeto2.llenarPila();
		objeto2.imprimir();
		apilar(objeto1,objeto2);
		objeto2.imprimir();
		
	}
	
	public static void apilar(Pila a,Pila b) {
		while(!a.vacia()) {
			b.poner(a.quitar());
		}
	}
	
}
