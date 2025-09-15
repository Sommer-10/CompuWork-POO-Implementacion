public class ReporteDesempenio {
    private Empleado empleado;
    private String evaluacion;

    public ReporteDesempenio(Empleado empleado, String evaluacion) {
        this.empleado = empleado;
        this.evaluacion = evaluacion;
    }

    public void generarReporte() {
        System.out.println("====== REPORTE DE DESEMPEÑO ======");
        System.out.println("Empleado: " + empleado.getNombre() + " (ID: " + empleado.getId() + ")");
        System.out.println("Evaluación: " + evaluacion);
        System.out.printf("Bonificación calculada: $%.2f%n", empleado.calcularBonificacion());
        System.out.println("==================================");
    }

    @Override
    public String toString() {
        return "ReporteDesempenio{" +
                "empleado=" + empleado.getNombre() +
                ", evaluacion='" + evaluacion + ''' +
                '}';
    }
}
