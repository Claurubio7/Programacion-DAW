import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera palabra: ");
        String palabra = sc.nextLine();
        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = sc.nextLine();
        boolean validar = verificaAnagrama(palabra, palabra2);

        if (validar) {
            System.out.println("Son anagrama.");
        } else {
            System.out.println("No son anagrama.");
        }
    }

    public static boolean verificaAnagrama(String palabra, String palabra2) {

        if (palabra.length() != palabra2.length()) {
            return false;
        }

        // Pasar a minúsculas para evitar los problemas de mayúsculas
        palabra = palabra.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        // Convertir a char[]
        char[] letras1 = palabra.toCharArray();
        char[] letras2 = palabra2.toCharArray();

        // Ordenar
        Arrays.sort(letras1);
        Arrays.sort(letras2);

        // Comparar
        return Arrays.equals(letras1, letras2);
    }
}
