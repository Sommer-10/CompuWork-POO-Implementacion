import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // Evitamos duplicados por ID
    public void agregarEmpleado(Empleado empleado) throws Exception {
        for (Empleado e : empleados) {
            if (e.getId().equals(empleado.getId())) {
                throw new Exception("El empleado con ID " + empleado.getId() + " ya pertenece a este departamento.");
            }
        }
        empleados.add(empleado);
    }

    public void eliminarEmpleadoPorId(String id) throws Exception {
        boolean eliminado = empleados.removeIf(e -> e.getId().equals(id));
        if (!eliminado) throw new Exception("No se encontró empleado con ID: " + id);
    }

    // Devolvemos lista inmodificable para proteger integridad
    public List<Empleado> getEmpleados() {
        return Collections.unmodifiableList(empleados);
    }
}
