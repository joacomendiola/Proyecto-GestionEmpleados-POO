package TP1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Pyme {
    //Atributos
    private Persona duenio;
    private int horainicio;
    private int horafinalizacion;
    private String domicilio;
    private TreeMap<Integer,Empleado> empleados;
    private double totalhaberes;
    //Constructor
    public Pyme(Persona duenio, int horainicio, int horafinalizacion, String domicilio) {
        this.duenio = duenio;
        this.horainicio = horainicio;
        this.horafinalizacion = horafinalizacion;
        this.domicilio = domicilio;
        empleados=new TreeMap<>();
        totalhaberes=0;
    }
    //Metodo
    public double getTotalhaberes(){
        return totalhaberes;
    }
    public void agregarEmpleado(Empleado nuevo){
        empleados.put(nuevo.getLegajo(),nuevo);
        totalhaberes+=nuevo.calcularSalario();
    }
    public void eliminarEmpleado(Empleado eliminar){
        empleados.remove(eliminar.getLegajo());
        totalhaberes-=eliminar.calcularSalario();
    }
    public ArrayList<Empleado> listarPorLegajo(){
        return new ArrayList<>(empleados.values()); // TreeMap ordena por legajo (clave)
    }
    public ArrayList<Empleado> listarPorApellidoNombre(){
        ArrayList<Empleado> aux=new ArrayList<>(empleados.values());
        Collections.sort(aux); // usa compareTo (apellido, nombre)
        return aux;
    }
}
