import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Batalla {

    private ArrayList<Personaje> heroes = new ArrayList<>();
    private ArrayList<Personaje> orcos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Random rnd = new Random();

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Crear personaje (caballero o mago)");
            System.out.println("2. Crear orco");
            System.out.println("3. Mostrar listas");
            System.out.println("4. Iniciar batalla");
            System.out.println("0. Salir");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> crearPersonaje(false);
                case 2 -> crearPersonaje(true);
                case 3 -> muestraListas();
                case 4 -> iniciaBatalla();
            }

        } while (opcion != 0);
    }

    public void crearPersonaje(boolean esOrco) {
        sc.nextLine(); // limpiar buffer
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Vida: ");
        int vida = sc.nextInt();

        System.out.print("Ataque: ");
        int ataque = sc.nextInt();

        System.out.print("Defensa: ");
        int defensa = sc.nextInt();

        Personaje.Tipo tipo;

        if (esOrco) {
            tipo = Personaje.Tipo.ORCO;
            orcos.add(new Personaje(nombre, vida, ataque, defensa, tipo));
        } else {
            System.out.print("Tipo (1=Caballero, 2=Mago): ");
            int t = sc.nextInt();
            tipo = (t == 1) ? Personaje.Tipo.CABALLERO : Personaje.Tipo.MAGO;
            heroes.add(new Personaje(nombre, vida, ataque, defensa, tipo));
        }

        System.out.println("Personaje creado correctamente.");
    }

    public void muestraListas() {
        System.out.println("\n--- HEROES ---");
        for (Personaje p : heroes) System.out.println(p);

        System.out.println("\n--- ORCOS ---");
        for (Personaje p : orcos) System.out.println(p);
    }

    public void iniciaBatalla() {
        if (heroes.isEmpty() || orcos.isEmpty()) {
            System.out.println("Debe haber personajes en ambas listas.");
            return;
        }

        System.out.println("\n¡COMIENZA LA BATALLA!");

        while (!heroes.isEmpty() && !orcos.isEmpty()) {
            int hIndex = rnd.nextInt(heroes.size());
            int oIndex = rnd.nextInt(orcos.size());

            Personaje h = heroes.get(hIndex);
            Personaje o = orcos.get(oIndex);

            System.out.println("\n" + h + " VS " + o);

            // Se atacan simultáneamente
            h.atacar(o);
            o.atacar(h);

            // Eliminación por muerte
            if (!h.estaVivo()) {
                System.out.println(h + " ha muerto.");
                heroes.remove(hIndex);
            }

            if (!o.estaVivo()) {
                System.out.println(o + " ha muerto.");
                orcos.remove(oIndex);
            }
        }

        // Resultado final
        if (heroes.isEmpty()) {
            System.out.println("\n🏆 GANAN LOS ORCOS 🏆");
        } else {
            System.out.println("\n🏆 GANAN LOS HEROES (CABALLEROS Y MAGOS) 🏆");
        }

        muestraListas();
    }
}




