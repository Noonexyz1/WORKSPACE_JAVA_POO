package modelo;

public class Modelo {
	private int numeroUno;
	private int numeroDos;
	private int resultado;
	
	/*Setters y Getters*/
	public int getNumeroUno() {
		return numeroUno;
	}
	public void setNumeroUno(int numeroUno) {
		this.numeroUno = numeroUno;
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
	
	/*Metodos*/
	public int multiplicar() {
		return this.resultado = this.numeroUno * this.numeroDos;
		
	}
}
