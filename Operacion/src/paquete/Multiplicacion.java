package paquete;

public class Multiplicacion extends Operacion{
	
	
	private double res;
	
	@Override
	public void realizaOperacion(int a, int b) {
		this.res = a * b;
	}
	
	@Override
	public double getRes() {
		System.out.println("El resultado de la multiplicacion es: ");
		return this.res;
	}

}
