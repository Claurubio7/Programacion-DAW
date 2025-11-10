import java.util.Scanner;

// Devolver un Array que contenga valor máximo y mínimo del array introducido como parámetro

public class Ejer3 {

    public static int[] obtenerMinMax(int[] numeros) {
        int min = numeros[0];
        int max = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        int[] resultado = {min, max};
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas introducir?: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int[] minMax = obtenerMinMax(numeros);

        System.out.println("\nValor mínimo: " + minMax[0]);
        System.out.println("Valor máximo: " + minMax[1]);

    }
}

