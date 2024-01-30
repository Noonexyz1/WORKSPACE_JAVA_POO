package practica2_9;
import java.util.Scanner;
public class Numero {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero,a,b;
        int mayor=0,menor=10000;
        numero = entrada.nextInt();
        a=digitoMayor(numero,mayor);
        b=digitoMenor(numero,menor);
        System.out.println("El digito mayor es:"+a);
        System.out.println("El digito menor es:"+b);
    }
    static int digitoMayor(int numero,int mayor){
        int x;
        while(numero >= 0){
            x=numero%10;
            if(x > numero){
                mayor=x;
            }
            numero=numero/10;
        }
        return mayor;
    }
    static int digitoMenor(int numero,int menor){
        int x;
        while(numero >= 0){
            x=numero%10;
            if(x < numero){
                menor=x;
            }
            numero=numero/10;
        }
        return menor;
    }
    
}
