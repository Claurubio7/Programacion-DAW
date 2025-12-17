package Clases;

public class Carta {

    private Palo palo;
    private Valor valor;

    public Carta(Palo palo, Valor valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public Valor getValor() {
        return valor;
    }

    /**
     * Valor base: para As devuelve 11 (ajuste se hará en Mano).
     */
    public int getValorNumericoBase() {
        switch (valor) {
            case DOS: return 2;
            case TRES: return 3;
            case CUATRO: return 4;
            case CINCO: return 5;
            case SEIS: return 6;
            case SIETE: return 7;
            case OCHO: return 8;
            case NUEVE: return 9;
            case DIEZ:
            case J:
            case Q:
            case K:
                return 10;
            case AS:
                return 11;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
