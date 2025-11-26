public class Actividad1 {
    /* PÁG 10
    * Actividad: Realiza una función que busca un número en un array e indica dónde está
    */
    
    public static void buscarNumero(int[] array, int numeroBuscado) {

        boolean encontrado = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroBuscado) {
                System.out.println("El número aparece en la posición: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println(-1);  
        }
    }


    public static void main(String[] args) {

        int[] numeros = {3, 7, 10, 5, 5};
        buscarNumero(numeros, 5);

    }

}

