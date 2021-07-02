//verificar si un numero es primo
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner datoNum = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num = datoNum.nextInt();
        
        Primo(num);
        datoNum.close();
    }
    public static void Primo(int num){
        int contador = 0;
        boolean flag = false;
        for(int i = 1; i <= num; i++){
            if (num % i == 0){
                contador = contador + 1;
                
            }
            if (contador >= 3){
                flag = true;
                break;
            }
        }
        if (contador == 2 || flag == false){
            System.out.println("El número " + num + " SI es primo");
        }
        else{
            System.out.println("El un número " + num + " NO es primo");
        }
        Scanner datoPreg = new Scanner(System.in);
        char res;
        System.out.println("Desea verificar otro numero? (S/N): ");
        res = datoPreg.next().charAt(0);
        res = Character.toUpperCase(res);
        char caracter = 'S';

        if(Character.compare(res, caracter) == 0){
            Scanner datoNum = new Scanner(System.in);
            System.out.println("Ingrese un número entero: ");
            num = datoNum.nextInt();
            Primo(num);
            datoNum.close();
        }
        else{System.out.println("fin del programa");}
        
        System.exit(0);
        datoPreg.close();
    }

}



        
