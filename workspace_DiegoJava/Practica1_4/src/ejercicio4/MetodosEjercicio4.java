package ejercicio4;
import java.util.Scanner;
public class MetodosEjercicio4 {
    Scanner entrada = new Scanner(System.in);
    int A[][];
    int b;
    void ingresarB(){
        System.out.println("Ingrese el tamaño de la matriz:");
        b=entrada.nextInt();
        A= new int[b+1][b+1];
    }
    void llenarMatriz(){
        for(int i=0; i<b; i++){
            for(int j=0; j<b; j++){
                if(i<=j){
                    A[i][j]=b*i;
                }
                else{
                    if(i>j){
                        A[i][j]=0;
                    }
                }
            }
        }
    }
    void mostrarMatriz(){
        for(int i=0; i<b; i++){
            for(int j=0; j<b; j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
