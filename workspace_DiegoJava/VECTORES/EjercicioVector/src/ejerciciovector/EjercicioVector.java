
package ejerciciovector;
import java.util.*;
public class EjercicioVector {

    public static void main(String[] args){
        /*String materia[];
        materia=new String[6];
        materia[]={"Programacion II","Estructura de Datos","Fisica III"
        ,"Estadistica I","Ingles Tecnico II","Ecuaciones Diferenciales"};
        nombre=new String[6];       
                
                ={"Programacion II","Estructura de Datos","Fisica III"
        ,"Estadistica I","Ingles Tecnico II","Ecuaciones Diferenciales"};
        String nombre[]={"Ing. Palacios Zuleta","Lic. Maritza Condori","Ing. Milton Zurita"
        ,"Lic Carmen Vega","Lic. Ruth Palacios","Lic. Maritza Condori"};
        nombre=new String[6];
        materia=new String[6];
        for(int i=0; i<6; i++){
            System.out.println(materia[0]);
        }
        */
        String nombre[];
        nombre= new String[]{"Ing. Palacios Zuleta","Lic. Maritza Condori","Ing. Milton Zurita"
        ,"Lic Carmen Vega","Lic. Ruth Palacios","Lic. Maritza Condori"};
        String materia[];
        materia=new String[]{"Programacion II","Estructura de Datos","Fisica III"
        ,"Estadistica I","Ingles Tecnico II","Ecuaciones Diferenciales"}; 
        for(int i=0; i<6; i++){
            System.out.println(materia[i]+"\t\t"+nombre[i]);
        }
        
    }
    
}
