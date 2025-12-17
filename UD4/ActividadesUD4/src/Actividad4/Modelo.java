package Actividad4;

public class Modelo {
    private int id;
    private Marca marca;
    private String nombre;

    public Modelo(int id, Marca marca, String nombre) {
        this.id = id;
        this.marca = marca;
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return marca + " " + nombre;
    }
}

