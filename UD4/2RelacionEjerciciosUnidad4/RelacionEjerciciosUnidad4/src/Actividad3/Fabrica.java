package Actividad3;

public class Fabrica {

    private String cuit;
    private String nombre;
    private String pais;
    private int cantEmp;
    private String gerente;

    public Fabrica(String cuit, String nombre, String pais, int cantEmp, String gerente) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.pais = pais;
        this.cantEmp = cantEmp;
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return nombre + " (" + pais + ")";
    }
}
