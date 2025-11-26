import java.util.Scanner;
// Suma de los valores de cada fila y columna 
public class Actividad3{

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("\nMatriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumarFilas(int[][] matriz) {
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }
    }

    public static void sumarColumnas(int[][] matriz) {
        System.out.println("\nSuma de cada columna:");
        int columnas = matriz[0].length;
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("\nIntroduce los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Fila " + (i + 1) + ", Columna " + (j + 1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        imprimirMatriz(matriz);
        sumarFilas(matriz);
        sumarColumnas(matriz);
    }
}
