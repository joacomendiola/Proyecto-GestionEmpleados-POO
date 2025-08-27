package TP1;

public class Persona {
    //Atributo
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int numtelefono;
    protected String email;
    //Constructor
    public Persona(String nombre, String apellido, int edad, int numtelefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numtelefono = numtelefono;
        this.email = email;
    }
}
