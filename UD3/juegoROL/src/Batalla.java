import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Batalla {

    private ArrayList<Personaje> heroes = new ArrayList<>();
    private ArrayList<Personaje> orcos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
         int opcion;

        do {

            System.out.println("\n*** MENU BATALLA ***");
            System.out.println("1. Crear personaje");
            System.out.println("2. Mostrar listas");
            System.out.println("3. Iniciar batalla");
            System.out.println("4. Salir");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> crearPersonaje();
                case 2 -> muestraListas();
                case 3 -> iniciaBatalla();
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 4);
    }

    public void crearPersonaje() {
        System.out.print("\nTipo (1=CABALLERO, 2=MAGO, 3=ORCO): ");
        int t = sc.nextInt();
        sc.nextLine();

         Tipo tipo = switch (t) {
            case 1 -> Tipo.CABALLERO;
            case 2 -> Tipo.MAGO;
            default -> Tipo.ORCO;
        };

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Vida: ");
        int vida = sc.nextInt();

        System.out.print("Ataque: ");
        int ataque = sc.nextInt();

        System.out.print("Defensa: ");
        int defensa = sc.nextInt();
        sc.nextLine(); // limpiar buffer


        Personaje p = new Personaje(nombre, vida, ataque, defensa, tipo);

        if (tipo == Tipo.ORCO)
            orcos.add(p);
        else
            heroes.add(p);

        System.out.println("Personaje creado correctamente: " + p);
    }


    public void iniciaBatalla() {
        if (heroes.isEmpty()) {
            System.out.println("Debes añadir un Heroe(caballero/mago)");
        } else if (orcos.isEmpty()) {
            System.out.println("Debes añadir un orco");
        } else {

            System.out.println("\n*** INICIO DE LA BATALLA ***");

            while (!heroes.isEmpty() && !orcos.isEmpty()) {
                // Elegir aleatoriamente un heroe y un orco
                Personaje h = heroes.get((int)(Math.random() * heroes.size()));
                Personaje o = orcos.get((int)(Math.random() * orcos.size()));

                System.out.println("\n--- ENFRENTAMIENTO ---");
                System.out.println("Héroe:  " + h);
                System.out.println("Orco:   " + o);

                h.atacar(o);
                o.atacar(h);

                System.out.println("Después del ataque:");
                System.out.println(h);
                System.out.println(o);
                

                if (!h.estaVivo()) {
                    System.out.println("El héroe " + h.getNombre() + " ha muerto.");
                    heroes.remove(h);
                }
                if (!o.estaVivo()) {
                    System.out.println("El orco " + o.getNombre() + " ha muerto.");
                    orcos.remove(o);
                }
            }

            // Resultado final
            System.out.println("\n--- BATALLA TERMINADA ---");
            if (heroes.isEmpty() && orcos.isEmpty()) {
                System.out.println("Empate: ambas listas quedaron vacías.");
            } else if (heroes.isEmpty()) {
                System.out.println("Ganan los Orcos!");
            } else {
                System.out.println("Ganan los Héroes (Caballeros y Magos)!");
            }

            System.out.println("\n*** ESTADO FINAL DE LAS LISTAS ***");
            muestraListas();
        }

    }
    
    public void muestraListas() {

        if (heroes.isEmpty() && orcos.isEmpty()){
            System.out.println("\nLas listas están vacías.");
        }else {
            System.out.println("\n*** MOSTRAR HÉROES (Caballeros y Magos) ***");
            for (int i = 0; i < heroes.size(); i++) {
                System.out.println(heroes.get(i));
            }

            System.out.println("*** MOSTRAR ORCOS ***");
            for (int i = 0; i < orcos.size(); i++) {
                System.out.println(orcos.get(i));
            }
        }
    }
    

}
