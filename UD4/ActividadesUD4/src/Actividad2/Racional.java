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

    // *** Operaciones ***
    public Racional suma(Racional c) {
        int num = this.numerador * c.denominador + c.numerador * this.denominador;
        int den = this.denominador * c.denominador;
        return new Racional(num, den);
    }

    public Racional resta(Racional c) {
        int num = this.numerador * c.denominador - c.numerador * this.denominador;
        int den = this.denominador * c.denominador;
        return new Racional(num, den);
    }

    public Racional producto(Racional c) {
        int num = this.numerador * c.numerador;
        int den = this.denominador * c.denominador;
        return new Racional(num, den);
    }

    public Racional division(Racional c) {
        if (c.numerador == 0) {
            throw new ArithmeticException("No se puede dividir entre un racional con numerador 0.");
        }
        int num = this.numerador * c.denominador;
        int den = this.denominador * c.numerador;
        return new Racional(num, den);
    }

    public boolean esIgual(Racional c) {
        return this.numerador * c.denominador == this.denominador * c.numerador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
