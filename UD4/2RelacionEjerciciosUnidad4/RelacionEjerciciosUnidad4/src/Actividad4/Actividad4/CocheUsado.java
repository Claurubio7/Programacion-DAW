package Actividad4;

public class CocheUsado {
    private int id;
    private Cliente cliente;
    private Modelo modelo;
    private String nombre;
    private String matricula;
    private double precioTasacion;
    private String fecha;

    public CocheUsado(int id, Cliente cliente, Modelo modelo, String nombre,
                      String matricula, double precioTasacion, String fecha) {
        this.id = id;
        this.cliente = cliente;
        this.modelo = modelo;
        this.nombre = nombre;
        this.matricula = matricula;
        this.precioTasacion = precioTasacion;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return nombre + " (" + matricula + ")";
    }
}
