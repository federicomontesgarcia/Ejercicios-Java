import javax.swing.JOptionPane;

public class cicloFor {
    public static void main(String args[ ] ) {
        String bas, ex; // Variables Cadena
        int base, expon; // Variables Enteras

        bas = JOptionPane.showInputDialog("Digite la base");
        ex = JOptionPane.showInputDialog("Digite el exponente");

        base = Integer.parseInt(bas);
        expon = Integer.parseInt(ex);

        int i, result=1;

        for ( i=1 ; i <= expon ; ++i )
            result *= base;

            System.out.println(base+" elevado a la " +expon+" = "+ result);
        }
    }
    