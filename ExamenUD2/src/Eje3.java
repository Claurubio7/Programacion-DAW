
import java.util.Scanner;

public class Eje3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int contador = 0;
        int sumaImpares = 0;
        int mayorPar = Integer.MIN_VALUE; // valor muy bajo al inicio
        int menor = Integer.MAX_VALUE;    // valor muy alto al inicio

        System.out.println("Introduce números enteros (número negativo para terminar):");

        do {
            System.out.print("Número: ");
            numero = sc.nextInt();

            if (numero >= 0) {
                contador++;

                //¿par o impar?
                if (numero % 2 == 0) {
                    // Se actualiza el mayor par
                    if (numero > mayorPar) {
                        mayorPar = numero;
                    }
                } else {
                    sumaImpares += numero;
                }

                // para comprobar el menor de todos
                if (numero < menor) {
                    menor = numero;
                }
            }

        } while (numero >= 0);

        System.out.println("\n--- Resultados ---");

        if (contador == 0) {
            System.out.println("No se introdujo ningún número válido.");
        } else {
            System.out.println("Cantidad de números introducidos: " + contador);
            System.out.println("Suma de los impares: " + sumaImpares);

            // si no se introducen pares, el mayorPar seguirá siendo el valor inicial
            if (mayorPar == Integer.MIN_VALUE) {
                System.out.println("No se introdujeron números pares.");
            } else {
                System.out.println("Mayor de los pares: " + mayorPar);
            }

            System.out.println("Menor de todos los números: " + menor);
        }
    }
}
