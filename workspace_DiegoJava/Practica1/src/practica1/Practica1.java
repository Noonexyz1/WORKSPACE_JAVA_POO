package practica1;
import java.util.Scanner;
public class Practica1 {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int mat[][];
        int x;
        mat = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; i<3; j++){
                System.out.println("Ingrese valor:");
                mat[i][j]=teclado.nextInt();
            }
        }
        System.out.println("Los valores son:");
        for(int i=0; i<3; i++){
            for(int j=0; i<3; j++){
                System.out.print(mat[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("Ingrese el valro que desea sumar a cada elemento");
        x=teclado.nextInt();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                 mat[i][j]=mat[i][j]+x;
            }
        }
         for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(mat[i][j]);
            }
             System.out.println("\n");
        }
    }
    
}
