package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa la mano de un jugador/crupier y calcula la puntuación
 */
public class Mano {
    private List<Carta> cartas;

    public Mano() {
        cartas = new ArrayList<>();
    }

    public void limpiar() {
        cartas.clear();
    }

    public void agregarCarta(Carta c) {
        cartas.add(c);
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    /**
     * Calcula la mejor puntuación <= 21 si es posible.
     * Trata Ases como 11 por defecto y los baja a 1 si hace falta.
     */
    public int calcularPuntuacion() {
        int total = 0;
        int ases = 0;
        for (Carta c : cartas) {
            total += c.getValorNumericoBase();
            if (c.getValor() == Valor.AS) ases++;
        }
        // Ajustar ases de 11 a 1 si nos pasamos
        while (total > 21 && ases > 0) {
            total -= 10; // pasar un As de 11 a 1 equivale a restar 10
            ases--;
        }
        return total;
    }

    public boolean isBlackjack() {
        return cartas.size() == 2 && calcularPuntuacion() == 21;
    }

    public boolean isBusted() {
        return calcularPuntuacion() > 21;
    }

    @Override
    public String toString() {
        return cartas.toString() + " (puntos=" + calcularPuntuacion() + ")";
    }
}
