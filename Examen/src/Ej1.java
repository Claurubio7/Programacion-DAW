import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ej1 {

    //Integer.valueOf() convierte texto o números en un objeto Integer.

    static ArrayList<Integer> temasOpositor = new ArrayList<Integer>() {{
        add(4); add(11); add(23); add(34); add(35); add(36);
        add(39); add(50); add(60); add(65);
    }};
    //List.of(...)/Array.asList(...) no se pueden usar para modificar el array
    // AUTOBOXING --> java convieret int -> Integer automaticamente. Es cuando Java convierte automáticamente un int en Integer sin que tú hagas nada.

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Declara y crea una lista vacía llamada vectorAleatorio. 
        //Se usará para guardar los 5 temas generados aleatoriamente.
        ArrayList<Integer> vectorAleatorio = new ArrayList<>();
        int opcion;

        //se ejecuta al menos una vez y se repite hasta que el usuario elija la opción 3.
        do {
            System.out.println("\n*** MENÚ ***");
            System.out.println("1. Generar vector aleatorio de 5 temas");
            System.out.println("2. Validar coincidencias de Temas");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            //Dependiendo del caso, ejecuta distintos bloques.
            switch (opcion) {
                case 1:
                    //sobreescribe el contenido de vectorAleatorio con un nuevo vector generado aleatoriamente.
                    vectorAleatorio = generarVector();//devuelve un arraylist con 5 temas aleatorios
                    System.out.print("Vector generado: ");
                    imprimirVector(vectorAleatorio);
                    break;

                case 2:
                    if (vectorAleatorio.isEmpty()) { //comprueba si la lista esta vacia 
                        System.out.println("Primero debe generar el vector (opción 1).");
                    } else { //si no esta vacia llama a validarVector
                        validarVector(vectorAleatorio); //busca y muestra las coincidencias
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
    //genera un arraylist<Integer> con 5 temas aleatorios entre 1 y 65 sin repetirse
    public static ArrayList<Integer> generarVector() {
        //lista vacia para guardar los temas aleatorios
        ArrayList<Integer> vector = new ArrayList<>();
        //entero aleatorio entre 1 y 65
        int num;
        boolean repetido;

            // se repite hasta tener 5 números
            for (int i = 0; i < 5; i++) {
                //do while para generar un número aleatorio y comprobar si ya está en la lista
                do {
                    num = (int)(Math.random() * 65) + 1;  
                    //se asume que no está repetido hasta comprobar
                    repetido = false;
                    // Comprobar
                    //Recorre la lista actual vector y compara cada elemento con num
                    for (int j = 0; j < vector.size(); j++) {
                        if (vector.get(j) == num) {
                            repetido = true;
                            //Si se encuentra igualdad, repetido queda true 
                            // y el do-while repetirá la generación de num.
                        }
                    }

                } while (repetido);
                vector.add(num);
            }
            return vector;
    }


    //2.Validar las coincidencias
    public static void validarVector(ArrayList<Integer> vector) {
        //lista vacía donde se guardarán los temas que están 
        // a la vez en vector y en temasOpositor.
        ArrayList<Integer> coincidencias = new ArrayList<>();

        //Recorre el vector generado aleatoriamente para validar las coincidencias
        for (int i = 0; i < vector.size(); i++) {
            int temaVector = vector.get(i);//obtiene el tema actual, en la posición i
            //Buscar dentro de los temas del opositor
            for (int j = 0; j < temasOpositor.size(); j++) {
                if (temaVector == temasOpositor.get(j)) {
                    coincidencias.add(temaVector);
                    break;    
                    //== si se puede, porque una de las partes es un int primitivo, sino usar .equals()
                }
            }
        }

        // Ordenar con sort() , ordena la lista de coincidencias en orden ascendente
        coincidencias.sort((a, b) -> a.compareTo(b));
        //Equivalente más simple: Collections.sort(coincidencias); o coincidencias.sort(Integer::compareTo).

        //comprobar si la lista de coincidencias esta vacia
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
            ///immprime, después de el elemento sino es el ultimo
            if (i < v.size() - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }
}
