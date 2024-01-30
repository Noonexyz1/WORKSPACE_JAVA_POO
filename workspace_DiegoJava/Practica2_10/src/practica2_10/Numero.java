package practica2_10;
import java.util.Scanner;
public class Numero {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero,invertido;
        System.out.println("Ingrese un numero:");
        numero=entrada.nextInt();
        invertido=inverso(numero);
        capicua(numero,invertido);
    
    }
    static int inverso(int n){
        int a=n,x;
        int m=0;
        while(a!= 0 ){
            x=a%10;
            m=(m*10)+x;
            a=a/10;
        }
        System.out.println("el invertido de "+n+" es :"+m);
        return m;
    }
    static void capicua(int n,int invertido){
        if(n==invertido){
            System.out.println(n+" es capicua");
        }
        else{
            System.out.println(n+" No es capicua");
        }
    }
}
