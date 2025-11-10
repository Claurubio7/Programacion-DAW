import java.util.Scanner;

// Décimo de la bonoloto, array con valores correctos y otro con lo que introduzca el usuario.
public class Ejer4 {

    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array con los números ganadores 
        int[] numerosGanadores = {5, 12, 23, 34, 45, 49};
        int[] numerosUsuario = new int[6];

        System.out.println("*** COMPROBADOR BONOLOTO ***");
        System.out.println("\nIntroduce tus 6 números (entre 1 y 49):");

        for (int i = 0; i < numerosUsuario.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numerosUsuario[i] = sc.nextInt();
        }

        // Aciertos
        int aciertos = 0;
        for (int i = 0; i < numerosUsuario.length; i++) {
            for (int j = 0; j < numerosGanadores.length; j++) {
                if (numerosUsuario[i] == numerosGanadores[j]) {
                    aciertos++;
                }
            }
        }

        System.out.println("\nNúmeros ganadores: ");
        mostrarArray(numerosGanadores);
        System.out.println("Tus números: ");
        mostrarArray(numerosUsuario);
        System.out.println("\nHas tenido " + aciertos + " aciertos.");

    }

   
}

