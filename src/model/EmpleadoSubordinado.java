package TP1;

public class EmpleadoSubordinado extends Empleado{
    //Atributo
    private double pagoPorArticulo;
    private int articulos;
    //Constructor
    public EmpleadoSubordinado(Integer legajo, int articulos, double pagoPorArticulo, String nombre, String apellido, int edad, String numtelefono, String email) {
        super(legajo, nombre, apellido, edad, numtelefono, email);
        this.pagoPorArticulo = pagoPorArticulo;
        this.articulos = articulos;
    }
    //Metodos
    @Override
    public double calcularSalario() {
        return pagoPorArticulo * articulos;
    }
    @Override
    public String toString() {
        return """
           ╔════════════════════════════╗
           ║  EMPLEADO SUBORDINADO      ║
           ╚════════════════════════════╝
           Legajo: %d
           Nombre: %s %s
           Edad: %d
           Teléfono: %s
           Email: %s
           Pago por artículo: $%.2f
           Artículos producidos: %d
           Sueldo calculado: $%.2f
           ══════════════════════════════
           """.formatted(
                getLegajo(), getNombre(), getApellido(),
                getEdad(), getTelefono(), getEmail(),
                pagoPorArticulo, articulos, calcularSalario()
        );
    }
}
