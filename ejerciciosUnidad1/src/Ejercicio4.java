import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner datoNumero = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = datoNumero.nextInt();
        TablaMult(numero);
        datoNumero.close();
    }
    public static void TablaMult(int numero) {
        int x;
        System.out.println("la tabla del " + numero + " es: ");
        for(x=0; x <= 10; x++) {
            int tabla = numero * x;
            System.out.println(numero + " x "  + x + " = " + tabla);
        }
    }
}
