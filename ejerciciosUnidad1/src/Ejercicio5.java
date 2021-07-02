import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
    Random r = new Random();
    int numeroAleatorio = r.nextInt(100)+1; 
    System.out.println("el numero a adivinar es: "+ numeroAleatorio);  
    
    Scanner datoNum = new Scanner(System.in);
    System.out.println("Ingerese un numero entero: ");
    int num = datoNum.nextInt();
    
    while(num != numeroAleatorio){
    
        if(num > numeroAleatorio){
            System.out.println("El número que busca es menor, vuelva a intentarlo: ");
            num = datoNum.nextInt();
        }
        else if (num < numeroAleatorio){
            System.out.println("El número que busca es mayor, vuelva a intentarlo: ");
            num = datoNum.nextInt(); 
        } 
        else {}
    }
    System.out.println("Felicitaciones! adivinó el número");  
    datoNum.close();  
    }
    
}
        



