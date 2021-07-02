import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lecturaDato1 = new Scanner(System.in);
        System.out.println("ingrese un número entero: ");
        int num1 = lecturaDato1.nextInt();
        Scanner lecturaDato2 = new Scanner(System.in);
        System.out.println("Ingrese otro número entero: ");
        int num2 = lecturaDato2.nextInt();
        Sumar(num1, num2);
        Restar(num1, num2);
        Multiplicar(num1, num2);
        Dividir(num1, num2);

        lecturaDato1.close();
        lecturaDato2.close();

    }
    public static void Sumar(int num1, int num2) {
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
    }
    public static void Restar(int num1, int num2) {
        int resta = num1 - num2;
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
    }
    public static void Multiplicar(int num1, int num2) {
        int multiplicacion = num1 * num2;
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
    }
    public static void Dividir(int num1, int num2) {
        if(num2 != 0) {
            int division = num1 / num2;
            System.out.println("La división de " + num1 + " y " + num2 + " es: " + division);
        }
        else {
            System.out.println("cero es un número invalido para realizar la división");
        }
    }

}
