package Actividad2;

public class Main {

    public static void main(String[] args) {

        Racional r1 = new Racional(2, 3);
        Racional r2 = new Racional(4, 5);

        System.out.println("Racional r1: " + r1);
        System.out.println("Racional r2: " + r2);

        System.out.println("\nSuma: " + r1.suma(r2));
        System.out.println("Resta: " + r1.resta(r2));
        System.out.println("Producto: " + r1.producto(r2));
        System.out.println("División: " + r1.division(r2));

        System.out.println("\n¿Son iguales? " + r1.esIgual(r2));

        System.out.print("Imprimir r1: ");
        r1.imprimirRacional();
    }
}
