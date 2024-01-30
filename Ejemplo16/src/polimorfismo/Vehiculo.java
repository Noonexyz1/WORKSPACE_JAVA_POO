package polimorfismo;

public class Vehiculo {

	//Atributos de la clase 
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	//Metodos de la clase
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	
	
	public String mostrarDatos() {
		String mostrarDatos = "";
		mostrarDatos = "La matricula del vehiculo es: " + matricula + 
				 		"La marca del vehiculo es " + marca + 
				 		"El modelo del vehiculo es " + modelo;
		return mostrarDatos;
	}

	
	
}
