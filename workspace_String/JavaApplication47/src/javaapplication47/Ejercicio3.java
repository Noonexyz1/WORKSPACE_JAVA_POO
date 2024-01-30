package javaapplication47;
import java.util.Scanner;
public class Ejercicio3 {
    /*
Escriba una clase que permita eliminar un substring substr de un string str,
si no está devuelve el mismo string sin alterar.
    */
    public static void main(String[] args) {
        String cadena1,cadena2;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese una cadena:");
        cadena1=entrada.nextLine();
        System.out.println("Ingrese otra cadena:");
        cadena2=entrada.nextLine();
        operacion(cadena1,cadena2);
        
    }
    public static void operacion(String cadena1,String cadena2){
        int tam1,tam2,aux;
        String newcadena="",com1,com2;
        tam1=cadena1.length();
        tam2=cadena2.length();
        aux=tam1;
        for(int i=0; i<tam1;i++){
            com1=Character.toString(cadena1.charAt(i));
            for(int j=0; i<tam2; i++){
                
                com2=Character.toString(cadena2.charAt(j));
                
                if( com2.equals(com1 )){
                    newcadena=cadena2.substring(j);
                }
            }
        }
        
        System.out.println("La nueva cadena es:"+newcadena);
        
    }
    
    
}
