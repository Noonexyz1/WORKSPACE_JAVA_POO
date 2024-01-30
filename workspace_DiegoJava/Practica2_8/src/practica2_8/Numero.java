package practica2_8;
import java.util.Scanner;
public class Numero {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero,a,b;
        System.out.println("Ingrese un numero:");
        numero = entrada.nextInt();
        a = hallarFactorial(numero );
        b = hallarSumatoria(numero );
        System.out.println("El factorial es:"+a);
        System.out.println("El factorial es:"+b);
    }
    static int hallarFactorial(int numero){
        int fact=1;
        for(int i=1; i<=numero ; i++){
            fact=fact*i;
        }
        return fact;
    }
    static int hallarSumatoria(int numero){
        int sum=0;
        for(int i=1; i<=numero ; i++){
            sum=sum+i;
        }
        return sum;
    }
    
}
