
package clases;

public class Repartidor extends Empleado{
    private String zona;

    public Repartidor() {
        
    }

    public Repartidor(String zona, String nombre, int edad, float salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Repartidor{" + "zona=" + zona + '}';
    }
    
}
