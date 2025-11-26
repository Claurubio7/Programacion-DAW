public class Personaje {

    public enum Tipo { CABALLERO, MAGO, ORCO }

    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private Tipo tipo;

    public Personaje(String nombre, int vida, int ataque, int defensa, Tipo tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.tipo = tipo;
    }

    public void atacar(Personaje enemigo) {
        int daño = ataque - enemigo.defensa;
        if (daño < 0) daño = 0; // por si acaso
        enemigo.recibirDaño(daño);
    }

    public void recibirDaño(int daño) {
        vida -= daño;
        if (vida < 0) vida = 0;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") Vida:" + vida +
                " Atq:" + ataque + " Def:" + defensa;
    }
}

