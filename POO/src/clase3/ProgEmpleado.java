// PROGRAMA QUE USA LA CLASE EMPLEADO
package clase3;

public class ProgEmpleado {
    public static void main(String[ ] args) {
    Empleado Emp1 = new Empleado("111", "Omar Iván", 1200000);
    Empleado Emp2 = new Empleado("222", "Juana María", 1300000);
    
    System.out.println(Emp1.MuestraDatos( ));
    System.out.println(Emp2.MuestraDatos( ));
    
    Emp1.CambiaNombre("José Luis");
    System.out.println(Emp1.MuestraDatos( ));
    
    Emp1.CambiaSueldo(2500000);
    System.out.println(Emp1.MuestraDatos( ));
    }
}