package Actividad1;

public class Pais {

    private String nombre;
    private int poblacion;
    private int pib;

    public Pais(String nombre, int poblacion, int pib) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.pib = pib;
    }

    public int calcularPibPerCapita() {
        return (pib * 100000) / poblacion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getPib() {
        return pib;
    }
    public void setPib(int pib) {
        this.pib = pib;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pais{");
        sb.append("nombre=").append(nombre);
        sb.append(", poblacion=").append(poblacion);
        sb.append(", PIB=").append(pib);
        sb.append('}');
        return sb.toString();
    }
}
