import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner lecturaNum = new Scanner(System.in);
        System.out.println("ingrese un numero entero: ");
        int numero = lecturaNum.nextInt();
        int numDoble = 2 * numero;
        System.out.println("El doble del numero es: " + numDoble);
        int numTriple = 3 * numero;
        System.out.println("El triple del numero es: " + numTriple);
        lecturaNum.close();
    }   
}
