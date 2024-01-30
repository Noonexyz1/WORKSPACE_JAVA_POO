package practica2_7;
import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese una cantidad de numeros a ingresar:");
        int cantidad,numIntroducido;
        int SumaPares=0,SumaImpares=0,CantidadPares=0,CantidadImpares=0;
        int a=0,b=0,c=0,d=0;
        cantidad=entrada.nextInt();
        System.out.println("ingrese los numeros:");
        for(int i=0; i<cantidad; i++){
            numIntroducido=entrada.nextInt();
            SumaPares=sumaPares(numIntroducido,a);
            SumaImpares=sumaImpares(numIntroducido,b);
            CantidadPares=cantidadPares(numIntroducido,c );
            CantidadImpares=cantidadImpares(numIntroducido,d);
        }
        System.out.println("SumaPares"+SumaPares);
        System.out.println("SumaImpares"+SumaImpares);
        System.out.println("CantidadPares"+CantidadPares);
        System.out.println("CantidadImpares"+CantidadImpares);
    }
    static int sumaPares(int numIntroducido,int a){
        if(numIntroducido % 2 == 0){
            a=a+numIntroducido;
        }
        return a;
    }
    static int sumaImpares(int numIntroducido,int b){
        if(numIntroducido % 2 == 1 ){
            b=b+numIntroducido;
        }
        return b;
    }
    static int cantidadPares(int numIntroducido,int c ){
        if(numIntroducido % 2 == 0){
            c=c+1;
        }
        return c;
    }
    static int cantidadImpares(int numIntroducido,int d){
        if(numIntroducido % 2 == 0){
            d=d+1;
        }
        return d;
    }
}
