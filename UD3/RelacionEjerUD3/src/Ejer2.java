import java.util.Scanner;
import java.util.Arrays;

// Pedir a usuario nº a introducir, Mostrar vector original, resultado de mayor a menor 

public class Ejer2 {

    // Mostrar el vector original 
    public static void mostrarVector(int[] vector) {
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("]");
    }

    // Ordenar de mayor a menor --> método burbuja
    public static void ordenarDescendente(int[] vector) {
        int aux;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j] < vector[j + 1]) {
                    // Intercambiamos los valores
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas introducir?: ");
        int cantidad = sc.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        
        System.out.println("\nVector original:");
        mostrarVector(numeros);
        ordenarDescendente(numeros);
        System.out.println("\nVector ordenado (de mayor a menor):");
        mostrarVector(numeros);
        
    }
}
