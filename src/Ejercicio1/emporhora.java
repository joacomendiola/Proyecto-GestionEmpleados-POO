package TP1;

public class emporhora extends Empleado {
    //Atributos
    private double precio;
    private double precioextra;
    private double hora;
    private double horaextras;
    //Constructor
    public emporhora(Integer legajo, double precio, double precioextra, double hora, double horaextras, String nombre, String apellido, int edad, int numtelefono, String email) {
        super(legajo,nombre,apellido,edad,numtelefono,email);
        this.precio = precio;
        this.precioextra = precioextra;
        this.hora = hora;
        this.horaextras = horaextras;
    }
    //Metodo
    @Override
    public double calcularsalario(){
        return precio*hora+horaextras*precioextra;
    }
    @Override
    public void getInfo() {
        System.out.println("------ Empleado por hora ------");
        System.out.println("Legajo: " + getLegajo());
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numtelefono);
        System.out.println("Email: " + email);
        System.out.println("Tarifa hora: $" + precio);
        System.out.println("Tarifa hora extra: $" + precioextra);
        System.out.println("Horas trabajadas: " + hora);
        System.out.println("Horas extra: " + horaextras);
        System.out.println("Sueldo calculado: $" + calcularsalario());
        System.out.println("-------------------------------");
    }
}
