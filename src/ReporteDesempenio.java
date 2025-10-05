public class ReporteDesempenio {
    private Empleado empleado;
    private String evaluacion;

    public ReporteDesempenio(Empleado empleado, String evaluacion) {
        this.empleado = empleado;
        this.evaluacion = evaluacion;
    }

    public void generarReporte() {
        System.out.println("\n=== REPORTE DE DESEMPEÑO ===");
        empleado.mostrarInfo();
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Bonificación calculada: $" + empleado.calcularBonificacion());
        System.out.println("=============================");
    }
}
