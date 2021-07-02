import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner datoNombre = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = datoNombre.nextLine();
        Scanner datoNota1 = new Scanner(System.in);
        System.out.println("ingrese la nota 1: ");
        float nota1 = datoNota1.nextFloat();
        Scanner datoNota2 = new Scanner(System.in);
        System.out.println("ingrese la nota 2: ");
        float nota2 = datoNota2.nextFloat();
        Scanner datoNota3 = new Scanner(System.in);
        System.out.println("ingrese la nota 3: ");
        float nota3 = datoNota1.nextFloat();
        Promedio(nota1, nota2, nota3, nombre);
        
        datoNombre.close();
        datoNota1.close();
        datoNota2.close();
        datoNota3.close();


    }
    public static void Promedio(float nota1, float nota2, float nota3, String nombre) {
        float prom = (nota1 + nota2 + nota3)/3;
        if(prom >= 3){
            System.out.println("El promedio de notas de " + nombre + " es: " + prom + " y su estado es: Aprobado");
        }else{
            System.out.println("El promedio de notas de " + nombre + " es: " + prom + " y su estado es: Reprobado");
        }
        
    }
    
}
