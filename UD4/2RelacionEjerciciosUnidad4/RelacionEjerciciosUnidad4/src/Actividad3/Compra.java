package Actividad3;

public class Compra {

    private Sucursal sucursal;
    private Cliente cliente;
    private int descuento;

    public Compra(Sucursal sucursal, Cliente cliente, int descuento) {
        this.sucursal = sucursal;
        this.cliente = cliente;
        this.descuento = descuento;

        cliente.setSucursal(sucursal, descuento);
    }

    @Override
    public String toString() {
        return cliente + " compra en " + sucursal + " con " + descuento + "% de descuento";
    }
}
