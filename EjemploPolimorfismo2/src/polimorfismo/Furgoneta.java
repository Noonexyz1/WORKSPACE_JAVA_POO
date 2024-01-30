package polimorfismo;

public class Furgoneta extends Vehiculo{

	private int carga;
	
	public Furgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}
	
	
	public Furgoneta() {
		super();
		this.carga = 0000000001;
	}
	
	@Override
	public String mostrarDatos() {
		return "La matricula es: " + matricula + " Marca " + marca + " Modelo " + modelo + " cargar " + this.carga;
	}
	
	@Override
	public void descripcion() {
		System.out.println("Yo voy lento...");
	}
}
