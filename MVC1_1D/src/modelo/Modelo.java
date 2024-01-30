package modelo;

import interfaces.Reglas_del_programa;

public class Modelo implements Reglas_del_programa.Modelo {

	private int numeroUno;
	private int numeroDos;
	private int resultado;
	
	/* Getters and Setters */
	public void setNumeroUno(int numeroUno) {
		this.numeroUno = numeroUno;
	}
	public int getNumeroUno() {
		return this.numeroUno;
	}
	public int getNumeroDos() {
		return numeroDos;
	}
	public void setNumeroDos(int numeroDos) {
		this.numeroDos = numeroDos;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	/* Metodos de mi modelo */
	@Override
	public int multiplicar() {
		return this.resultado = this.numeroUno * this.numeroDos;
		
	}


}
