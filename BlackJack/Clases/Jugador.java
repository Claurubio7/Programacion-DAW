package Clases;

public class Jugador {
    private String nombre;
    private int dinero = 100;
    private Tipo tipo;
    private Mano mano;
    private int victorias = 0;

    public Jugador() {
        this.mano = new Mano();
    }

    public Jugador(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.mano = new Mano();
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getDinero() {
        return dinero;
    }

    public void ganarDinero(int cantidad) {
        dinero += cantidad;
    }

    public void perderDinero(int cantidad) {
        dinero -= cantidad;
        if (dinero < 0) dinero = 0;
    }

    public Mano getMano() {
        return mano;
    }

    public void nuevaMano() {
        mano.limpiar();
    }

    public void sumarVictoria() {
        victorias++;
    }

    public int getVictorias() {
        return victorias;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", dinero=" + dinero +
                ", tipo=" + tipo +
                ", victorias=" + victorias +
                '}';
    }
}
