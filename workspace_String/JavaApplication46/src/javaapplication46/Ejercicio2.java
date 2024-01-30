package javaapplication46;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String oracion;
        String nuevaoracion;
        String ocurrencia1,ocurrencia2;
        System.out.println("Ingrese la oracion:");
        oracion = entrada.nextLine();
        System.out.println("Ingrese que caracter desea sustituir:");
        ocurrencia1=entrada.next();
        System.out.println("Ingrese la letra por el cual quiere cambiar:");
        ocurrencia2=entrada.next();
        nuevaoracion=noSeMeOcurreUnNombre(oracion,ocurrencia1,ocurrencia2 );
        System.out.println("La nueva cadena es:"+nuevaoracion);
    }
    public static String noSeMeOcurreUnNombre(String oracion,String ocurrencia1,String ocurrencia2){
        String nuevaoracion;
        nuevaoracion = oracion.replace(ocurrencia1,ocurrencia2);
        return nuevaoracion;
    }
}
