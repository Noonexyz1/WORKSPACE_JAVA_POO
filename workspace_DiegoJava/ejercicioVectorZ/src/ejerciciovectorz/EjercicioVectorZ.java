/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovectorz;

/**
 *
 * @author W10
 */
public class EjercicioVectorZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Zodiaco[];
        Zodiaco = new String[]{"Aries","Tauro","Geminis"
        ,"Cancer","Leo","Virgo","Libra","Escorpio","Sagitario","Capricornio","Acuario"
        ,"Piscis"};
        String fechaInicio[];
        fechaInicio = new String[]{"Marzo 21","Abril 21","Mayo 21"
        ,"Junio 21","Julio 23","Agosto 23","Septiembre 23","Octubre 23","Noviembre 22"
        ,"Diciembre 21","Enero 21","Febrero 19"};
        String fechaFin[];
        fechaFin=new String[]{"Abril 20","Mayo 20","Junio 20","Julio 20",""};
        
        for(int i=0; i<12; i++){
            System.out.println(Zodiaco[i]+" "+fechaInicio[i]+" "+fechaFin[i]);
        }
    }
    
}
