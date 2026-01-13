import java.util.ArrayList;

public class EjemploTemplate {

    // Método para imprimir un array de enteros
    public static void imprimirArrayInt(Integer[] array) {
       //for (int i : array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Método para imprimir un array de doubles
    public static void imprimirArrayDouble(Double[] array) {
        for (double d : array) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    // Método para imprimir un array de Strings
    public static void imprimirArrayString(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    //Método para imprimir un ArrayList de enteros
    public static void imprimirArrayList(ArrayList<Integer> array){
        //for(int a: array){
        for(int i=0;i<array.size();i++){
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }
    // ⭐ MÉTODO GENÉRICO (TEMPLATE)
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
    public static <T> void imprimirArray(ArrayList<T> array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static <T> Integer buscarArray(T[] array,T valor) {
        int pos=0;
        for (T s : array) {   
            if(s.equals(valor))
                return pos;
            pos++;
        }
        return -1;
    }
    public static <T> void intercambiaPos(T[] vector, int pos1, int pos2){
        T aux=vector[pos1];
        vector[pos1]=vector[pos2];
        vector[pos2]=aux;
    }
    public <T extends Comparable> T maximoValor(T valor1, T valor2){
        if(valor1.compareTo(valor2)>0) return valor1;
        else return valor2;
    }
    public static void main(String[] args) {
        // EjemploTemplate util = new EjemploTemplate();
        // Integer[] numeros = {1, 2, 3, 4, 5};
        // Double[] decimales = {1.5, 2.3, 4.8};
        // String[] palabras = {"Hola", "Alumnos", "Programación", "DAW"};
        // ArrayList<Integer> array=new ArrayList<>();
        // array.add(1);array.add(23);array.add(33);
        
        // System.out.println("Arrays con métodos específicos:");
        // util.imprimirArrayInt(numeros);
        // util.imprimirArrayDouble(decimales);
        // util.imprimirArrayString(palabras);
        // util.imprimirArrayList(array);


        // System.out.println("USANDO LA FUNCIÓN GENÉRICA");
        // imprimirArray(array);
        // imprimirArray(numeros);


        Double[] numeros={1.0,3.2,5.7,7.2,9.9,2.0,5.1,6.3};
        imprimirArray(numeros);
        intercambiaPos(numeros,1,6 );
        imprimirArray(numeros);

        System.out.println("Está en la posición: "+buscarArray(numeros, 23));
    }



    
}
