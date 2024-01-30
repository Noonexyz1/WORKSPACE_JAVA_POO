package pruebamatriz;
import java.util.Scanner;
public class PruebaMatriz {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int M,N;
        System.out.println("Ingrese las dimensiones de la matriz");
        M=entrada.nextInt();
        N=entrada.nextInt();
        int A[][],B[];
        A=new int [M][N];
        B=new int [M];
        int m,r;
        int a=0,b=M-1;
        int x=0,y=0;
        
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                A[i][j]=entrada.nextInt();
            }
        }
        
        
        
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        
        
        
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
        
        System.out.println();
        
        
        for(int i=0;i<M; i++){
            for(int j=0; j<N; j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
    
}
