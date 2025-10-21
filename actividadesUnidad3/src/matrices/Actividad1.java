public class Actividad1 {
    /* PÁG 10
    * Actividad: Realiza una función que busca un número en un array e indica dónde está
    */
    
    public static void buscarNumero(int[] numeros, int buscado) {
        boolean encontrado = false; // para saber si lo hemos encontrado

        for (int i = 0; i < numeros.length; i++) { // recorre todo el array
            if (numeros[i] == buscado) { // si el número coincide
                System.out.println("El número " + buscado + " está en la posición " + i);
                encontrado = true;
            }
        }

        if (!encontrado) { // si no lo encuentra
            System.out.println("El número " + buscado + " no está en el array.");
        }
    }

    public static void main(String[] args) {
        int[] lista = {3, 7, 1, 4, -4, 2, 5, 0, 5};
        buscarNumero(lista, 4); // puedes probar con otros valores
    }
}

