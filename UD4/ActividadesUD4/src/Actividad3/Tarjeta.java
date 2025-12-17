package Actividad3;

public class Tarjeta {
    private int nroTarjeta;
    private String tipo;
    private String codSeguridad;
    private String vencimiento;
    private Cliente titular;  // FK hacia cliente

    public Tarjeta(int nroTarjeta, String tipo, String codSeguridad, String vencimiento, Cliente titular) {
        this.nroTarjeta = nroTarjeta;
        this.tipo = tipo;
        this.codSeguridad = codSeguridad;
        this.vencimiento = vencimiento;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "numero=" + nroTarjeta +
                ", tipo='" + tipo + '\'' +
                ", codigo='" + codSeguridad + '\'' +
                ", vencimiento='" + vencimiento + '\'' +
                ", titular=" + titular.getIdCliente() +
                '}';
    }
}
