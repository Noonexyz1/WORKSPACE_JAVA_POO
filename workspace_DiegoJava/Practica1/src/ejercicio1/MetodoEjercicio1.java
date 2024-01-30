package ejercicio1;
import java.util.Scanner;
public class MetodoEjercicio1 {
    Scanner entrada=new Scanner(System.in);
    int m[][];
    void llenar(){
        System.out.println("Ingrese valores a la matriz");
        m=new int[4][4];
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(i<=j){
                    m[i][j]=entrada.nextInt();
                }
                else{
                    m[i][j]=0;
                }
            }
        }
    }
    void mostrar(){
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
