package Actividad3;

import java.util.ArrayList;

public class Cliente {

    private String codigo;
    private String nombre;
    private String ciudad;
    private String dni;
    private String fechaNac;

    private ArrayList<Tarjeta> tarjetas; 
    private Sucursal sucursal; 
    private int descuento; 

    public Cliente(String codigo, String nombre, String ciudad, String dni, String fechaNac) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.dni = dni;
        this.fechaNac = fechaNac;
        tarjetas = new ArrayList<>();
    }

    public void addTarjeta(Tarjeta t) {
        tarjetas.add(t);
    }

    public void setSucursal(Sucursal s, int descuento) {
        this.sucursal = s;
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + ")";
    }
}
