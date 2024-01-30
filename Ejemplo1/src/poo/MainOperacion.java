package poo;
import javax.swing.JOptionPane;
public class MainOperacion {

	public static void main(String[] args) {
		Operacion op1 = new Operacion();
		
		int a,b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
		
		int suma = op1.sumar(a, b);
		int resta = op1.restar(a, b);
		int multiplicacion = op1.multiplicar(a, b);
		int division = op1.dividir(a, b);
		op1.mostrar(suma, resta, multiplicacion, division);
		
	}
}
