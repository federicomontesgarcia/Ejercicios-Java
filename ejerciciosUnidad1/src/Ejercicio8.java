//jugo papel - piedra - tijera
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner datoJugador1 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador 1: ");
        String jugador1 = datoJugador1.nextLine();
        Scanner datoJugador2 = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador 2: ");
        String jugador2 = datoJugador2.nextLine();

        char caracterL = 'L';
        caracterL = Character.toUpperCase(caracterL);
        char caracterP = 'P';
        caracterP = Character.toUpperCase(caracterP);
        char caracterT = 'T';
        caracterT = Character.toUpperCase(caracterT);
        
        Jugar(jugador1, jugador2);

        datoJugador1.close();
        datoJugador2.close();
    }
    public static void Jugar(String jugador1, String jugador2) {
        char A = 76;
        char B = 80;
        char C = 84; 

        System.out.println("Piedra(P) le gana a Tijera(T), Tijera(T) le gana a Papel(L), Papel(L) le gana a Piedra(P)");
        System.out.println("Comencemos!");
        
        char manoJugador1;
        Scanner datoJugador1 = new Scanner(System.in);
        System.out.println(jugador1 + " comienza: ");
        manoJugador1 = datoJugador1.next().charAt(0);
        manoJugador1 = Character.toUpperCase(manoJugador1);
        
        char manoJugador2;
        Scanner datoJugador2 = new Scanner(System.in);
        System.out.println(jugador2 + " comienza: ");
        manoJugador2 = datoJugador2.next().charAt(0);
        manoJugador2 = Character.toUpperCase(manoJugador2);

        if((Character.compare(manoJugador1, A ) == 0) && (Character.compare(manoJugador2, B ) == 0)) {
            System.out.println(jugador1 + " gana la partida");
        }
        else if((Character.compare(manoJugador1, A ) == 0) && (Character.compare(manoJugador2, C ) == 0)) {
            System.out.println(jugador2 + " gana la partida");
        }
        else if((Character.compare(manoJugador1, B ) == 0) && (Character.compare(manoJugador2, A ) == 0)) {
            System.out.println(jugador2 + " gana la partida");
        }
        else if((Character.compare(manoJugador1, B ) == 0) && (Character.compare(manoJugador2, C ) == 0)) {
            System.out.println(jugador1 + " gana la partida");
        }
        else if((Character.compare(manoJugador1, C ) == 0) && (Character.compare(manoJugador2, A ) == 0)) {
            System.out.println(jugador1 + " gana la partida");
        }
        else if((Character.compare(manoJugador1, C ) == 0) && (Character.compare(manoJugador2, B ) == 0)) {
            System.out.println(jugador2 + " gana la partida");
        }
        else if((Character.compare(manoJugador1, A ) == 0) && (Character.compare(manoJugador2, A ) == 0) || 
         (Character.compare(manoJugador1, B ) == 0) && (Character.compare(manoJugador2, B ) == 0) ||
         (Character.compare(manoJugador1, C ) == 0) && (Character.compare(manoJugador2, C ) == 0)) {
            System.out.println("partida empatada, no hay ganador");
        }
        else{
            System.out.println("datos erroneos");
        }

        Scanner datoPreg = new Scanner(System.in);
        char res;
        System.out.println("Desea jugar de nuevo? (S/N): ");
        res = datoPreg.next().charAt(0);
        res = Character.toUpperCase(res);
        char caracter = 'S';

        if(Character.compare(res, caracter) == 0){
            Scanner datoNum = new Scanner(System.in);
            Jugar(jugador1, jugador2);
            datoNum.close();
        }
        else{System.out.println("fin del programa");}
        
        System.exit(0);
        datoJugador1.close();
        datoJugador2.close();
        datoPreg.close();


    }
}
