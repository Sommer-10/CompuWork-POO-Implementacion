import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) throws Exception {
        for (Empleado emp : empleados) {
            if (emp.getId().equals(e.getId())) {
                throw new Exception("Empleado ya registrado con ese ID");
            }
        }
        empleados.add(e);
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Empleados del departamento " + nombre + ":");
            for (Empleado e : empleados) {
                e.mostrarInfo();
            }
        }
    }

    public Empleado buscarEmpleadoPorId(String id) {
        for (Empleado e : empleados) {
            if (e.getId().equals(id)) return e;
        }
        return null;
    }

    public void eliminarEmpleadoPorId(String id) {
        empleados.removeIf(e -> e.getId().equals(id));
    }
}
