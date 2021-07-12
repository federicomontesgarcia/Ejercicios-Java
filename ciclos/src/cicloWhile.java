import java.util.Scanner;

public class cicloWhile {
    public static void main(String[] args) {
        int num;
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Digite un número: ");
        num=Teclado.nextInt();
        System.out.println("\n\nNúmeros de 1 hasta " + num );
        int i = 1;
        while(i<=num)
        {
        System.out.print(i + "\t");
        i++;
        }
    Teclado.close();
}
}