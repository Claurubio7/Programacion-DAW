

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {

    private ArrayList<Carta> cartas = new ArrayList<>();

    public Mazo() {
        generarBaraja();
        barajar();
    }

    private void generarBaraja() {
        for (Palo p : Palo.values()) {
            for (Valor v : Valor.values()) {
                cartas.add(new Carta(p, v));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta sacarCarta() {
        return cartas.remove(0);
    }
}
