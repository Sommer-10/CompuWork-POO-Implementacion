public class EmpleadoPermanente extends Empleado {
    private double beneficios;

    public EmpleadoPermanente(String id, String nombre, double salario, double beneficios) {
        super(id, nombre, salario);
        this.beneficios = beneficios;
    }

    public double getBeneficios() {
        return beneficios;
    }

    @Override
    public double calcularBonificacion() {
        return getSalario() * 0.10 + beneficios;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Permanente | Beneficios: $" + beneficios);
    }
}
