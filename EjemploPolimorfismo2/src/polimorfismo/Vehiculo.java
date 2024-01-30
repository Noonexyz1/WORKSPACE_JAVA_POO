package polimorfismo;

public class Vehiculo {

	protected String matricula;
	protected String marca;
	protected String modelo;
	private static int contador = 0;
	
	public Vehiculo() {
		// TODO Auto-generated constructor stub
		this.matricula = null;
		this.marca = null;
		this.modelo = null;
		Vehiculo.contador = Vehiculo.contador + 1;
	}
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String mostrarDatos() {
		return null;
	}
	
	public static int getContador() {
		return Vehiculo.contador;
	}
	
	public void descripcion() {
		
	}

	public void metodoDeportivoPadre() {
		System.out.println("Deportivo puedes verme??");
	}
	
}
