package polimorfismo;

public class Deportivo extends Vehiculo{

	private int cilindrada;
	
	public Deportivo(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}
	
	
	//polimorfismo solo puedo hacerlo con los metodos @Override
	@Override
	public String mostrarDatos() {
		return "La matricula es: " + matricula + " Marca " + marca + " Modelo " + modelo + " cilindrada " + this.cilindrada;
	}
	
	@Override
	public void descripcion() {
		System.out.println("Yo corro por las autopistas...");
	}
	
	public void miDueno() {
		System.out.println("El dueno de este deportivo es::::::::: ya saben jaj");
	}
	
	public int getCilindrada() {
		return this.cilindrada;
	}
	
}
