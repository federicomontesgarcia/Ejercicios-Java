import java.util.Scanner;
    
public class Lectura1 {
    public static void main(String args[ ] ) {
    Scanner Teclado = new Scanner(System.in);
    String Nombre; // Declara una variable tipo String (Cadena)
    int Edad; // Declara una variable tipo Entero
    double Estatura; // Declara una variable tipo double
    System.out.println("Por favor, escriba su nombre: ");
    Nombre = Teclado.nextLine( );
    System.out.println("Por favor, escriba su edad: ");
    Edad = Teclado.nextInt( );
    System.out.println("Por favor, escriba su estatura: ");
    Estatura = Teclado.nextDouble( );
    System.out.println("Nombre: " + Nombre);
    System.out.println("Edad: " + Edad);
    System.out.println("Estatura: " + Estatura );
    Teclado.close();
   
    }
}