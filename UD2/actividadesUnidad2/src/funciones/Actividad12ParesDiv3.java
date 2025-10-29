public class Actividad12ParesDiv3 {

    public static void main(String[] args) {
        imprimeParesDiv3();
    }

    // Función que comprueba si un número es par
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    // Función que comprueba si un número es divisible entre 3
    public static boolean esDivisible3(int n) {
        return n % 3 == 0;
    }

    // Procedimiento que imprime los números pares divisibles por 3 entre 1 y 20
    public static void imprimeParesDiv3() {
        System.out.println("Números pares divisibles por 3 entre 1 y 20:");
        for (int i = 1; i <= 20; i++) {
            if (esPar(i) && esDivisible3(i)) {
                System.out.println(i);
            }
        }
    }
}
