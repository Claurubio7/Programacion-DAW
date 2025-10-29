import java.util.Scanner;

public class Eje7{

    // Contar numeros postivos y negativos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int positivos = 0; 
        int negativos = 0; 

        System.out.println("Introduce números (0 para terminar):");
        
        do {
            System.out.print("Número: ");
            numero = sc.nextInt();

            if (numero > 0) {
                positivos++; 
            } else if (numero < 0) {
                negativos++; 
            }
            
        } while (numero != 0);
        System.out.println("\nHas introducido:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}