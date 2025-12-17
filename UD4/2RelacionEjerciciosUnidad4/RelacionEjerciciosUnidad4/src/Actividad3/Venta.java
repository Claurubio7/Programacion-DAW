package Actividad3;

public class Venta {

    private Sucursal sucursal;
    private Producto producto;
    private int cantidad;
    private int precioVenta;

    public Venta(Sucursal sucursal, Producto producto, int precioVenta, int cantidad) {
        this.sucursal = sucursal;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }

    public Sucursal getSucursal() { return sucursal; }
    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public int getPrecioVenta() { return precioVenta;}


    @Override
    public String toString() {
        return sucursal + " vendió " + cantidad + " unidades de " + producto;
    }
}
