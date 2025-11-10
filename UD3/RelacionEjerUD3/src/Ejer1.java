import java.util.Arrays;
import java.util.Scanner;

// Función push y pop 

public class Ejer1 {

    // Función push --> inserta el número al final del vector 
    public static int[] push(int[] pila, int valor) {
        
        int[] nuevaPila = new int[pila.length + 1];
        for (int i = 0; i < pila.length; i++) {
            nuevaPila[i] = pila[i];
        }
        nuevaPila[nuevaPila.length - 1] = valor;

        return nuevaPila;
    }

    // Función pop --> elimina el último número del array 
    public static int[] pop(int[] pila) {
        
        if (pila.length == 0) {
            System.out.println("La pila está vacía.");
            return pila;
        }

        int[] nuevaPila = new int[pila.length - 1];
        for (int i = 0; i < nuevaPila.length; i++) {
            nuevaPila[i] = pila[i];
        }
        return nuevaPila;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pila = new int[0]; 
        int opcion, valor;

        do {
            System.out.println("\n--- SIMULADOR DE PILA ---");
            System.out.println("1. Push (Insertar)");
            System.out.println("2. Pop (Eliminarr)");
            System.out.println("3. Mostrar pila");
            System.out.println("4. Salir");
            System.out.print("\nElige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número: ");
                    valor = sc.nextInt();
                    pila = push(pila, valor);
                    break;

                case 2:
                    pila = pop(pila);
                    break;

                case 3:
                    System.out.println("\nContenido actual de la pila: " + Arrays.toString(pila));
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }

        } while (opcion != 4);

    }
}

