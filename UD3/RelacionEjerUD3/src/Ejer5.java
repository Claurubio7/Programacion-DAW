import java.util.ArrayList;
import java.util.Scanner;

//Igual que el ejercicio 4 pero con funciones de ArrayList<Integer>

public class Ejer5 {

     // Cuenta los aciertos entre los dos ArrayList
    public static int contarAciertos(ArrayList<Integer> ganadores, ArrayList<Integer> usuario) {
        int aciertos = 0;
        for (int numUsuario : usuario) {
            if (ganadores.contains(numUsuario)) {
                aciertos++;
            }
        }
        return aciertos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numerosGanadores = new ArrayList<>();
        numerosGanadores.add(5);
        numerosGanadores.add(12);
        numerosGanadores.add(23);
        numerosGanadores.add(34);
        numerosGanadores.add(45);
        numerosGanadores.add(49);
        ArrayList<Integer> numerosUsuario = new ArrayList<>();

        System.out.println("*** COMPROBADOR BONOLOTO (ArrayList) ***");
        System.out.println("\nIntroduce tus 6 números (entre 1 y 49):");

        for (int i = 1; i <= 6; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();
            numerosUsuario.add(num);
        }

        // Para ver los aciertos obtenidos
        int aciertos = contarAciertos(numerosGanadores, numerosUsuario);

        System.out.println("\nNúmeros ganadores: " + numerosGanadores);
        System.out.println("Tus números: " + numerosUsuario);
        System.out.println("\nHas tenido " + aciertos + " aciertos.");

    }

   
}

