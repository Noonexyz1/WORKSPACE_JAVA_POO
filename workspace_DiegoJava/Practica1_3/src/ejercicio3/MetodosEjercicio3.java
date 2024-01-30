package ejercicio3;
import java.util.Scanner;
public class MetodosEjercicio3 {
    Scanner entrada=new Scanner(System.in);
    int M,N,a=0,b=0,A[][],B[],m,r,x=0,y=0;
    void ingresarDimencion(){
        System.out.println("Ingrese las dimensiones de la matriz");
        M=entrada.nextInt();
        N=entrada.nextInt();
        A=new int [M][N];
        B=new int [M];
        b=M-1;
    }
    void mostrarMatriz(){
        for(int i=0;i<M; i++){
            for(int j=0; j<N; j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
    void llenarMatriz(){
        System.out.println("Ingresar valores a la matriz:");
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                A[i][j]=entrada.nextInt();
            }
        }
    }
    void operacion(){
        for(int j=0;j<N; j++){
            while(x<M){
                m=A[a][j];
                B[b]=m;
                a=a+1;
                b=b-1;
                x=x+1;
            }
            while(y<M){
                r=B[y];
                A[y][j]=r;
                y=y+1;
            }
            x=0;
            y=0;
            a=0;
            b=M-1;
        }
    }
}
