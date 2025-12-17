package Actividad4;

public class Extra {
    private int id;
    private String nombre;
    private String descripcion;

    public Extra(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return nombre;
    }
}
