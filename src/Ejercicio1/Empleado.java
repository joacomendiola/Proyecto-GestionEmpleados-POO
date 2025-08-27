package TP1;

public abstract class Empleado extends Persona implements Comparable<Empleado> {
    //Atributo
    private Integer legajo;
    //Constructor
    public Empleado(Integer legajo, String nombre, String apellido, int edad, int numtelefono, String email) {
        super(nombre,apellido,edad,numtelefono,email);
        this.legajo=legajo;
    }
    //Getter
    public Integer getLegajo() {
        return legajo;
    }
    //Metodo
    public abstract double calcularsalario();
    public abstract void getInfo();
    @Override
    public int compareTo(Empleado otro){
        int resultado=apellido.compareTo(otro.apellido);
        if(resultado==0){
            resultado=nombre.compareTo(otro.nombre);
            return resultado;
        }
        return resultado;
    }
}
