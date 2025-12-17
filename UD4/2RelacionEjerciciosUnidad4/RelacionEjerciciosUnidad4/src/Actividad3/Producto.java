package Actividad3;

public class Producto {

    private String codigo;
    private String descripcion;
    private String color;
    private double costo;
    private Fabrica fabrica;

    public Producto(String codigo, String descripcion, String color, double costo, Fabrica fabrica) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.color = color;
        this.costo = costo;
        this.fabrica = fabrica;
    }

    

    @Override
    public String toString() {
        return descripcion + " (" + codigo + ")";
    }
}
