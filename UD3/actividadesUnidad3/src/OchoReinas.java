import java.util.Scanner;

public class OchoReinas {

    public static final int N = 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = new int[N][N];

        System.out.print("Introduce la columna de la primera reina (0 a 7): ");
        int primeraColumna = sc.nextInt();

        // Colocar la primera reina
        tablero[0][primeraColumna] = 1;

        // Intentar resolver a partir de la fila 1
        if (resolver(tablero, 1)) {
            System.out.println("\nSolución encontrada:");
            imprimirTablero(tablero);
        } else {
            System.out.println("No hay solución con la reina en esa columna");
        }
    }

    // Función recursiva para colocar reinas
    public static boolean resolver(int[][] tablero, int fila) {
        if (fila == N) {
            return true; // Caso base: todas las reinas colocadas
        }

        for (int col = 0; col < N; col++) {
            if (esSeguro(tablero, fila, col)) {
                tablero[fila][col] = 1; // Colocamos la reina

                if (resolver(tablero, fila + 1)) {
                    return true; // Recursión exitosa
                }

                tablero[fila][col] = 0; // Backtracking
            }
        }

        return false; // No se puede colocar ninguna reina en esta fila
    }

    // Comprobar si se puede colocar una reina en (fila, col)
    public static boolean esSeguro(int[][] tablero, int fila, int col) {
        // Revisar columna
        for (int i = 0; i < fila; i++) {
            if (tablero[i][col] == 1) return false;
        }

        // Revisar diagonal superior izquierda
        for (int i = fila - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) return false;
        }

        // Revisar diagonal superior derecha
        for (int i = fila - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (tablero[i][j] == 1) return false;
        }

        return true; // Es seguro
    }

    // Función para imprimir el tablero
    public static void imprimirTablero(int[][] tablero) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
