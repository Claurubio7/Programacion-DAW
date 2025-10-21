import java.util.Scanner;

public class Eje7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int positivos = 0; 
        int negativos = 0; 

        System.out.println("Introduce números (0 para terminar):");

        // Bucle que se repite hasta que el usuario escriba 0
        do {
            System.out.print("Número: ");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++; 
            } else if (numero < 0) {
                negativos++; 
            }

        } while (numero != 0);

        System.out.println("\n--------------------------------");
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("--------------------------------");
        
    }
}

