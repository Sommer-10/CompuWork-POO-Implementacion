public class EmpleadoTemporal extends Empleado {
    private int mesesContrato;

    public EmpleadoTemporal(String id, String nombre, double salario, int mesesContrato) {
        super(id, nombre, salario);
        this.mesesContrato = mesesContrato;
    }

    public int getMesesContrato() { return mesesContrato; }
    public void setMesesContrato(int mesesContrato) { this.mesesContrato = mesesContrato; }

    @Override
    public double calcularBonificacion() {
        return getSalario() * 0.05;
    }
}
