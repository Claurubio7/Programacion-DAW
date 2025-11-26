import java.util.Scanner;

public class Ej3 {
    static int[][] matriz = new int[5][5];  
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n*** MENÚ ***");
            System.out.println("1. Rellenar matriz");
            System.out.println("2. Mostrar matriz");
            System.out.println("3. Calcular sumas, máximo y mínimo");
            System.out.println("4. Modificar una coordenada");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    rellenarMatriz();
                    System.out.println("Matriz rellenada correctamente.");
                    break;

                case 2:
                    mostrarMatriz();
                    break;

                case 3:
                    calcular();
                    break;

                case 4:
                    modificarCoordenada();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }

    // 1. Rellenar matriz
    public static void rellenarMatriz() {
        int min = 1;
        int max = 10;

        for (int i = 0; i < 5; i++) {
            //llama al método generaFila(min, max) 
            // que devuelve un int[] de 5 elementos con números aleatorios entre min y max
            matriz[i] = generaFila(min, max);
            //después de generar cada fila, aumenta min y max en 10.
            min += 10;
            max += 10;
        }
    }

    // Generar fila --> números aleatorios 
    public static int[] generaFila(int min, int max) {

        //Crea un array fila de 5 enteros. Inicialmente todos sus valores son 0
        int[] fila = new int[5];
        for (int i = 0; i < fila.length; i++) {
            fila[i] = (int)(Math.random() * (max - min + 1)) + min;
        }
        return fila;
    }

    // 2. Mostrar matriz en formato tabla
    public static void mostrarMatriz() {

        System.out.println("\nMatriz actual:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.println("|");
        }
    }

    // 3. Calcular sumas, máximo y mínimo
    public static void calcular() {

        System.out.println("\n*** SUMA DE CADA FILA ***");
        for (int i = 0; i < matriz.length; i++) {
            //Inicializa sumaFila = 0 para acumular la suma de la fila actual.
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFila);
        }

        System.out.println("\n*** SUMA DE CADA COLUMNA ***");
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumna);
        }

        // Buscar máximo y mínimo
        int max = matriz[0][0];
        int min = matriz[0][0];
        int filaMax = 0, colMax = 0;
        int filaMin = 0, colMin = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    filaMax = i;
                    colMax = j;
                }

                if (matriz[i][j] < min) {
                    min = matriz[i][j];
                    filaMin = i;
                    colMin = j;
                }
            }
        }

        System.out.println("\nMáximo: " + max + " en posición (" + filaMax + "," + colMax + ")");
        System.out.println("Mínimo: " + min + " en posición (" + filaMin + "," + colMin + ")");
    }

    // 4. Modificar coordenada
    public static void modificarCoordenada() {

        System.out.print("Introduzca fila (0-4): ");
        int f = sc.nextInt();

        System.out.print("Introduzca columna (0-4): ");
        int c = sc.nextInt();

        if (f < 0 || f > 4 || c < 0 || c > 4) {
            System.out.println("ERROR: Coordenadas fuera del límite.");
            return;
        }

        System.out.print("Nuevo valor: ");
        int valor = sc.nextInt();

        matriz[f][c] = valor;
        System.out.println("Valor cambiado correctamente.");
    }
}
