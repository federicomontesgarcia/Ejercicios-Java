//calcular el peso ideal
import java.util.Scanner;
import java.lang.Character;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner datoSexo = new Scanner(System.in);
        char sexo;
        System.out.println("Ingrese el sexo de la persona (H/M): ");
        sexo = datoSexo.next().charAt(0);
        sexo = Character.toUpperCase(sexo);
        System.out.println(sexo);
        Scanner datoEstatura = new Scanner(System.in);
        System.out.println("Ingrese la estatura de la persona en centimetros: ");
        int estatura = datoEstatura.nextInt();
        datoSexo.close();
        datoEstatura.close();
        char caracter = 'M';   
        char caracter1 = 'H';                                        
        
        if(Character.compare(sexo, caracter) == 0){
            int pesoIdealM = estatura - 120;
            System.out.println("El peso ideal es: " + pesoIdealM);
        }
        else if(Character.compare(sexo, caracter1) == 0){
            int pesoIdealF = estatura - 110;
            System.out.println("El peso ideal es: " + pesoIdealF);
        }
        else{
            System.out.println("Error al digitar el sexo");
        }

    }
}
