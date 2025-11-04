
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Constantes
        final double PRECIO_BASE= 8.0;
        final double PRECIO_ESPECT_MIERCOLES = 5.0;
        final double PRECIO_PAREJA_JUEVES = 11.0;
        final double TARJETA_CINE = 0.10;

        //Variables
        int nEntradas;
        String diaSemana;
        char tieneTarjeta;
        double total;
        double descuento = 0.0;

        //Los datos
        System.out.println("***Ventas de entrada CineCampa***");
        System.out.print("Número de entradas: ");
        nEntradas = Integer.parseInt(sc.nextLine());
        System.out.print("Día de la semana: ");
        diaSemana = sc.nextLine().toLowerCase(); //pasar a minúscula 
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        tieneTarjeta = sc.nextLine().toLowerCase().charAt(0);


        if (diaSemana.equals("miercoles")) {
            // Día del espectador
            total = nEntradas * PRECIO_ESPECT_MIERCOLES;
            System.out.println("-----------------------------------");
            System.out.println("Entradas individuales: " + nEntradas);
            System.out.println("Precio por entrada individual: " + PRECIO_ESPECT_MIERCOLES);
        } else if (diaSemana.equalsIgnoreCase("jueves")) {
            //Día en pareja
            int parejas = nEntradas/2;
            //Si va solo
            int solo= nEntradas%2;
            total = (parejas*PRECIO_PAREJA_JUEVES) + (solo*PRECIO_BASE);
            System.out.println("-----------------------------------");
            System.out.println("Entradas de pareja: "+parejas);
            if (solo > 0) {
                System.out.println("Entradas individuales: " + solo);
            }
            System.out.println("Precio por pareja: "+ PRECIO_PAREJA_JUEVES);
            System.out.println("Precio por entrada individual: " +PRECIO_BASE);
        } else {// el resto de los dias
            total = nEntradas *PRECIO_BASE;
        }

         // Aplicar el descuento de la tarjeta
        if (tieneTarjeta == 's') {
            descuento = total * TARJETA_CINE;
        }
        double totalFinal = total - descuento;

         // Resultado
        System.out.println("\n***Ticket CineCampa***");
        System.out.println("Total: "+ total);
        System.out.println("Descuento: " + descuento);
        System.out.println("A pagar: "+ totalFinal);


    }
    
}
