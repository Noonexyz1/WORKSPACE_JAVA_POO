public class Serie1 {

    
    public static void main(String[] args) {
        int i;
        String coma;
        coma=",";
        System.out.println("SERIE CON FOR");
        for(i=1;i<=10;i++){
            System.out.print(i);
            if( i<=9){
                System.out.print(coma);
            }
        }
        System.out.println("");
        System.out.println("SERIE CON WHILE");
        int j=1;
        while(j<=10){
            System.out.print(j);
            if( j<=9){
                System.out.print(coma);
            }
            j=j+1;
        }
        System.out.println("");
        System.out.println("SERIE CON DO-WHILE");
        int k=1;
        do{
            System.out.print(k);
            if( k<=9){
                System.out.print(coma);
            }
            k=k+1;
        }while(k<=10);
    }
    
}