package figuras;
    
public class Triangulo {
        int base;
        int altura;
        double area;
        
        public Triangulo(int b, int a) {
            base = b;
            altura = a;
            area = (double)(base * altura)/2;
    }
}