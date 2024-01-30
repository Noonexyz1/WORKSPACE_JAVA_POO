package practica2_6;
import java.util.Scanner;
public class Numeros {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int cantidad,numIntroducido,maYor=0,meNor=0,suMa=0;
        System.out.println("Ingrese cantidad de numeros a introducir");
        cantidad=entrada.nextInt();
        int a,b,c;
        int mayor=0,menor=100000,suma=0;
        for(int i=0; i<cantidad; i++){
            numIntroducido=entrada.nextInt();
            a=numIntroducido;
            b=numIntroducido;
            c=numIntroducido;
            maYor=hallarMayor(a,mayor);
            meNor=hallarMenor(b,menor);
            suMa=hallarSuma(c,suma);
        }
        
        System.out.println("El mayor es "+maYor);
        System.out.println("El menor es "+meNor);
        System.out.println("la suma de los numeros es "+suMa);
        
    }
    static int hallarMayor(int numIntroducido,int mayor){
        if(numIntroducido > mayor){
            mayor=numIntroducido;
        }
        return mayor;
    }
    static int hallarMenor(int numIntroducido,int menor){
        if(numIntroducido < menor){
            menor=numIntroducido;
        }
        return menor;
    }
    static int hallarSuma(int numIntroducido,int suma){
        suma=suma+numIntroducido;
        return suma;
    }
    
}
