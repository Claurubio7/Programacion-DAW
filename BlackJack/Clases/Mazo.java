package Clases;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartas;

    public Mazo() {
        generarBaraja();
        barajar();
    }

    private void generarBaraja() {
        cartas = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (Valor valor : Valor.values()) {
                cartas.add(new Carta(palo, valor));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta sacarCarta() {
        if (cartas.isEmpty()) {
            // si se acaban las cartas, regeneramos y barajamos
            generarBaraja();
            barajar();
        }
        return cartas.remove(0);
    }

    public int cartasRestantes() {
        return cartas.size();
    }

    @Override
    public String toString() {
        return "Mazo{cartas=" + cartas.size() + "}";
    }
}
