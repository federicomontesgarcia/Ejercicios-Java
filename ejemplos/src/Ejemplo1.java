//funcion saludar
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner lecturaDeConsola = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        String nombre = lecturaDeConsola.nextLine();
        Saludar(nombre);
        lecturaDeConsola.close();
    }

    public static void Saludar(String persona) {
        System.out.println("Hola " + persona);
    }
}
