import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ej1 {

    static ArrayList<Integer> temasOpositor = new ArrayList<Integer>() {{
        add(4); add(11); add(23); add(34); add(35); add(36);
        add(39); add(50); add(60); add(65);
    }};
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> vectorAleatorio = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n*** MENÚ ***");
            System.out.println("1. Generar vector aleatorio de 5 temas");
            System.out.println("2. Validar coincidencias de Temas");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    vectorAleatorio = generarVector();
                    System.out.print("Vector generado: ");
                    imprimirVector(vectorAleatorio);
                    break;

                case 2:
                    if (vectorAleatorio.isEmpty()) {
                        System.out.println("Primero debe generar el vector (opción 1).");
                    } else {
                        validarVector(vectorAleatorio);
                    }
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 3);
    }

    //1. Generar vector aleatorio 
    public static ArrayList<Integer> generarVector() {
        ArrayList<Integer> vector = new ArrayList<>();
        int num;
        boolean repetido;

            for (int i = 0; i < 5; i++) {
                do {
                    num = (int)(Math.random() * 65) + 1;  
                    repetido = false;
                    // Comprobar
                    for (int j = 0; j < vector.size(); j++) {
                        if (vector.get(j) == num) {
                            repetido = true;
                        }
                    }

                } while (repetido);
                vector.add(num);
            }
            return vector;
    }


    //2.Validar las coincidencias
    public static void validarVector(ArrayList<Integer> vector) {
        ArrayList<Integer> coincidencias = new ArrayList<>();

        for (int i = 0; i < vector.size(); i++) {
            int temaVector = vector.get(i);
            //Buscar dentro de los temas del opositor
            for (int j = 0; j < temasOpositor.size(); j++) {
                if (temaVector == temasOpositor.get(j)) {
                    coincidencias.add(temaVector);
                    break;    
                }
            }
        }

        // Ordenar con sort() 
        coincidencias.sort((a, b) -> a.compareTo(b));

        if (coincidencias.isEmpty()) {
            System.out.println("No hay coincidencias.");
        } else {
            System.out.print("Temas coincidentes: ");
            imprimirVector(coincidencias);
        }
    }

    public static void imprimirVector(ArrayList<Integer> v) {
        System.out.print("{ ");
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i));
            if (i < v.size() - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }
}
