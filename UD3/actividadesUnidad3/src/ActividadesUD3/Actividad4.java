public class Actividad4 {
// Crea una función que borra un valor en el array.

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

    public static int[] borrarValor(int[] array, int valor) {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                contador++;
            }
        }

        int[] nuevoArray = new int[array.length - contador];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != valor) {
                nuevoArray[index] = array[i];
                index++;
            }
        }
        return nuevoArray;
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
