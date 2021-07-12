//pasar de grados fahrenheit a centigrados
import java.util.Scanner;

public class Ejemplo4 {
    
    public static void main(String[] args) {
        Scanner lecturaConsola = new Scanner(System.in);
        System.out.println("Ingrese el valor de la temperatura en grados centígrados: ");
        float C = lecturaConsola.nextFloat();
        float gradosF = 32 + (9 * (C/5));
        System.out.println("el valor en grados Fahrenheith es: " + gradosF + " grados");
        lecturaConsola.close();
    }
}
