public class Serie3 {
    public static void main(String[] args) {
        System.out.println("SERIE CON FOR");
        int a,b ,c;
        a=-1;
        b=1;
        String coma;
        coma = ",";
        for(int i=1; i<=10; i++){
            c=a+b;
            b=a;
            a=c;
            System.out.print(" "+(c*-1));
            if( i<=9){
               System.out.print(coma);
            }
        }
        System.out.println();
        System.out.println("SERIE CON WHILE");
        int x,y ,z;
        x=-1;
        y=1;
        int j=1;
        while(j<=10){
            z=x+y;
            y=x;
            x=z;
            System.out.print(" "+(z*-1));
            if( j<=9){
               System.out.print(coma);
            }
            j=j+1;
        }
        System.out.println();
        System.out.println("SERIE CON DO-WHILE");
        int m,n ,o;
        m=-1;
        n=1;
        int k=1;
        do{
            o=m+n;
            n=m;
            m=o;
            System.out.print(" "+(o*-1));
            if( k<=9){
               System.out.print(coma);
            }
            k=k+1;
        }while(k<=10);
    }
}
