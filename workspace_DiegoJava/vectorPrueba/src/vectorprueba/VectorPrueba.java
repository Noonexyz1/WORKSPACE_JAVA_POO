
package vectorprueba;
import java.util.Scanner;
public class VectorPrueba {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int A[],B[];
        A=new int[100];
        B=new int[100];
        int x=0,a=0;
        System.out.println("Ingrese el tamaño del vector");
        int n;
        n=entrada.nextInt();
        int b=n-1;
        System.out.println("Ingrese los valores al vector:");
        for(int i=0; i<n; i++){
            A[i]=entrada.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(A[i]+",");
        }
        
        System.out.println("operacion");
        int m;
        while( x<n){
            m=A[a];
            B[b]=m;
            a=a+1;
            b=b-1;
            x=x+1;
        }
        System.out.println("vestor a");
        for(int i=0; i<n; i++){
            System.out.print(A[i]+",");
        }
        System.out.println("\nvector b");
        for(int i=0; i<n; i++){
            System.out.print(B[i]+",");
        }
        for(int i=0; i<n; i++){
            A[i]=B[i];
        }
        
        System.out.println("VEctor A");
        for(int i=0; i<n; i++){
            System.out.print(A[i]+",");
        }
    }
    
}
