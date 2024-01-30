package ejercicio2;
public class Pila {
	
	private String[] vector;
	private int tope=-1;
	
	
	
	public Pila(int size) {
		vector=new String[size];
	}
	
	public void push (String data) {
		tope++;
		if( tope < vector.length) {
			vector[tope]=data;
		}
		else {
			tope--;
		}
	}
	public void pop() {
		if(!empty() == true) {
			vector[tope]=null;
			tope--;
		}
	}
	public boolean empty() {
		if(tope == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	public String peek() {
		if(!empty() == true) {
			return vector[tope];
		}
		else {
			return null;
		}
	}
	
	public void mostrar() {
		for(int i=0; i<vector.length; i++) {
			System.out.print("["+vector[i]+"]");
		}
	}
}
