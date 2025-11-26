import java.util.ArrayList;

public class Ej2 {
   
    public static void main(String[] args) {

        //se declara y crea un array de enteros con los datos indicados
        int[] datos = {10, 1, 5, 8, 9, 2};
        //se usará para determinar cuántos elementos consecutivos se suman dentro del array.
        int num = 3;

        //Se llama al método obtenerVector, enviando dos argumentos:
        ArrayList<Integer> resultado = obtenerVector(datos, num);

        System.out.println("Resultado:");
        System.out.print("{ ");
        for (int i = 0; i < resultado.size(); i++) {
            System.out.print(resultado.get(i));
            if (i < resultado.size() - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }

    public static ArrayList<Integer> obtenerVector(int[] array, int num) {

        //lista vacía donde se guardarán las sumas
        ArrayList<Integer> salida = new ArrayList<>();

        //comprobar que num es menor que el tamaño del array
        if (num >= array.length) {
            System.out.println("ERROR: num debe ser menor que el tamaño del array.");
            return salida;  // Lista vacía
        }

    
        for (int i = 0; i <= array.length - num; i++) {

            //bluce interno que recorre los siguientes num elementos para sumarlos
            int suma = 0;
            for (int j = 0; j < num; j++) {
                suma += array[i + j];
            }
            salida.add(suma);
        }

        return salida;
    } 
}
