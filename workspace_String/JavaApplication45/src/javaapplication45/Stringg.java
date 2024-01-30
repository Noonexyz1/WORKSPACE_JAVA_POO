package javaapplication45;
import java.util.Scanner;
public class Stringg {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String xpunto=".";
        String xnombre1;
        String xapellidoP;
        String xapellidoM;
        String codigo;
        System.out.println("Ingrese primer nombre:");
        xnombre1=entrada.next();
        System.out.println("Ingrese apellido paterno:");
        xapellidoP=entrada.next();
        System.out.println("Ingrese apellido materno:");
        xapellidoM=entrada.next();
        codigo = codigo_nombre(xpunto,xnombre1,xapellidoP,xapellidoM);
        System.out.println("Tu codigo es:"+codigo);
    }
    public static String codigo_nombre(String punto,String nombre,
                                        String apellidoP,String apellidoM){
        
        String codigo;
        char p,n,aP,aM;
        String pp,nn,aPP,aMM;
        p=punto.charAt(0);
        n=nombre.charAt(0);
        aP=apellidoP.charAt(0);
        aM=apellidoM.charAt(0);
        pp=Character.toString(p);
        nn=Character.toString(n);
        aPP=Character.toString(aP);
        aMM=Character.toString(aM);
        codigo = pp+nn+pp+aPP+pp+aMM;
        return codigo;
    }
}
