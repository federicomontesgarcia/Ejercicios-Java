import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {
        Scanner lecturaConsola = new Scanner(System.in);
        System.out.println("ingrese un número entero: ");
        int valor = lecturaConsola.nextInt();
        numPar(valor);
        lecturaConsola.close();
    }

    public static void numPar(int numero) {
        String num = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("el numero " + numero + " es " + num);

    }
}
