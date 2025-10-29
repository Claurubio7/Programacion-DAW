import java.util.Scanner;

public class Eje11 {
    // Calculadora

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;


        do {
            menu();
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                double result = hacerOperacion(opcion, sc);
                System.out.println("Resultado: " + result);
            } if(opcion == 5) {
                System.out.println("Cerrando...");
            } else if (opcion != 5) {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
        sc.close();
    }

    public static double suma(double a, double b) {
        double result = a + b;
        return result;
    }
    public static double resta(double a, double b) {
        double result = a - b;
        return result;
    }
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error division entre cero");
        }
        double result = a / b;
        return result;
    }
    public static double multiplicacion(double a, double b) {
        double result = a * b;
        return result;
    } 
    public static void menu() {
        System.out.println("""
                1. Suma
                2. Resta
                3. Division
                4. Multiplicacion
                5. Salir
                """);
    }
    public static double hacerOperacion(int opcion,Scanner sc) {
        double result = 0;
        double num;
        int contador = 0;
        while(true) {
            contador++;
            System.out.print("Introduce numero " + contador + "(-1 para terminar): ");
            num = sc.nextInt();
            if(num == -1) {
                break;
            }
            if (contador == 1) {
            result = num;
        } else {
            switch (opcion) {
                case 1 -> result = suma(result, num);
                case 2 -> result = resta(result, num);
                case 3 -> result = division(result, num);
                case 4 -> result = multiplicacion(result, num);
            }
                
            }
        }
        return result;
    }
}