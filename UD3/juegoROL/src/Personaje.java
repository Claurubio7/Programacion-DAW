public class Personaje {

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
        int danyo = this.ataque - enemigo.defensa;
        if (danyo < 0) danyo = 0; 
        enemigo.recibirDanyo(danyo);
    }
    public void recibirDanyo(int danyo) {
        this.vida -= danyo;
        if (vida <= 0) vida = 0;
    }
    public boolean estaVivo() {
        return this.vida > 0;
    }

    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }  
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") Vida:" + vida +
                " Atq:" + ataque + " Def:" + defensa;
    }

}
