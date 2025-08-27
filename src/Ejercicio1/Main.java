package TP1;

public class Main {
    public static void main(String[]args){
        Persona duenio = new Persona("Ana", "García", 45, 290112345, "ana@pyme.com");
        Pyme pyme = new Pyme(duenio,8,17,"Yrigoyen 123");

        Empleado jefe1 = new empjefe(200000, 1, "José", "Pérez", 50, 290111111, "jose@pyme.com");
        Empleado vendedor1 = new empcomision(2, 80000, 0.10, "Laura", "Acosta", 30, 290122222, "laura@pyme.com");
        Empleado obrero1 = new empsubordinado(3, 60, 1200, "Mario", "Ríos", 28, 290133333, "mario@pyme.com");
        Empleado jornalero1 = new emporhora(4, 2500, 3750, 40, 5, "Carla", "Zamora", 22, 290144444, "carla@pyme.com");

        pyme.agregarEmpleado(jefe1);
        pyme.agregarEmpleado(vendedor1);
        pyme.agregarEmpleado(obrero1);
        pyme.agregarEmpleado(jornalero1);

        System.out.println("Total de haberes del plantel completo:"+pyme.getTotalhaberes());

        System.out.println("Ordenado por legajo");
        for(Empleado empaux:pyme.listarPorLegajo()){
            empaux.getInfo();
        }
        System.out.println("Ordenado por Apellido y Nombre");
        for(Empleado empaux:pyme.listarPorApellidoNombre()){
            empaux.getInfo();
        }
    }
}
