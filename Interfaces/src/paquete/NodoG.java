package paquete;

public interface NodoG {

	/*
	 * La interfaz NodoG define tres métodos abstractos y además públicos; 
	 * sin embargo, no debe especificarse ni abstract ni public 
	 * ya que todos los métodos de interface lo son.
	 * */
	
	
	boolean igual(NodoG t);
	NodoG asiganar(NodoG t);
	void escribir(NodoG t);
	
	/*
	 * La interfaz especifica el comportamiento común que tiene un conjunto de clases,
	 * 
	 * */
	
}
