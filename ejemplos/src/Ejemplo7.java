//ciclo foreach
public class Ejemplo7 {
    public static void main(String args[ ] ) {
        String [ ] Amigos = {"Carlos","Mariana","Alberto","Juan","Julio","Jorge"};
        
        for(String Friend:Amigos)
        System.out.println("Nombre "+Friend+"\t\t"+ Friend.length( ) + " letras");
    }
}