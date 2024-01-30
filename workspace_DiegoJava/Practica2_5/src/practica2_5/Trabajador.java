package practica2_5;
public class Trabajador {
    public static void main(String[] args) {
        double td,sl,sf;
        System.out.println("Nombre\tDiasTrabajados\tPagoDiario\tSalarioLiquido\tTotalDescuento\tSalarioFianl");
        sl=calcularSalarioLiquido(15,100);
        td=cacularTotalDescuento(sl);
        sf=calcularSueldoFinal(sl,td);
        System.out.println("Juan\t      "+15+"\t   "+100+"  \t"+sl+"    \t"+td+"        \t"+sf);
        sl=calcularSalarioLiquido(18,150);
        td=cacularTotalDescuento(sl);
        sf=calcularSueldoFinal(sl,td);
        System.out.println("Luis\t      "+18+"\t   "+150+"  \t"+sl+"    \t"+td+"        \t"+sf);
        sl=calcularSalarioLiquido(10,100);
        td=cacularTotalDescuento(sl);
        sf=calcularSueldoFinal(sl,td);
        System.out.println("Maria\t      "+10+"\t   "+100+"     \t"+sl+"    \t"+td+"        \t"+sf);
    }
    static double calcularSalarioLiquido(double dt,double pd){
        double sl;
        sl=dt*pd;
        return sl;
    }
    static double calcularSueldoFinal(double sl,double td){
        double sf;
        sf=sl-td;
        return sf;
    }
    static double cacularTotalDescuento(double sl){
        double td;
        td = (1.5*sl)/(100);
        return td;
    }
}
