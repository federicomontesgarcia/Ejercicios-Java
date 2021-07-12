//Listas
import java.util.*;

public class Ejemplo8{
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<String>();
        listaCadenas.add(  "TextPrueba"  );
        listaCadenas.add(  "Elemento 2"  );
        listaCadenas.add(  "Texto Ejemplo 3"  );
        System.out.println( "El tamaño de la lista es: " + listaCadenas.size() );
        System.out.println( "El elemento de indice 1 es: " + listaCadenas.get(1)  );
        System.out.println( "El texto TextPrueba esta en la lista?: " + listaCadenas.contains("TextPrueba")  );
        System.out.println( "El texto YY esta en la lista?: " + listaCadenas.contains("YY")  );
        for (int i = 0; i < listaCadenas.size() ; i++){
            System.out.println( "El elemento de indice " + i + " es: " + listaCadenas.get(i)  );
        }
        for( String cadenaEnElContenedor : listaCadenas){
            System.out.println( "El elemento es: " + cadenaEnElContenedor  );
        }
    }
}