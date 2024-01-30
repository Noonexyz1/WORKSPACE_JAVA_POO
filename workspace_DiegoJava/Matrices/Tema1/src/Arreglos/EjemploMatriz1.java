package Arreglos;
import java.util.Scanner;
public class EjemploMatriz1 {
	public static void main(String [] args){
		int B[][]={{7,9,1},{4,3,6},{-1,8,0},{4,1,1}};//Inicializa la matriz B;
					//Fila  //FIla
		//Imprimir la matriz;
		int f,c;
		Scanner sc=new Scanner (System.in);
		for(int i=0; i<4; i++){//fila
			for(int j=0; j<3; j++){//columna
				System.out.print( B[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("Igrese la fila y la columna del elemnto a modificar;");
		f=sc.nextInt();
		c=sc.nextInt();
		System.out.println("El valor actual es..."+B[f][c]);
		System.out.println("Ingrese el nuevo elemnto...");
		B[f][c]=sc.nextInt();
		
		for(int i=0; i<4; i++){//fila
			for(int j=0; j<3; j++){//columna
				System.out.print( B[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
}
