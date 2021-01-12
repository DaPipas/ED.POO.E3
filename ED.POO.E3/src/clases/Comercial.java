
package clases;

public class Comercial extends Empleado{
    private double comision;

    public Comercial(double comision) {
        this.comision = comision;
    }

    public Comercial(double comision, String nombre, int edad, float salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Comercial{" + "comision=" + comision + '}';
    }
    
    public void plus(){
        
        int x = super.getSalario();
        
        super.setSalario(super.getSalario + 200);
    }
    
}
