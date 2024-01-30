package pila;
public class Pila {
	
	private Integer[] vector;
	private int tope=-1;
	
	
	
	public Pila(int size) {
		vector =new Integer[size];
	}
	
	public void push (Integer data) {
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
	public Integer peek() {
		if(!empty() == true) {
			return vector[tope];
		}
		else {
			return null;
		}
	}
	
	public void mostrar() {
		
		System.out.println("tope es:"+tope);
		for(int i=0; i<tope+1; i++) {
			System.out.print("["+vector[i]+"]");
		}
	}
	
}
