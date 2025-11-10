import java.util.ArrayList;
import java.util.Scanner;

public class Ejer9 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int opcion;

        do {
            mostrarMenu();
            opcion = consola.nextInt();

            switch (opcion) {
                case 1 -> agregarNumero(lista, consola);
                case 2 -> eliminarNumero(lista, consola);
                case 3 -> mostrarNumeros(lista);
                case 4 -> comprobarNumero(lista, consola);
                case 5 -> eliminarTodos(lista);
                case 6 -> consultarTamano(lista);
                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 7);

    }

    public static void mostrarMenu() {
    System.out.println("*** MENÚ ***");
    System.out.println("1. Agregar un número");
    System.out.println("2. Eliminar un número");
    System.out.println("3. Mostrar todos los números");
    System.out.println("4. Comprobar si un número está en la lista");
    System.out.println("5. Eliminar todos los números");
    System.out.println("6. Consultar el tamaño de la lista");
    System.out.println("7. Salir");
    System.out.print("\nElige una opción: ");
}


    public static void agregarNumero(ArrayList<Integer> lista, Scanner sc) {
        int num;
        do {
            System.out.print("Introduce un número positivo: ");
            num = sc.nextInt();
            if (num < 0) System.out.println("Número negativo, inténtalo de nuevo.");
        } while (num < 0);
        lista.add(num);
        System.out.println("Número agregado.");
    }

    public static void eliminarNumero(ArrayList<Integer> lista, Scanner sc) {
        System.out.print("Introduce el número a eliminar: ");
        int numeroEliminar = sc.nextInt();
        boolean existe = lista.removeIf(n -> n == numeroEliminar);
        if (existe) {
            System.out.println("Se eliminaron todas las ocurrencias de " + numeroEliminar);
        } else {
            System.out.println("El número no está en la lista.");
        }
    }

    public static void mostrarNumeros(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("Números en la lista: " + lista);
        }
    }

    public static void comprobarNumero(ArrayList<Integer> lista, Scanner consola) {
        System.out.print("Introduce el número a buscar: ");
        int buscar = consola.nextInt();
        if (lista.contains(buscar)) {
            System.out.println("El número " + buscar + " está en la lista.");
        } else {
            System.out.println("El número " + buscar + " NO está en la lista.");
        }
    }

    public static void eliminarTodos(ArrayList<Integer> lista) {
        lista.clear();
        System.out.println("Se eliminaron todos los números de la lista.");
    }

    public static void consultarTamano(ArrayList<Integer> lista) {
        System.out.println("El tamaño de la lista es: " + lista.size());
    }
}