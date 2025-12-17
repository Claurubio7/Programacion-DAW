package Actividad4;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String telefono;

    public Cliente(int id, String nombre, String apellido1, String apellido2,
                   String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido1;
    }
}
