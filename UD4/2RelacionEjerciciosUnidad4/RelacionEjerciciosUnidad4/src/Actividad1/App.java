package Actividad1;

public class App {
    public static void main(String[] args) throws Exception {
        //ACTIVIDAD 1
        Pais p = new Pais("España", 10000000, 100000);
        System.out.println(p);
        System.out.println("El PIB per Capita de " + p.getNombre() + " es " + p.PIBPerCapita());
    
    }

}
