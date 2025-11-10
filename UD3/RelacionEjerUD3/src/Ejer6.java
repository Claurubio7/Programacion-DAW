import java.util.Scanner;

// Dos matrices, obtener una matriz con:
// 1ª columna → la suma de todos los elementos de la fila.
// 2ª columna → el producto de los elementos.
// 3ª columna → la media.

public class Ejer6 {

    public static double[][] procesarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        double[][] resultado = new double[filas][3];

        for (int i = 0; i < filas; i++) {
            double suma = 0;
            double producto = 1;

            for (int j = 0; j < columnas; j++) {
                suma += matriz1[i][j] + matriz2[i][j];
                producto *= matriz1[i][j] * matriz2[i][j];
            }

            double media = suma / (filas * 2.0);

            resultado[0][i] = suma;
            resultado[1][i] = producto;
            resultado[2][i] = media;
    }
        return resultado;
    }

   public static void mostrarMatriz(double[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];

        System.out.println("\nIntroduce los valores de la primera matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("M1[" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nIntroduce los valores de la segunda matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("M2[" + i + "][" + j + "]: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        double[][] matrizResultado = procesarMatrices(matriz1, matriz2);

        System.out.println("\nMatriz resultado (Suma | Producto | Media):");
        mostrarMatriz(matrizResultado);

    
    }
}