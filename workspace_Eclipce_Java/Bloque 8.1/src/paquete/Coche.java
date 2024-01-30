package paquete;

public class Coche extends Vehiculo{
	
	private int puertas;
	
	
	
	public Coche(String color,int cv,int puertas) {
		
		super(color,cv,4);//llama al constructor de la clase vehiculo
		this.puertas=puertas;
		
		
		
	}
	
	
	
}
