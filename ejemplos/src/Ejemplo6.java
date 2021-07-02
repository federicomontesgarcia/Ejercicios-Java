import java.util.Scanner;

//clase de prueba
public class Ejemplo6 {
    public static void main(String[] parametro1) {
        Scanner objetoEscaner = new Scanner(System.in);
        System.out.println("Programa para calcular tu numero de suerte");
        System.out.println("Ingrese su año de nacimiento: ");
        int anoNacimiento = objetoEscaner.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int mesNacimiento = objetoEscaner.nextInt();
        System.out.println("Ingrese su dia de nacimiento: ");
        int diaNacimiento = objetoEscaner.nextInt();
        Integer totalSumaFecha = diaNacimiento + anoNacimiento + mesNacimiento;
        int totalSumaDigitos = SumarDigitos(totalSumaFecha);
        System.out.println("Su numero de la suerte es: " + String.valueOf(totalSumaDigitos));
        objetoEscaner.close();
    }
    public static int SumarDigitos (Integer totalSumaFecha){
        String totalSumaFechaString = totalSumaFecha.toString();
        int sumatoriaDigitos = 0;
        for (int i = 0; i < totalSumaFechaString.length() ; i++) {
            int digitoActual = (int) totalSumaFechaString.charAt(i);
            sumatoriaDigitos = sumatoriaDigitos + digitoActual;
        }
        return sumatoriaDigitos;

        }

    }

