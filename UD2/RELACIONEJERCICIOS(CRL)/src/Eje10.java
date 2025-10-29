import java.util.Scanner;

public class Eje10 {
    // Contar digitos pares e impares 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        System.out.println("El numero " + num + " contiene " + contadorPares(num) + " digitos pares y " + contadorImpares(num) + " digitos impares.");   
    }

    public static int contadorPares(int num) {
        int contador= 0;
        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 == 0) {
                contador++;
            }
            num /= 10;
        }
        return contador;
    }

    public static int contadorImpares(int num) {
        int contador = 0;
        while (num > 0) {
            int digito = num % 10;
            if (digito % 2 != 0) {
                contador++;
            }
            num /= 10;
        }
        return contador;
    } 
}