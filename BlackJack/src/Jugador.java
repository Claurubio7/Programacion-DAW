

public class Jugador {

    private String nombre;
    private int dinero = 100;
    private Tipo tipo;
    private Mano mano = new Mano();

    public Jugador(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Mano getMano() {
        return mano;
    }

    public int getDinero() {
        return dinero;
    }

    public void ganar(int cantidad) {
        dinero += cantidad;
    }

    public void perder(int cantidad) {
        dinero -= cantidad;
    }

    public void resetearMano() {
        mano.limpiar();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " - Fondos: " + dinero + "€ - Mano: " + mano;
    }
}
