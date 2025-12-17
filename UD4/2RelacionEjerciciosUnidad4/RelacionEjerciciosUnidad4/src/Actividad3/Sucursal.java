package Actividad3;

import java.util.ArrayList;

public class Sucursal {

    private String numero;
    private String domicilio;
    private String ciudad;

    private ArrayList<Compra> compras;
    private ArrayList<Venta> ventas;
    private ArrayList<Trabajo> trabajos;

    public Sucursal(String numero, String domicilio, String ciudad) {
        this.numero = numero;
        this.domicilio = domicilio;
        this.ciudad = ciudad;

        compras = new ArrayList<>();
        ventas = new ArrayList<>();
        trabajos = new ArrayList<>();
    }

    public void addCliente(Cliente c, int descuento) {
        compras.add(new Compra(this, c, descuento));
    }

    public void venderProducto(Producto p, int cantidad, int precioVenta) {
        ventas.add(new Venta(this, p, cantidad, precioVenta));
    }

    public void asignarEmpleado(Empleado e, String dia, String horario) {
        trabajos.add(new Trabajo(this, e, dia, horario));
    }

    @Override
    public String toString() {
        return "Sucursal " + numero + " - " + ciudad;
    }
}
