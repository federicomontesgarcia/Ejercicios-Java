import java.util.*;
import javax.swing.*;

public class CondicionalSwitch {
public static void main(String[] args) {
    double Num;
    int Opcion;
    Scanner Teclado = new Scanner(System.in);
    String N = JOptionPane.showInputDialog("Escriba un número");
    Num = Double.parseDouble(N);
    System.out.println("Esoja una opción");
    System.out.println("================");
    System.out.println("1. Elevarlo al cuadrado");
    System.out.println("2. Obtener su raiz cuadrada");
    System.out.println("3. Obtener su raíz cúbica");
    System.out.println("4. Obtener su mitad");
    System.out.print("\n\nOpción: ");
    Opcion = Teclado.nextInt();
    switch(Opcion) {
    case 1:
    System.out.println(Num+" al cuadrado es = a"+(Num*Num));
    break;
    case 2:
    System.out.print("Raiz Cuadrada de ");
    System.out.println(Num + " = " + Math.sqrt(Num));
    break;
    case 3:
    System.out.print("Raiz Cúbica de " + Num + " = ");
    System.out.println(Math.cbrt(Num));
    break;
    case 4:
    System.out.println("La mitad de " + Num + " = " + (Num/2));
    break;
    default:
    System.out.println("Escoja solo una de las opciones posibles");
    }
Teclado.close();
}
}