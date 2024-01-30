package practica2_2;
import java.util.Scanner;
public class TrianguloRectangulo {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int a,b;
        double area,hipotenusa;
        System.out.println("Ingrese altura:");
        a=entrada.nextInt();
        System.out.println("Ingrese base:");
        b=entrada.nextInt();
        area = hallarArea(a,b);
        hipotenusa = hallarHipotenusa(a, b);
        System.out.println("El area del triangulo rectangulo es:"+area);
        System.out.println("La hipotenusa del triangulo rectangulo es:"+hipotenusa);
    }
    static double hallarArea(int a,int b){
        double area;
        area = (b*a)/(2+0.00);
        return area;
    }
    static double hallarHipotenusa(int a,int b){
        double hipotenusa;
        double x;
        x=(int)Math.pow(a,2)+Math.pow(b,2);
        hipotenusa = Math.sqrt(x);
        return hipotenusa;
    }
    
}
