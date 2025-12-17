package Actividad3;

public class Tarjeta {

    private String numero;
    private String nombre;
    private String codigo;
    private String fechaVenc;

    public Tarjeta(String numero, String nombre, String codigo, String fechaVenc) {
        this.numero = numero;
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaVenc = fechaVenc;
    }

    @Override
    public String toString() {
        return numero + " - " + nombre;
    }
}
