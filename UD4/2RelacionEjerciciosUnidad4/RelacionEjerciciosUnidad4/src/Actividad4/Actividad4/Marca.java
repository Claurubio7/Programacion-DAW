package Actividad4;

public class Marca {
    private int id;
    private String nombre;

    public Marca(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return nombre;
    }
}

