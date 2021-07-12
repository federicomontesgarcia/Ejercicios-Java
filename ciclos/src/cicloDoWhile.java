import java.util.Scanner;
public class cicloDoWhile {
    public static void main(String args[ ] ) {
        Scanner Teclado = new Scanner(System.in);
        int num;
        System.out.print("Número : ");
        num = Teclado.nextInt();
        int facto=1, i=1;
        do
        {
        facto = facto * i;
        i++;
        }while( i <= num);
        System.out.println("El factorial de "+num+" = "+facto);
        Teclado.close();
}
}