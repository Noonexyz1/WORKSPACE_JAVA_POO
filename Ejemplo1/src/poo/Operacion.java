package poo;
import javax.swing.JOptionPane;
public class Operacion{

	
	//atributos
	/*
	int numero1;
	int numero2;
	int suma;
	int resta;
	int multiplicacion;
	int division;*/



	//Metodos
	/*public void leerNumeros(){
		//JOptionPane ventana = new JOptionPane();
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:"));
	}*/

	public int sumar(int numero1, int numero2){
		int suma;
		suma = numero1 + numero2;
		return suma;
	}

	public int restar(int numero1, int numero2){
		int resta = numero1 - numero2;
		return resta;
	}

	public int multiplicar(int numero1, int numero2){
		int multiplicacion = numero1 * numero2;
		return multiplicacion;
	}

	public int dividir(int numero1, int numero2){
		int division = numero1 / numero2;
		return division;
	}

	public void mostrar(int suma, int resta, int multiplicacion, int division ){
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + multiplicacion);
		System.out.println("La division es: " + division);
	}

}
