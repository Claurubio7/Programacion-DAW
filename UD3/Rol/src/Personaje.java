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




// public class Personaje {
//     public enum Tipo { CABALLERO, MAGO, ORCO }

//     private String nombre;
//     private int vida;
//     private int ataque;
//     private int defensa;
//     private Tipo tipo;

//     public Personaje(String nombre, int vida, int ataque, int defensa, Tipo tipo) {
//         this.nombre = nombre;
//         this.vida = vida;
//         this.ataque = ataque;
//         this.defensa = defensa;
//         this.tipo = tipo;
//     }

//     // getters
//     public String getNombre() { return nombre; }
//     public int getVida() { return vida; }
//     public int getAtaque() { return ataque; }
//     public int getDefensa() { return defensa; }
//     public Tipo getTipo() { return tipo; }

//     // atacar: devuelve el valor de ataque del atacante (se usa fuera para calcular daño)
//     public int atacar(Personaje objetivo) {
//         return this.ataque;
//     }

//     // recibirDaño: reduce la vida por la cantidad dada (no deja vida negativa)
//     public void recibirDaño(int dano) {
//         if (dano < 0) dano = 0;
//         this.vida -= dano;
//         if (this.vida < 0) this.vida = 0;
//     }

//     // estaVivo: true si la vida > 0
//     public boolean estaVivo() {
//         return this.vida > 0;
//     }

//     @Override
//     public String toString() {
//         return String.format("%s (%s) - Vida: %d, Ataque: %d, Defensa: %d",
//                 nombre, tipo, vida, ataque, defensa);
//     }
// }
