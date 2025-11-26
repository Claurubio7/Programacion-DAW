import java.util.ArrayList;

public class Ej2 {
   
    public static void main(String[] args) {

        int[] datos = {10, 1, 5, 8, 9, 2};
        int num = 6;

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

        ArrayList<Integer> salida = new ArrayList<>();

        if (num >= array.length) {
            System.out.println("ERROR: num debe ser menor que el tamaño del array.");
            return salida;  // Lista vacía
        }

    
        for (int i = 0; i <= array.length - num; i++) {

            int suma = 0;
            for (int j = 0; j < num; j++) {
                suma += array[i + j];
            }
            salida.add(suma);
        }

        return salida;
    } 
}
