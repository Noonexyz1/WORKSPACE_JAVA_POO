package practica2_12;
import java.util.Scanner;
public class Series {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un limite:");
        int n=entrada.nextInt();
        serie1(n);
        System.out.println();
        serie2(n);
        System.out.println();
        serie3(n);
    }
    static void serie1(int n){
        int x=0,f=0;
        while(x!=n){
            if( f==0 ){
                System.out.print("0,0,0,");
                f=1;
            }else{
                System.out.print("1,1,1,");
                f=0;
            }
            x=x+1;
        }
    }
    static void serie2(int n){
        int m,x=0;
        for(int i=0; i<n; i++){
            m=1;
            while(m<=3){
                System.out.print(m+",");
                m=m+1;
            }
        }
    }
    static void serie3(int n){
        int c=1,s=100;
        for(int i=0; i<n; i++){
            if(i%2==0){
                System.out.print(c+"-");
                c=c+1;
            }else{
                System.out.print(s+"-");
                s=s-1;
            }
        }
    }
}
