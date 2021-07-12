//Serie Fibonacci
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner datoNum = new Scanner(System.in);
        System.out.println("Ingrese el numero del fin de la serie: ");
        int NumeroFinal = datoNum.nextInt();

        int num1 = 0, num2 = 1, suma = 1;
    
        // Muestro el valor inicial
        System.out.println(num1);
            
        while (suma < NumeroFinal) {
                
            // muestro la suma
            System.out.println(suma);
                
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
                
        datoNum.close();       
        }
    }
         
}
    
