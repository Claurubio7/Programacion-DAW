
public class Eje5 {

    public static void imprimirTablero(boolean valor) {
        if (valor) {
            // true --> tablero 4 en raya
            System.out.println("=== TABLERO: 4 EN RAYA ===");
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("|---|---|---|---|---|---|---|");
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("|---|---|---|---|---|---|---|");
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("|---|---|---|---|---|---|---|");
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("|---|---|---|---|---|---|---|");
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("|---|---|---|---|---|---|---|");
            System.out.println("|   |   |   |   |   |   |   |");
            System.out.println("-----------------------------");
            System.out.println("  1   2   3   4   5   6   7");
        } else {
            // false --> tablero 3 en raya
            System.out.println("=== TABLERO: 3 EN RAYA ===");
            System.out.println("   |   |   ");
            System.out.println("---|---|---");
            System.out.println("   |   |   ");
            System.out.println("---|---|---");
            System.out.println("   |   |   ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Mostrando el tablero del 4 en raya (valor = true):");
        imprimirTablero(true);

        System.out.println("\nMostrando el tablero del 3 en raya (valor = false):");
        imprimirTablero(false);
    }
}
