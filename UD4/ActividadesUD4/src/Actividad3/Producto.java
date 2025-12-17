public class Producto {
    private int codigo;
    private String descripcion;
    private String color;
    private double costo;
    private Fabrica fabrica;  

    public Producto(int codigo, String descripcion, String color,
                    double costo, Fabrica fabrica) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.color = color;
        this.costo = costo;
        this.fabrica = fabrica;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", color='" + color + '\'' +
                ", costo=" + costo +
                ", fabrica=" + fabrica.getCuit() +
                '}';
    }
}
