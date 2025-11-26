import java.util.Arrays;
// Hacer un vector con todo el contenido de la matriz y ordenarlo

public class Actividad6 {

     public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {3, 7, 1},
            {4, -4, 2},
            {5, 0, 5}
        };
        
        int[] vector = crearVector(matriz);
        imprimirVector(vector);
        Arrays.sort(vector);
        System.out.println();
        imprimirVector(vector);
    }

    public static int[] crearVector(int[][] matriz) {
        int[] vector = new int[matriz.length * matriz[0].length];
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                vector[contador] = matriz[i][j];
                contador++;
            }
        }
        return vector;
    }
   
}