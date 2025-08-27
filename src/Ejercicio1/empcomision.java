package TP1;

public class empcomision extends Empleado{
    //Atributo
    private double salariocomision;
    private double comision;
    //Constructor
    public empcomision(Integer legajo, double salariocomision, double comision, String nombre, String apellido, int edad, int numtelefono, String email) {
        super(legajo, nombre, apellido, edad, numtelefono, email);
        this.salariocomision=salariocomision;
        this.comision=comision;
    }
    //Metodos
    @Override
    public double calcularsalario(){
        return salariocomision*comision;
    }
    @Override
    public void getInfo() {
        System.out.println("------ Empleado a Comisión ------");
        System.out.println("Legajo: " + getLegajo());
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numtelefono);
        System.out.println("Email: " + email);
        System.out.println("Sueldo base: $" + salariocomision);
        System.out.println("Porcentaje comisión: " + comision + "%");
        System.out.println("Sueldo calculado: $" + calcularsalario());
        System.out.println("---------------------------------");
    }
}
