
// Archivo: Batalla.java
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BatallaP {
    private ArrayList<Personaje> aliados; // caballeros y magos
    private ArrayList<Personaje> orcos;
    private Scanner sc;
    private Random rnd;

    public BatallaP() {
        aliados = new ArrayList<>();
        orcos = new ArrayList<>();
        sc = new Scanner(System.in);
        rnd = new Random();
    }

    // Mostrar el menú principal
    public void mostrarMenu() {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- MENU BATALLA ---");
            System.out.println("1 - Crear personaje");
            System.out.println("2 - Mostrar listas");
            System.out.println("3 - Iniciar batalla");
            System.out.println("0 - Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1:
                    crearPersonaje();
                    break;
                case 2:
                    muestraListas();
                    break;
                case 3:
                    iniciaBatalla();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    // Crear un personaje y añadirlo a la lista correspondiente
    public void crearPersonaje() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine().trim();

        int vida = pedirEntero("Vida (ej. 100): ");
        int ataque = pedirEntero("Ataque (ej. 20): ");
        int defensa = pedirEntero("Defensa (ej. 10): ");

        System.out.println("Tipo (1-Caballero, 2-Mago, 3-Orco): ");
        int t = pedirEntero("Elige tipo: ");
        Tipo tipo;
        if (t == 1) tipo = Tipo.CABALLERO;
        else if (t == 2) tipo = Tipo.MAGO;
        else tipo = Tipo.ORCO;

        Personaje p = new Personaje(nombre, vida, ataque, defensa, tipo);
        if (tipo == Tipo.ORCO) {
            orcos.add(p);
        } else {
            aliados.add(p);
        }

        System.out.println("Personaje creado: " + p);
    }

    private int pedirEntero(String mensaje) {
        int val = -1;
        while (val < 0) {
            System.out.print(mensaje);
            try {
                val = Integer.parseInt(sc.nextLine());
                if (val < 0) System.out.println("Introduce un número no negativo.");
            } catch (NumberFormatException e) {
                System.out.println("Número no válido. Intenta otra vez.");
            }
        }
        return val;
    }

    // Muestra los personajes en cada lista
    public void muestraListas() {
        System.out.println("\n--- Aliados (Caballeros y Magos) ---");
        if (aliados.isEmpty()) System.out.println("(vacío)");
        for (int i = 0; i < aliados.size(); i++) {
            System.out.println((i+1) + ") " + aliados.get(i));
        }

        System.out.println("\n--- Orcos ---");
        if (orcos.isEmpty()) System.out.println("(vacío)");
        for (int i = 0; i < orcos.size(); i++) {
            System.out.println((i+1) + ") " + orcos.get(i));
        }
    }

    // Inicia la batalla tal y como pide el enunciado
    public void iniciaBatalla() {
        if (aliados.isEmpty() || orcos.isEmpty()) {
            System.out.println("Ambas listas deben tener al menos un personaje para iniciar la batalla.");
            return;
        }

        System.out.println("\n--- INICIO DE LA BATALLA ---");
        int ronda = 1;

        while (!aliados.isEmpty() && !orcos.isEmpty()) {
            System.out.println("\nRonda " + ronda);
            // Elegir aleatoriamente un aliado y un orco
            Personaje a = aliados.get(rnd.nextInt(aliados.size()));
            Personaje o = orcos.get(rnd.nextInt(orcos.size()));

            System.out.println("Aliado elegido: " + a.getNombre() + " - " + a.getTipo());
            System.out.println("Orco elegido: " + o.getNombre() + " - " + o.getTipo());

            // Ambos atacan "a la vez": calcular daños primero
            int danioAO = a.getAtaque() - o.getDefensa();
            int danioOA = o.getAtaque() - a.getDefensa();
            if (danioAO < 0) danioAO = 0;
            if (danioOA < 0) danioOA = 0;

            System.out.println(a.getNombre() + " hace " + danioAO + " de daño a " + o.getNombre());
            System.out.println(o.getNombre() + " hace " + danioOA + " de daño a " + a.getNombre());

            // Aplicar daños
            a.recibirDaño(danioOA);
            o.recibirDaño(danioAO);

            // Comprobar muertes y eliminar de las listas si es necesario
            if (!a.estaVivo()) {
                System.out.println(a.getNombre() + " ha sido eliminado.");
                aliados.remove(a);
            }
            if (!o.estaVivo()) {
                System.out.println(o.getNombre() + " ha sido eliminado.");
                orcos.remove(o);
            }

            // Mostrar estado tras la ronda
            System.out.println("Estado tras la ronda:");
            muestraListas();

            ronda++;

            // Pequeña pausa para leer (opcional): pedir al usuario que pulse ENTER para continuar
            System.out.print("Pulsa ENTER para continuar la siguiente ronda...");
            sc.nextLine();
        }

        // Resultado final
        System.out.println("\n--- BATALLA TERMINADA ---");
        if (aliados.isEmpty() && orcos.isEmpty()) {
            System.out.println("Empate: ambas listas quedaron vacías.");
        } else if (aliados.isEmpty()) {
            System.out.println("Ganan los Orcos!");
        } else {
            System.out.println("Ganan los Aliados (Caballeros y Magos)!");
        }

        System.out.println("\nEstado final:");
        muestraListas();
    }
}


