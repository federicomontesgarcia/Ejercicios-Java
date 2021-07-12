package param;

public class EjemconParam {
    public static void main(String args[]) {
    ClaseconParam CP1 = new ClaseconParam(10, 20.0, "Hola");
    ClaseconParam CP2 = new ClaseconParam(20, 40.0, "Adios");
    
    System.out.println("Primer Objeto\n");
    System.out.println("Dato1 =\t" + CP1.Dato1);
    System.out.println("Dato2 =\t" + CP1.Dato2);
    System.out.println("Cadena=\t" + CP1.Cadena);
    
    System.out.println("\n\nSegundo Objeto\n");
    System.out.println("Dato1 =\t" + CP2.Dato1);
    System.out.println("Dato2 =\t" + CP2.Dato2);
    System.out.println("Cadena=\t" + CP2.Cadena);
    }
}