package matrices;

import java.util.Scanner;

public class Matrices {

    public static void ImprimeMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }

    // Vamos a solicitar filas y columnas
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.print("Introduzca filas: ");
    int filas=sc.nextInt();
    System.out.print("Introduzca columnas: ");
    int columnas= sc.nextInt();

    //Generar la matriz dinámica 
    int[][] matriz = new int[filas][columnas];

    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            matriz[i][j] = (int)(Math.random()*10)+1;
        }
    }
    // System.out.println(matriz[0][3]);
    // Imprimir matriz
    ImprimeMatriz(matriz);

    //Suma de los elementos de cada fila
    int[] resultadoFila= new int[filas];
    int[] resultadoColumna= new int[columnas]; 

    //Recorrer por filas
    for (int i = 0; i <filas; i++) {
        int total=0;
        for (int j = 0; j < columnas; j++) {
            total+= matriz[i][j];
        }
        resultadoFila[i]=total;
    }
    //Mostrar las sumas
    System.out.println("\nSumas por FILAS:");
    for (int i = 0; i < filas; i++) {
        System.out.println(resultadoFila[i]);
    }

    //Recorrer por columnas
    for (int i = 0; i < columnas; i++) {
        int total=0;
        for (int j = 0; j < filas; j++) {
            total+=matriz[j][i];
        }
        resultadoColumna[i]=total;
    }
    //Mostrar las sumas
    System.out.println("\nSumas por COLUMNAS:");
    for (int j = 0; j < columnas; j++) {
        System.out.println(resultadoColumna[j]);
    }
   }
}
