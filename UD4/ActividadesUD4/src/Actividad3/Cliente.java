
public class Cliente {
    private int idCliente;
    private String dni;
    private String nombre;
    private String ciudad;
    private String fechaNacimiento;
    private double porcDescuento;
    private Sucursal sucursalAsociada;

    public Cliente(int idCliente, String dni, String nombre, String ciudad,
                   String fechaNacimiento, double porcDescuento, Sucursal sucursalAsociada) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.porcDescuento = porcDescuento;
        this.sucursalAsociada = sucursalAsociada;
    }

    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + idCliente +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", descuento=" + porcDescuento +
                ", sucursal=" + sucursalAsociada.getNroSucursal() +
                '}';
    }
}
