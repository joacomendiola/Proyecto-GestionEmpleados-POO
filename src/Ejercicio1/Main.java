package TP1;

public class Main {
    public static void main(String[] args) {
        Persona duenio = new Persona("Ana", "García", 45, "290112345", "ana@pyme.com");
        Pyme pyme = new Pyme(duenio, 8, 17, "Yrigoyen 123");

        Empleado jefe1 = new EmpleadoJefe(200000,1, "José", "Pérez", 50, "290111111", "jose@pyme.com");
        Empleado vendedor1 = new EmpleadoComision(2, 80000, 80000, 0.10, "Laura", "Acosta", 30, "290122222", "laura@pyme.com");
        Empleado obrero1 = new EmpleadoSubordinado(3, 60, 1200, "Mario", "Ríos", 28, "290133333", "mario@pyme.com");
        Empleado jornalero1 = new EmpleadoPorHora(4, 2500, 3750, 40, 5, "Carla", "Zamora", 22, "290144444", "carla@pyme.com");

        pyme.agregarEmpleado(jefe1);
        pyme.agregarEmpleado(vendedor1);
        pyme.agregarEmpleado(obrero1);
        pyme.agregarEmpleado(jornalero1);

        System.out.println("\n---------------------------------------------");
        System.out.println("   TOTAL DE HABERES DEL PLANTEL COMPLETO");
        System.out.println("---------------------------------------------");
        System.out.printf("   Total: $ %.2f%n", pyme.getTotalhaberes());
        System.out.println("---------------------------------------------");

        System.out.println("\n============= ORDENADO POR LEGAJO =============\n");
        for (Empleado emp : pyme.listarPorLegajo()) {
            System.out.println(emp);
        }

        System.out.println("\n============= ORDENADO POR APELLIDO Y NOMBRE =============\n");
        for (Empleado empaux : pyme.listarPorApellidoNombre()) {
            System.out.println(empaux);
        }
    }
}
