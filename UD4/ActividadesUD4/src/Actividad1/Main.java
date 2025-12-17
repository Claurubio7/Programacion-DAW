package Actividad1;

public class Main {
    public static void main(String[] args) {

        Pais p = new Pais("Honduras", 11000000, 1200000);

        System.out.println(p);
        System.out.println("El PIB per cápita de " + p.getNombre() + " es " + p.calcularPibPerCapita());
    }
}
