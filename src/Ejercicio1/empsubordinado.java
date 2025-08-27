package TP1;

public class empsubordinado extends Empleado{
    //Atributo
    private double salariosubordinado;
    private int articulos;
    //Constructor
    public empsubordinado(Integer legajo, int articulos, double salariosubordinado, String nombre, String apellido, int edad, int numtelefono, String email) {
        super(legajo,nombre,apellido,edad,numtelefono,email);
        this.salariosubordinado = salariosubordinado;
        this.articulos = articulos;
    }
    //Metodos
    @Override
    public double calcularsalario(){
        return  salariosubordinado*articulos;
    }
    @Override
    public void getInfo() {
        System.out.println("------ Empleado subordinado ------");
        System.out.println("Legajo: " + getLegajo());
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numtelefono);
        System.out.println("Email: " + email);
        System.out.println("Pago por artículo: $" + salariosubordinado);
        System.out.println("Artículos producidos: " + articulos);
        System.out.println("Sueldo calculado: $" + calcularsalario());
        System.out.println("----------------------------------");
    }
}
