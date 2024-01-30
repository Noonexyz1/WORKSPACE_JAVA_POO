package practica;
import java.util.Scanner;
public class Practica {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n,a,b,c,x,z=0,m;
        System.out.println("ingrese un numero");
        n=teclado.nextInt();
        a=n;
        b=n;
        c=0;
        while(n!=0){
            c=c+1;
            n=n/10;
        }
        a=a*((int)Math.pow(10,c-1));
        b=b/10;
        //System.out.println("c1="+c1+" "+a);
        while( 0<b){
            x=b%10;
            z=(z*10)+x;
            b=b/10;
        }
        //System.out.println("z es:"+z);
        m=a+z;
        System.out.println("Su capicua es:"+b);
    }
}
