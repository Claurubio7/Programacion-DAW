
import java.util.Scanner;

public class Eje12 {
    // MCM segun el MCD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero a: ");
        int a = sc.nextInt();
        System.out.print("Introduce el numero b: ");
        int b = sc.nextInt();
        int resultado = minimoComunMultiplo(a, b);
        System.out.print("El mcm de "+ a + " y " + b + " es " + resultado);
    }
    
    public static int maximoComunDivisor(int a, int b) {
        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

    public static int minimoComunMultiplo(int a, int b) {
        return (a * b) / maximoComunDivisor(a, b);
    }
    
}

