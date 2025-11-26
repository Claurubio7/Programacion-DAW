public class Actividad5 {
//insertar un nuevo entero en la posición que se indique. Si el parametro es mayor, rellenar con 0
    public static void imprimirArray(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }

    public static int[] insertarEnPosicion(int[] array, int valor, int posicion) {
        int nuevoTam;
        if (posicion >= array.length) {
            nuevoTam = posicion + 1; 
        } else {
            nuevoTam = array.length + 1; 
        }

        int[] nuevoArray = new int[nuevoTam];

        for (int i = 0; i < posicion && i < array.length; i++) {
            nuevoArray[i] = array[i];
        }
        nuevoArray[posicion] = valor;

        for (int i = posicion; i < array.length; i++) {
            nuevoArray[i + 1] = array[i];
        }

        return nuevoArray;
    }

    
    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 8};

        System.out.print("Array original: ");
        imprimirArray(numeros);

        // Insertar 10 en posición 2
        numeros = insertarEnPosicion(numeros, 10, 2);
        System.out.print("Después de insertar 10 en posición 2: ");
        imprimirArray(numeros);

        // Insertar 15 en posición 6 (mayor que el tamaño y se ponen 0)
        numeros = insertarEnPosicion(numeros, 15, 6);
        System.out.print("Después de insertar 15 en posición 6: ");
        imprimirArray(numeros);
    }
}
