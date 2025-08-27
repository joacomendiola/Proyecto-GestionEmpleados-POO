package TP1;

public class empjefe extends Empleado {
    //Atributo
    private double salariofijo;
    //Constructor
    public empjefe(int salariofijo,Integer legajo ,String nombre, String apellido, int edad, int numtelefono, String email) {
        super(legajo,nombre,apellido,edad,numtelefono,email);
        this.salariofijo = salariofijo;
    }
    //Metodos
    @Override
    public double calcularsalario(){
       return  salariofijo;
    }
    @Override
    public void getInfo() {
        System.out.println("------ Empleado Jefe ------");
        System.out.println("Legajo: " + getLegajo());
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numtelefono);
        System.out.println("Email: " + email);
        System.out.println("Sueldo fijo: $" + salariofijo);
        System.out.println("---------------------------");
    }
}
