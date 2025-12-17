package Actividad1;
public class Pais{
    private String nombre;
    private int poblacion;
    private int PIB;

    public Pais(String nombre, int poblacion, int pIB) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.PIB = pIB;
    }

    public int PIBPerCapita() {
        int PIBPerCapita = (PIB*100000)/this.poblacion;
        return PIBPerCapita;
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
    public int getPIB() {
        return PIB;
    }
    public void setPIB(int pIB) {
        PIB = pIB;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pais{");
        sb.append("nombre=").append(nombre);
        sb.append(", poblacion=").append(poblacion);
        sb.append(", PIB=").append(PIB);
        sb.append('}');
        return sb.toString();
    }

    
    

}