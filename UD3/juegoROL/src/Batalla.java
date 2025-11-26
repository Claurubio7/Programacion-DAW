
import java.util.ArrayList;
import java.util.Scanner;

public class Batalla {

    
    private ArrayList<Personaje> heroes = new ArrayList<>();
    private ArrayList<Personaje> orcos = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
         int opcion;

        do {

            System.out.println("\n*** MENU ***");
            System.out.println("1. Crear personaje (caballero o mago)");
            System.out.println("2. Crear orco");
            System.out.println("3. Mostrar listas");
            System.out.println("4. Iniciar batalla");
            System.out.println("0. Salir"); 
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    crearPersonaje(false);
                    break;
                case 2:
                    crearPersonaje(true);
                    break;
                case 3:
                    muestraListas();
                    break;
                case 4:
                    iniciaBatalla();
                    break;
            }


        } while (true);
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
    }

    public void muestraListas() {
        System.out.println("\n*** HEROES ***");
        for (Personaje p : heroes) System.out.println(p);

        System.out.println("\n*** ORCOS ***");
        for (Personaje p : orcos) System.out.println(p);
    }
    

}
