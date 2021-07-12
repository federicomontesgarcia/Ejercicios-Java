

public class Ejemplo {
    public static void main(String args[ ] ) {
        
        System.out.println("Tringulo");
        ClaseTriangulo Trian1 = new ClaseTriangulo( );
        System.out.println("Base =\t" + Trian1.base);
        System.out.println("Altura = " + Trian1.altura);
        System.out.println("Area =\t" + Trian1.area);
        
        System.out.println("");
        
        System.out.println("Rectangulo");
        ClaseRectangulo Rect1 = new ClaseRectangulo();
        System.out.println("lado1 =\t" + Rect1.lado1);
        System.out.println("Lado2 =\t" + Rect1.lado2);
        System.out.println("Area =\t" + Rect1.area);

    }
}