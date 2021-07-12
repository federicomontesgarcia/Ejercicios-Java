package figuras;

public class Rectangulo {
    int base;
    int altura;
    double area;
    
    public Rectangulo(int b, int a) {
        base = b;
        altura = a;
        area = (double) base * altura;
    }
}

