package Actividad3;

import java.util.ArrayList;

public class Empleado {

    private String legajo;
    private String dni;
    private String nombre;
    private ArrayList<String> telefonos;

    private String calle;
    private String ciudad;
    private String numeroCasa;

    private ArrayList<Trabajo> trabajos; 

    public Empleado(String legajo, String dni, String nombre,
                    String calle, String numeroCasa, String ciudad) {

        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.calle = calle;
        this.numeroCasa = numeroCasa;
        this.ciudad = ciudad;

        telefonos = new ArrayList<>();
        trabajos = new ArrayList<>();
    }

    public void addTelefono(String tel) {
        telefonos.add(tel);
    }

    public void addTrabajo(Trabajo t) {
        trabajos.add(t);
    }

    @Override
    public String toString() {
        return nombre + " (Legajo: " + legajo + ")";
    }
}
