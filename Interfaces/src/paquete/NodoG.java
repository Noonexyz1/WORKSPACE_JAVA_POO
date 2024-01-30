package paquete;

public interface NodoG {

	/*
	 * La interfaz NodoG define tres m�todos abstractos y adem�s p�blicos; 
	 * sin embargo, no debe especificarse ni abstract ni public 
	 * ya que todos los m�todos de interface lo son.
	 * */
	
	
	boolean igual(NodoG t);
	NodoG asiganar(NodoG t);
	void escribir(NodoG t);
	
	/*
	 * La interfaz especifica el comportamiento com�n que tiene un conjunto de clases,
	 * 
	 * */
	
}
