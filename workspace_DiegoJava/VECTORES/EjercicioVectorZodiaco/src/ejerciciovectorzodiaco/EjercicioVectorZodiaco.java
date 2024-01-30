
package ejerciciovectorzodiaco;

public class EjercicioVectorZodiaco {

    public static void main(String[] args) {
        String Zodiaco[];
        Zodiaco = new String[12];/*{"Aries","Tauro","Geminis"
        ,"Cancer","Leo","Virgo","Libra","Escorpio","Sagitario","Capricornio","Acuario"
        ,"Piscis"};*/
        Zodiaco[0]="Aries";
        Zodiaco[1]="Tauro";
        Zodiaco[2]="Geminis";
        Zodiaco[3]="Cancer";
        Zodiaco[4]="Leo";
        Zodiaco[5]="Virgo";
        Zodiaco[6]="Libra";
        Zodiaco[7]="Escorpio";
        Zodiaco[8]="Scagitario";
        Zodiaco[9]="Capricornio";
        Zodiaco[10]="Acuario";
        Zodiaco[11]="Piscis";
        
        String fechaInicio[];
        fechaInicio = new String[12];/*{"Marzo 21","Abril 21","Mayo 21"
        ,"Junio 21","Julio 23","Agosto 23","Septiembre 23","Octubre 23","Noviembre 22"
        ,"Diciembre 21","Enero 21","Febrero 19"};*/
        fechaInicio[0]="Marzo 21";
        fechaInicio[1]="Abril 21";
        fechaInicio[2]="Mayo 21";
        fechaInicio[3]="Junio 21";
        fechaInicio[4]="Julio 23";
        fechaInicio[5]="Agosto 23";
        fechaInicio[6]="Septiembre 23";
        fechaInicio[7]="Octubre 23";
        fechaInicio[8]="Noviembre 22";
        fechaInicio[9]="Diciembre 21";
        fechaInicio[10]="Enero 21";
        fechaInicio[11]="Febrero 19";
        
        String fechaFin[];
        fechaFin=new String[12];/*{"Abril 20","Mayo 20","Junio 20","Julio 20",""};*/
        fechaFin[0]="Abril 20";
        fechaFin[1]="Mayo 20";
        fechaFin[2]="Junio 20";
        fechaFin[3]="Julio 22";
        fechaFin[4]="Agosto 22";
        fechaFin[5]="Septiembre 22";
        fechaFin[6]="Octubre 22";
        fechaFin[7]="Noviembre 21";
        fechaFin[8]="Diciembre 20";
        fechaFin[9]="Enero 20";
        fechaFin[10]="Febreo 18";
        fechaFin[11]="Marzo 20";
        
        for(int i=0; i<12; i++){
            System.out.println(Zodiaco[i]+" "+fechaInicio[i]+" "+fechaFin[i]);
        }
    }
    
}
