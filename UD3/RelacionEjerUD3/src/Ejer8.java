import java.util.Scanner;

//Plíndroma
public class Ejer8 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = consola.nextLine();

        if (esPalindroma(frase)) {
            System.out.println("La frase es palíndroma.");
        } else {
            System.out.println("La frase NO es palíndroma.");
        }

    }

    public static boolean esPalindroma(String texto) {
    texto = texto.toLowerCase();

    texto = texto.replaceAll("[^a-z]", "");

    String invertida = new StringBuilder(texto).reverse().toString();
    return texto.equals(invertida);
}

}