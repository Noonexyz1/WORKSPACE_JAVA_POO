package paquete;

public interface ArbolBAbstracto {

	final int MAX_CLAVES = 4;
	void insertar(Object clave);
	void eliminar(Object clave);
	void recorrer();
	/*
	 * Esta interfaz muestra los métodos que todo árbol B debe implementar.
	 * */
	
}
