import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Departamento departamento = new Departamento("Recursos Humanos");

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE EMPLEADOS ---");
            System.out.println("1. Agregar empleado permanente");
            System.out.println("2. Agregar empleado temporal");
            System.out.println("3. Ver empleados del departamento");
            System.out.println("4. Generar reporte de desempeño");
            System.out.println("5. Eliminar empleado");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> agregarEmpleadoPermanente();
                case 2 -> agregarEmpleadoTemporal();
                case 3 -> departamento.mostrarEmpleados();
                case 4 -> generarReporte();
                case 5 -> eliminarEmpleado();
                case 6 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    private static void agregarEmpleadoPermanente() {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Salario: ");
        double salario = scanner.nextDouble();
        System.out.print("Beneficios: ");
        double beneficios = scanner.nextDouble();

        Empleado emp = new EmpleadoPermanente(id, nombre, salario, beneficios);
        try {
            departamento.agregarEmpleado(emp);
            System.out.println("Empleado permanente agregado con éxito.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void agregarEmpleadoTemporal() {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Salario: ");
        double salario = scanner.nextDouble();
        System.out.print("Meses de contrato: ");
        int meses = scanner.nextInt();

        Empleado emp = new EmpleadoTemporal(id, nombre, salario, meses);
        try {
            departamento.agregarEmpleado(emp);
            System.out.println("Empleado temporal agregado con éxito.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void generarReporte() {
        System.out.print("Ingrese el ID del empleado: ");
        String id = scanner.nextLine();
        Empleado emp = departamento.buscarEmpleadoPorId(id);
        if (emp != null) {
            ReporteDesempenio rep = new ReporteDesempenio(emp, "Desempeño excelente");
            rep.generarReporte();
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    private static void eliminarEmpleado() {
        System.out.print("Ingrese el ID del empleado a eliminar: ");
        String id = scanner.nextLine();
        departamento.eliminarEmpleadoPorId(id);
        System.out.println("Empleado eliminado si existía en el sistema.");
    }
}
