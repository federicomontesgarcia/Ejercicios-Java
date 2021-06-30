import javax.swing.JOptionPane;

public class Ventana3 {
    public static void main(String args[]) {
    String N1 = JOptionPane.showInputDialog("Escriba valor con decimales");
    double N2 = Double.parseDouble(N1);
    System.out.print("La raíz cúbica de " + N1 + " es ");
    System.out.printf("%1.3f", Math.cbrt(N2));
   
    }
}