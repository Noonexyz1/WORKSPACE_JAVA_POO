package paquete;

public class Suma extends Operacion{

	private double res;
	
	
	
	@Override
	public void realizaOperacion(int a, int b) {
		this.res = a + b;
	}
	
	@Override
	public double getRes() {
		System.out.println("El resultado de la suma es:");
		return this.res;
	}
	
}
