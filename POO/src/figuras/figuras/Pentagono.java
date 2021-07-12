package figuras;

public class Pentagono {
int lado;
int apotema;
double area;
    public Pentagono(int l, int a) {
    lado = l;
    apotema = a;
    area = (double) 5 * ((lado*apotema)/2);
    }
}