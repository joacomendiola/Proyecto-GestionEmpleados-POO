package TP1;

public class EmpleadoJefe extends Empleado {
    //Atributo
    private double salariofijo;
    //Constructor
    public EmpleadoJefe(int salariofijo, Integer legajo , String nombre, String apellido, int edad, String numtelefono, String email) {
        super(legajo,nombre,apellido,edad,numtelefono,email);
        this.salariofijo = salariofijo;
    }
    //Metodos
    @Override
    public double calcularSalario(){
       return  salariofijo;
    }
    @Override
    public String toString() {
        return """
           ╔════════════════════════════╗
           ║       EMPLEADO JEFE        ║
           ╚════════════════════════════╝
           Legajo: %d
           Nombre: %s %s
           Edad: %d
           Teléfono: %s
           Email: %s
           Sueldo fijo: $%.2f
           ══════════════════════════════
           """.formatted(
                getLegajo(), getNombre(), getApellido(),
                getEdad(), getTelefono(), getEmail(),
                salariofijo
        );
    }
}
