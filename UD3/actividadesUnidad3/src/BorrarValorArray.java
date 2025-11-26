public class BorrarValorArray {

    // Función que borra un valor y devuelve un nuevo array
    public static int[] borrarValor(int[] array, int valor) {
        // Contar cuántas veces aparece el valor
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                count++;
            }
        }

        // Crear un nuevo array con tamaño reducido
        int[] nuevoArray = new int[array.length - count];
        int index = 0;

        // Copiar elementos que no sean el valor a borrar
        for (int i = 0; i < array.length; i++) {
            if (array[i] != valor) {
                nuevoArray[index] = array[i];
                index++;
            }
        }

        return nuevoArray;
    }

    // Función para imprimir un array
    public static void imprimirArray(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        int[] numeros = {2, 3, 5, 2, 7, 8};

        System.out.print("Array original: ");
        imprimirArray(numeros);

        int[] resultado = borrarValor(numeros, 2);

        System.out.print("Array después de borrar 2: ");
        imprimirArray(resultado);
    }
}
