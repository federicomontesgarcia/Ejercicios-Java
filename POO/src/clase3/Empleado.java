// CLASE EMPLEADO
package clase3;

public class Empleado {
private final String NumId;
private String Nombre;
private double Sueldo;
    
    public Empleado(String Id, String Nom, double Sue) {
    NumId = Id;
    Nombre = Nom;
    Sueldo = Sue;
    }

    String MuestraDatos( ) {
    return "\nId :\t" + NumId + "\nNombre :\t" + Nombre + "\nSueldo :\t" + Sueldo;
    }
    
    public void CambiaNombre(String Nom) {
    Nombre = Nom;
    }
    
    public void CambiaSueldo(double Sue) {
    Sueldo = Sue;
    }
}