package Actividad2;

public class Racional {

    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void asignaNumerador(int x) {
        this.numerador = x;
    }

    public void asignaDenominador(int y) {
        if (y == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.denominador = y;
    }

    public void imprimirRacional() {
        System.out.println(numerador + "/" + denominador);
    }

    // Suma
    public Racional sumar(Racional r) {
        int num = this.numerador * r.denominador + this.denominador * r.numerador;
        int den = this.denominador * r.denominador;
        return new Racional(num, den);
    }

    // Resta
    public Racional restar(Racional r) {
        int num = this.numerador * r.denominador - this.denominador * r.numerador;
        int den = this.denominador * r.denominador;
        return new Racional(num, den);
    }

    // Producto
    public Racional multiplicar(Racional r) {
        int num = this.numerador * r.numerador;
        int den = this.denominador * r.denominador;
        return new Racional(num, den);
    }

    // División
    public Racional dividir(Racional r) {
        int num = this.numerador * r.denominador;
        int den = this.denominador * r.numerador;
        return new Racional(num, den);
    }

    public boolean esIgual(Racional r) {
        return this.numerador == r.numerador && this.denominador == r.denominador;
    }
}
