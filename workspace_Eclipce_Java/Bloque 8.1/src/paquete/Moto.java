package paquete;

public class Moto extends Vehiculo {
	
	private boolean reparar_cadena;
	
	
	public Moto(String color,int cv,boolean reparar_cadena) {
		super(color,cv, 2);
		this.reparar_cadena=reparar_cadena;
	}
	
	
	
	
}
