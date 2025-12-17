package Actividad3;

public class SucursalVendeProductos {
    private Sucursal sucursal;
    private Producto producto;
    private double precioVenta;

    public SucursalVendeProductos(Sucursal sucursal, Producto producto, double precioVenta) {
        this.sucursal = sucursal;
        this.producto = producto;
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "sucursal=" + sucursal.getNroSucursal() +
                ", producto=" + producto.getCodigo() +
                ", precioVenta=" + precioVenta +
                '}';
    }
}
