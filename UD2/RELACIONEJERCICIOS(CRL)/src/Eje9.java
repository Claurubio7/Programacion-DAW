import java.util.Scanner;

public class Eje9 {
    /*  mostrar n numeros de Fibonnacci
        Recursividad
    */
    
    public static int recursividadFibon(int n) {
        if(n <= 0) {
            return 0; 
        } if (n ==1) {
            return 1;
        }
         else {            
            return recursividadFibon(n - 1) + recursividadFibon(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Introduce cuantos numeros de Finonacci quieres:");
        int n = consola.nextInt();

        for(int i = 0; i < n; i++ ) {
            System.out.print(recursividadFibon(i) + " ");
        }
    }
}
