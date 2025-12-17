package Actividad4;

import java.util.ArrayList;
import java.util.List;

public class CocheNuevo {
    private int id;
    private Version version;
    private Cliente cliente;
    private Vendedor vendedor;
    private String matricula;
    private String fecha;
    private List<Extra> extras = new ArrayList<>();

    public CocheNuevo(int id, Version version, Cliente cliente,
                      Vendedor vendedor, String matricula, String fecha) {
        this.id = id;
        this.version = version;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.matricula = matricula;
        this.fecha = fecha;
    }

    public void addExtra(Extra e) {
        extras.add(e);
    }

    @Override
    public String toString() {
        return "Coche nuevo: " + version + " [" + matricula + "]";
    }
}
