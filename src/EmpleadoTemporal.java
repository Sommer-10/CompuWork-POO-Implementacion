public class EmpleadoTemporal extends Empleado {
    private int mesesContrato;

    public EmpleadoTemporal(String id, String nombre, double salario, int mesesContrato) {
        super(id, nombre, salario);
        this.mesesContrato = mesesContrato;
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    @Override
    public double calcularBonificacion() {
        return getSalario() * 0.05 * mesesContrato / 12; // proporcional
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Temporal | Duración contrato: " + mesesContrato + " meses");
    }
}
