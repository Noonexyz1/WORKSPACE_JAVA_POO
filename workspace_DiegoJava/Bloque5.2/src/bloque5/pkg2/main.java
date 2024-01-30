package bloque5.pkg2;
public class main {

    public static void main(String[] args) {
        Libro lib1=new  Libro();
        Libro lib2=new Libro();
        
        lib1.titulo = "El nombre del viento";
        lib2.titulo = "Juego de TRonos";
        
        lib1.ISBN = 10;
        
        System.out.println(lib1.titulo);
        System.out.println(lib2.titulo);
    }
    
}
