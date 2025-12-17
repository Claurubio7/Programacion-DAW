package Actividad3;

import java.util.List;

public class Empleado {
    private int nroLegajo;
    private String dni;
    private String nombre;
    private String calle;
    private String ciudad;
    private int nroCalle;
    private List<Telefono> listaTelefonos;

    public Empleado(int nroLegajo, String dni, String nombre, String calle, String ciudad, int nroCalle, List<Telefono> listaTelefonos) {
        this.nroLegajo = nroLegajo;
        this.dni = dni;
        this.nombre = nombre;
        this.calle = calle;
        this.ciudad = ciudad;
        this.nroCalle = nroCalle;
        this.listaTelefonos = listaTelefonos;
    }

    public int getLegajo() {
        return nroLegajo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "legajo=" + nroLegajo +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + calle + " " + nroCalle + ", " + ciudad + '\'' +
                ", telefonos=" + listaTelefonos +
                '}';
    }
}
