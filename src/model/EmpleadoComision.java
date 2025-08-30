package TP1;

public class EmpleadoComision extends Empleado {
    private double sueldobase;        // fijo
    private double ventasDelMes;      // monto vendido
    private double porcentaje;        // ej: 0.10 para 10%

    // Firma corregida (antes estaba truncada)
    public EmpleadoComision(Integer legajo, double sueldobase, double ventasDelMes, double porcentaje,
                            String nombre, String apellido, int edad, String numtelefono, String email) {
        super(legajo, nombre, apellido, edad, numtelefono, email);
        this.sueldobase = sueldobase;
        this.ventasDelMes = ventasDelMes;
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularSalario() {
        return sueldobase + ventasDelMes * porcentaje;
    }

    @Override
    public String toString() {
        return """
           ╔════════════════════════════╗
           ║   EMPLEADO A COMISIÓN      ║
           ╚════════════════════════════╝
           Legajo: %d
           Nombre: %s %s
           Edad: %d
           Teléfono: %s
           Email: %s
           Sueldo base: $%.2f
           Ventas del mes: $%.2f
           Porcentaje comisión: %.0f%%
           Sueldo calculado: $%.2f
           ══════════════════════════════
           """.formatted(
                getLegajo(), getNombre(), getApellido(),
                getEdad(), getTelefono(), getEmail(),
                sueldobase, ventasDelMes, porcentaje * 100, calcularSalario()
        );
    }
}
