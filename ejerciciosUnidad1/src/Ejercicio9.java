//calcular sueldo de empleados
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner datoNombre = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = datoNombre.nextLine();
        Scanner datoEdad = new Scanner(System.in);
        System.out.print("Ingrese la edad de la persona: ");
        int edad = datoEdad.nextInt();
        Scanner datoSalario = new Scanner(System.in);
        System.out.print("Ingrese el salario de la persona: ");
        int salario = datoEdad.nextInt();

        double porcentaje1 = 0.05;
        double porcentaje2 = 0.1;
        double porcentaje3 = 0.15;

        datoNombre.close();
        datoEdad.close();
        datoSalario.close();

        if(edad < 18){
            System.out.print(nombre + " no tiene edad para trabajar");
        }
        else if(edad >= 18 && edad < 50){
            double salarioFinal = salario + (salario * porcentaje1); 
            System.out.print("El salario de " + nombre + " es " + salarioFinal );
        }
        else if(edad >= 50 && edad < 60){
            double salarioFinal = salario + (salario * porcentaje2); 
            System.out.print("El salario de " + nombre + " es " + salarioFinal );
        }
        else if(edad >= 60){
            double salarioFinal = salario + (salario * porcentaje3); 
            System.out.print("El salario de " + nombre + " es " + salarioFinal );
        }
    }
    

}