public class Serie2 {
    public static void main(String[] args) {
        int i;
        int par=0;
        int imp=100;
        String coma;
        coma=",";
        System.out.println("SERIE CON FOR");
        for( i=1; i<=10; i++){
            if( i<=10){
                if(i%2!=0){
                    par=par+1;
                    System.out.print(" "+par);
                }
                 else{
                    imp=imp-1;
                    System.out.print(" "+imp);
                }
                if(i<=9){
                    System.out.print(coma);
                }
            }
        }
        System.out.println();
        System.out.println("SERIE CON WHILE");
        int j=1;
        int par1=0;
        int imp1=100;
        while( j<=10){
            if( j<=10){
                if(j%2!=0){
                    par1=par1+1;
                    System.out.print(" "+par1);
                }
                 else{
                    imp1=imp1-1;
                    System.out.print(" "+imp1);
                }
                if(j<=9){
                    System.out.print(coma);
                }
            }
            j=j+1;
        }
        System.out.println();
        System.out.println("SERIE CON DO-WHILE");
        int k=1;
        int par2=0;
        int imp2=100;
        do{
            if( k<=10){
                if(k%2!=0){
                    par2=par2+1;
                    System.out.print(" "+par2);
                }
                 else{
                    imp2=imp2-1;
                    System.out.print(" "+imp2);
                }
                if(k<=9){
                    System.out.print(coma);
                }
            }
            k=k+1;
        }while(k<=10);
        
    }
    
}
