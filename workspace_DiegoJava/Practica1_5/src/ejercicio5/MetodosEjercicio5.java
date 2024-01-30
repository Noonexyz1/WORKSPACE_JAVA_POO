package ejercicio5;
import java.util.Scanner;
public class MetodosEjercicio5 {
    Scanner entrada=new Scanner(System.in);
    int m,i,j,a[][],cp,ci,s=0,e;
    void contParImpar(){
        for(i=0; i<m; i++){
            for(j=0; j<m; j++){
                if(a[i][j]%2==0){
                    cp=cp+1;
                }else{
                    ci=ci+1;
                }
            }
        }System.out.println("Hay "+cp+" elementos pares");
        System.out.println("Hay "+ci+" elementos impares");
    }
    int sumDiagonalSec(){
        int x=m-1;
        for(i=0; i<m; i++){
            s=s+a[i][x];
            x=x-1;
        }return s;
    }
    int posicionFC(){
        e=a[m-1][m-1];
        return e;
    }
    void llenarMatriz(){
        System.out.println("Ingrese los valores a la matriz:");
        for(i=0; i<m; i++){
            for(j=0; j<m; j++){
                a[i][j]=entrada.nextInt();
            }
        }
    }
    void mostrarMatriz(){
        for(i=0; i<m; i++){
            for(j=0; j<m; j++){
                System.out.print(a[i][j]+"\t");
            }System.out.println();
        }
    }
    void leerDimencion(){
        System.out.println("Ingrese M:");
        m=entrada.nextInt();
        a=new int[m+1][m+1];
    }
}
