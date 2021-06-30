import java.util.Scanner;

class texto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor introduzca un texto: ");
        String x = entrada.nextLine();
        System.out.print("El texto introducido es: ");
        System.out.println(x);
        entrada.close();
    
    }
}


