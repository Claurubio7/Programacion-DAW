package Actividad2;
public class App {
    public static void main(String[] args) {

        Racional r1 = new Racional(2, 3);
        Racional r2 = new Racional(1, 5);

        r1.imprimirRacional();
        r2.imprimirRacional();

        Racional suma = r1.sumar(r2);
        System.out.print("Suma: ");
        suma.imprimirRacional();

        Racional resta = r1.restar(r2);
        System.out.print("Resta: ");
        resta.imprimirRacional();

        Racional prod = r1.multiplicar(r2);
        System.out.print("Producto: ");
        prod.imprimirRacional();

        Racional div = r1.dividir(r2);
        System.out.print("División: ");
        div.imprimirRacional();

        System.out.println("¿Son iguales? " + r1.esIgual(r2));
    }
}
