
public class ClaseMath {
    public static void main(String args[]) {
    int Valor = 130;
    // Conversión a grados
    System.out.println("Grados equivalentes--> " + Math.toDegrees(Valor));
    // Conversion a radianes
    System.out.println("Radianes equivalentes-->" + Math.toRadians(Valor));
    // Calculo de e elevado a la x
    int x = 3;
    System.out.println("e elevado a la " + x + " = " + Math.exp(x));
    // Calculo del logaritmo natural
    System.out.println("Logaritmo natural de " + x + " = " + Math.log(x));
    // Calculo del logaritmo base 10
    System.out.println("Logaritmo base 10 de " + x + " = " +Math.log10(x));
    // Muestra un número aleatorio comprendido entre 0.0 y 1.0
    System.out.println("Número Aleatorio = " + Math.random());
    // Muestra el número PI
    System.out.println("Número PI = " + Math.PI);
    // Muestra el número E
    System.out.println("Número E = " + Math.E);
    // Elevar una base a un exponente
    int base, expon;
    base = 4;
    expon = 3;
    System.out.println(base+" elevado a la "+expon+" = "+Math.pow(base,expon));
    // Calcular la raíz cuadrada
    int Num = 30;
    System.out.println("Raiz Cuadrada de " + Num + " = " + Math.sqrt(Num));
    // Calcular la raíz cúbica
    System.out.println("Raiz Cúbica de " + Num + " = " + Math.cbrt(Num));
    // Redondeo de un número
    float Dato = 45.765F;
    System.out.println(Dato + " redondeado es = " + Math.round(Dato));
    // Calculo del Seno, Coseno y Tangente de un ángulo
    double dato = 35;
    System.out.println("Seno de " + dato + " = " + Math.sin(dato));
    System.out.println("Coseno de " + dato + " = " + Math.cos(dato));
    System.out.println("Tangente de " + dato + " = " + Math.tan(dato));
    // Cálculo del valor absoluto
    int ValorN = -45;
    System.out.println("Valor absoluto de " + ValorN + " = " + Math.abs(ValorN));

    }

}