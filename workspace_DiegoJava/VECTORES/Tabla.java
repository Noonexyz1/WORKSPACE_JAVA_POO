import java.util.Scanner;
public class Tabla {
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        int a,b;
        System.out.println("Ingrese un numero:");
        a=tc.nextInt();
        System.out.println("LA TABLA DE MULTIPLICAR DE "+a);
        for(int i=1; i<=10; i++){
            b=a*i;
            System.out.println(a+" X "+i+" = "+b);
        }
    }
}