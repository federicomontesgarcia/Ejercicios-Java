// CLASE REQUERIDA
package Taquilla;

public class Silla {
    private int Num; // Número de la silla en el teatro
    private String Nom; // Nombre del Usuario
    private double Precio; // Precio boleta para esa silla
    private int Orden; // Determina el número de orden
    //de venta de la silla
    private static int CantSillas=0;
    private static double VrRecaudo=0;
        
        public Silla(int Num, String Nom, double Precio) {
            this.Num = Num;
            this.Nom = Nom;
            this.Precio = Precio;
            CantSillas = CantSillas + 1;
            this.Orden = CantSillas;
            VrRecaudo = VrRecaudo + this.Precio;
        }
        
        public static String MuestraVrRecaudo() {
            return "\n\n**********************" + "\nValor Total Recaudado" + "\n**********************\n\t" + VrRecaudo;
        }
        
        public String MuestraDatos( ) {
            return "\n\nSilla No.\t" + Num + "\nUsuario\t" + Nom + "\nPrecio\t" + Precio + "\nOrden\t" + Orden +
            "\n\nQuedan " + (300-CantSillas) + " sillas disponibles" + "\nVr Recaudado hasta ahora:\t" + VrRecaudo +
            "\n-----------------------------------------";
        }
}