package ejercicio2;
import java.util.Scanner;
public class MetodosEjercicio2 {
    Scanner entrada=new Scanner(System.in);
    int a[][];
    int m;
    int n;
    void pedir2numeros(){
        System.out.println("Ingrese tamaño de fila:");
        m=entrada.nextInt();
        System.out.println("Ingrese tamaño de columna:");
        n=entrada.nextInt();
        a=new int[m][n];
    }
    void operacion(){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j]=((i+1)*10)+(j+1);
            }
        }
    }
    void mostrar(){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
