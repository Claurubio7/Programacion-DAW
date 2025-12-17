package Actividad3;
public class Fabrica {
    private String cuit;
    private String razonSocial;
    private String pais;
    private String nombreGerente;
    private int cantidadEmpleados;

    public Fabrica(String cuit, String razonSocial, String pais,
                   String nombreGerente, int cantidadEmpleados) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.pais = pais;
        this.nombreGerente = nombreGerente;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getCuit() {
        return cuit;
    }

    @Override
    public String toString() {
        return "Fabrica{" +
                "cuit='" + cuit + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", pais='" + pais + '\'' +
                ", gerente='" + nombreGerente + '\'' +
                ", empleados=" + cantidadEmpleados +
                '}';
    }
}
