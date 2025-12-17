package Actividad4;

public class Version {
    private int id;
    private Modelo modelo;
    private String nombre;
    private int potencia;
    private double precioBase;
    private String tipoCombustible;

    public Version(int id, Modelo modelo, String nombre, int potencia,
                   double precioBase, String tipoCombustible) {
        this.id = id;
        this.modelo = modelo;
        this.nombre = nombre;
        this.potencia = potencia;
        this.precioBase = precioBase;
        this.tipoCombustible = tipoCombustible;
    }

    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return modelo + " " + nombre + " (" + potencia + "cv)";
    }
}
