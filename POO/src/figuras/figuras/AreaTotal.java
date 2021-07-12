package figuras;
public class AreaTotal {
    public static void main(String args[ ] ) {
    Triangulo Tri1 = new Triangulo(5,3);
    Triangulo Tri2 = new Triangulo(5,4);
    Rectangulo Rec1 = new Rectangulo(5,4);
    Rectangulo Rec2 = new Rectangulo(8,2);
    Pentagono Pen1 = new Pentagono(3,2);
    double AreaTotal = Tri1.area + Tri2.area + Rec1.area +
    Rec2.area + Pen1.area;
    System.out.println("Area Total = " + AreaTotal);
    }
}