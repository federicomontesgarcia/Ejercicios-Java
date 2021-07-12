package figuras;

public class Triangulos {
    public static void main(String args[]) {
        Triangulo Trian1 = new Triangulo(20,15);
        Triangulo Trian2 = new Triangulo(10,40);
        Triangulo Trian3 = new Triangulo(40,20);
        
        System.out.println("\nPrimer Triangulo\n");
        System.out.println("Base:\t" + Trian1.base);
        System.out.println("Altura\t" + Trian1.altura);
        System.out.println("Area:\t" + Trian1.area);
        
        System.out.println("\nSegundo Triangulo\n");
        System.out.println("Base:\t" + Trian2.base);
        System.out.println("Altura\t" + Trian2.altura);
        System.out.println("Area:\t" + Trian2.area);
        
        System.out.println("\nTercer Triangulo\n");
        System.out.println("Base:\t" + Trian3.base);
        System.out.println("Altura\t" + Trian3.altura);
        System.out.println("Area:\t" + Trian3.area);
    }
}