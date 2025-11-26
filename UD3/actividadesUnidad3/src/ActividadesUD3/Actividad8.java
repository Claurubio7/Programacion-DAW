import java.util.Arrays;
import java.util.Scanner;

//Juego del ahorcado
public class Actividad8 {
    // Trabajo en grupo con Jonathan 
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String[] palabras = {"Luna", "Menguante", "Cuarto", "Pepe"};
        String palabraAzar = cogerPalabraAzar(palabras).toLowerCase();
        char[] palabraAzarDividida = palabraAzar.toCharArray();
        for (int i = 0; i < palabraAzarDividida.length; i++) {
            System.out.print(palabraAzarDividida[i] + " ");
        }
        char[] palabraOculta = new char[palabraAzarDividida.length];
        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '*';
        }
        boolean salir = false;
        int contadorFallos = 0;
        
        do { 
            System.out.print("\nInserta una letra: ");
            char letra = consola.next().toLowerCase().charAt(0);

            boolean acierto = false;

            for (int i = 0; i < palabraOculta.length; i++) {
                if (palabraAzarDividida[i] == letra) {
                    palabraOculta[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                contadorFallos++;
                System.out.println("Fallos: " + contadorFallos + "/7");
            }

            for (int i = 0; i < palabraOculta.length; i++) {
                System.out.print(palabraOculta[i] + " ");
            }

            if (Arrays.equals(palabraOculta, palabraAzarDividida)) {
                System.out.println("\n¡Has ganado! La palabra era " + palabraAzar);
                salir = true;
            }

            if (contadorFallos >= 7) {
                System.out.println("\nHas perdido. La palabra era " + palabraAzar);
                salir = true;
            }
            } while (!salir);
    }


    public static String cogerPalabraAzar(String[] palabras) {
        String palabra = palabras[(int) (Math.random() * palabras.length)];
        return palabra;
    }
    

}