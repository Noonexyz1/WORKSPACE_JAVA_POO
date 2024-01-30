package practica2_3;
import java.util.Scanner;
public class Rectangulo {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int base,altura;
        System.out.println("Ingrese base:");
        base=entrada.nextInt();
        System.out.println("Ingrese altura:");
        altura=entrada.nextInt();
        System.out.println("El perimetro es:"+obtenerPerimetro(base,altura));
        System.out.println("El area es:"+obtenerArea(base,altura));
        
    }
    static double obtenerPerimetro(int base,int altura){
        double p;
        p=2*base+2*altura;
        return p;
    }
    static double obtenerArea(int base, int altura){
        double a;
        a = base*altura;
        return a;
    }
    
}
