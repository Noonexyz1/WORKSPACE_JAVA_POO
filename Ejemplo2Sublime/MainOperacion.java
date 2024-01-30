import Operacion;
public class MainOperacion{
	public static void main(String[] args) {

		Operacion op1 = new Operacion();

		op1.leerNumero();
		op1.sumar();
		op1.restar();
		op1.multiplicar();
		op1.dividir();

		op1.mostrar();
	}
}