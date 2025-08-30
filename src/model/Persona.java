package TP1;

public class Persona {
    //Atributo
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final String telefono;
    private final String email;
    //Constructor
    public Persona(String nombre, String apellido, int edad, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
    }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }
}
