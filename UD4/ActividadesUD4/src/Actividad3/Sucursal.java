package Actividad3;

public class Sucursal {
    private int nroSucursal;
    private String direccion;
    private String localidad;

    public Sucursal(int nroSucursal, String direccion, String localidad) {
        this.nroSucursal = nroSucursal;
        this.direccion = direccion;
        this.localidad = localidad;
    }

    public int getNroSucursal() {
        return nroSucursal;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nroSucursal=" + nroSucursal +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
