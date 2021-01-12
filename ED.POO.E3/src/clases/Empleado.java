
package clases;

public abstract class Empleado {
    private String nombre;
    private int edad;
    private float salario;
    private int PLUS = 300;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getPLUS() {
        return PLUS;
    }

    public void setPLUS(int PLUS) {
        this.PLUS = PLUS;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", PLUS=" + PLUS + '}';
    }
    
    
}
