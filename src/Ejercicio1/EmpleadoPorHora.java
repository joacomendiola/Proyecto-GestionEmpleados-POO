package TP1;

public class EmpleadoPorHora extends Empleado {
    //Atributos
    private double precioHora;
    private double precioHoraExtra;
    private double horas;
    private double horasExtra;
    //Constructor
    public EmpleadoPorHora(Integer legajo, double precioHora, double precioHoraExtra, double horas, double horasExtra, String nombre, String apellido, int edad, String numtelefono, String email) {
        super(legajo, nombre, apellido, edad, numtelefono, email);
        this.precioHora = precioHora;
        this.precioHoraExtra = precioHoraExtra;
        this.horas = horas;
        this.horasExtra = horasExtra;
    }
    //Metodo
    @Override
    public double calcularSalario() {
        return (horas * precioHora) + (horasExtra * precioHoraExtra);
    }
    @Override
    public String toString() {
        return """
           ╔════════════════════════════╗
           ║    EMPLEADO POR HORA       ║
           ╚════════════════════════════╝
           Legajo: %d
           Nombre: %s %s
           Edad: %d
           Teléfono: %s
           Email: %s
           Tarifa hora: $%.2f
           Tarifa hora extra: $%.2f
           Horas trabajadas: %.1f
           Horas extra: %.1f
           Sueldo calculado: $%.2f
           ══════════════════════════════
           """.formatted(
                getLegajo(), getNombre(), getApellido(),
                getEdad(), getTelefono(), getEmail(),
                precioHora, precioHoraExtra, horas, horasExtra, calcularSalario()
        );
    }
}
