package paquete;

public class Resta extends Operacion {

	private double res;
	
	@Override
	public void realizaOperacion(int a, int b) {
		this.res = a - b;
	}
	
	@Override
	public double getRes() {
		System.out.println("El resultado de la resta es:");
		return this.res;
		
	}
}
