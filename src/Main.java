public class Main {
    public static void main(String[] args) {
        try {
            // Crear empleados
            Empleado emp1 = new EmpleadoPermanente("001", "Ana", 2000.0, 300.0);
            Empleado emp2 = new EmpleadoTemporal("002", "Luis", 1500.0, 6);

            // Crear departamento
            Departamento dep = new Departamento("Recursos Humanos");

            // Agregar empleados
            dep.agregarEmpleado(emp1);
            dep.agregarEmpleado(emp2);

            // Generar reportes
            ReporteDesempenio r1 = new ReporteDesempenio(emp1, "Excelente desempeño en proyectos.");
            ReporteDesempenio r2 = new ReporteDesempenio(emp2, "Cumplió con las tareas asignadas.");

            r1.generarReporte();
            r2.generarReporte();

            // Mostrar empleados en el departamento
            System.out.println("\nEmpleados en " + dep.getNombre() + ":");
            for (Empleado e : dep.getEmpleados()) {
                System.out.println("- " + e.getNombre() + " (ID: " + e.getId() + ")");
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
