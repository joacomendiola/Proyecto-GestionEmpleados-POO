package TP1;

public abstract class Empleado extends Persona implements Comparable<Empleado> {
    // Atributo
    private final int legajo;

    // Constructor
    public Empleado(Integer legajo, String nombre, String apellido, int edad, String numtelefono, String email) {
        super(nombre, apellido, edad, numtelefono, email);
        this.legajo = legajo;
    }

    // Getter
    public int getLegajo() { return legajo; }

    // Métodos abstractos
    public abstract double calcularSalario();


    @Override
    public int compareTo(Empleado otro) {
        int resultado = this.getApellido().compareToIgnoreCase(otro.getApellido());
        if (resultado == 0) {
            resultado = this.getNombre().compareToIgnoreCase(otro.getNombre());
        }
        return resultado;
    }
}
