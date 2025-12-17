package Actividad4;

public class Vendedor {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String direccion;

    public Vendedor(int id, String nombre, String apellido1, String apellido2,
                    String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido1;
    }
}
