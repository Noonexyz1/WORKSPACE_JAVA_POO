package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int mat[][];
        int c=0;
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
        for(int i=0; i<3; i++){
            for(int j=0; i<3; j++){
                c=c+mat[i][j];
            }
        }
        System.out.println("la suma de todos los elementos es:"+c);
    }
    
}
