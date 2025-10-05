public abstract class Empleado {
    private String id;
    private String nombre;
    private double salario;

    public Empleado(String id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método abstracto
    public abstract double calcularBonificacion();

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Salario: $" + salario);
    }
}
