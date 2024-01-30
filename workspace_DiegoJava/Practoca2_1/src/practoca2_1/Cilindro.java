package practoca2_1;
import java.util.Scanner;
public class Cilindro {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int r,h;
        double a;
        int v;
        System.out.println("Ingrese radio:");
        r=entrada.nextInt();
        System.out.println("Ingrese altura:");
        h=entrada.nextInt();
        a = calcularArea(r,h);
        System.out.println("El area es:"+a);
        v = calcularVolumen(r,h);
        System.out.println("El volumen es:"+v);
    }
    static double calcularArea(int  r,int  h){
        double a;
        a=2*(3.14)*r*r+r*h;
        return a;
    }
    static int calcularVolumen(int r,int h){
        int v;
        v=r*r*h;
        return v;
    }
    
}
