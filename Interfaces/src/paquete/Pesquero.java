package paquete;

public class Pesquero implements Barco{

	private int eslora;
	private double potencia;
	private int pescadores;
	String nombre;
	
	public Pesquero(int tripulacion) {
		this.pescadores = tripulacion;
		System.out.println("Se crae objeto barco Pesquero.");
	
	}
	
	@Override
	public void alarma() {
		System.out.println("Alarma desde el perquero " + nombre + " !!!");
	}
	
	@Override
	public void mensajeSocorro(String mensaje) {
		System.out.println("SOS, SOS " + mensaje);
	}
	
}
