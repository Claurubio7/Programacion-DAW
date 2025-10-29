import java.util.Scanner;

public class Eje8 {
    // mostrar n numeros de Fibonnacci
    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Introduce cuantos numeros de Finonacci quieres:");
        int n = consola.nextInt();
        int a  = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}