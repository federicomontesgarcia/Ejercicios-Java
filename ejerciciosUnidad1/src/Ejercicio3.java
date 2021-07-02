import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner datoHoras = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas: ");
        int horasTrabajadas = datoHoras.nextInt();
        Sueldo(horasTrabajadas);
        datoHoras.close();
    }
    public static void Sueldo(int horas) {
        int valorHora = 30000;
        int sueldo = valorHora * horas;
        System.out.println("el sueldo a pagar es: " + sueldo + " pesos");
    }
    
}


