// PROGRAMA QUE USA LA CLASE REQUERIDA
package Taquilla;

public class Venta {
    public static void main(String[ ] args) {
        Silla S1 = new Silla(18, "Pedro Perez", 15000);
        System.out.println(S1.MuestraDatos( ));
        Silla S2 = new Silla(23, "Carlos Gomez", 15000);
        System.out.println(S2.MuestraDatos( ));
        Silla S3 = new Silla(105, "Ana Diaz", 20000);
        System.out.println(S3.MuestraDatos( ));
        Silla S4 = new Silla(106, "Pablo Trejos", 15000);
        System.out.println(S4.MuestraDatos( ));
        Silla S5 = new Silla(30, "María Ramirez", 20000);
        System.out.println(S5.MuestraDatos( ));
        System.out.println(Silla.MuestraVrRecaudo( ));
        }

       
}