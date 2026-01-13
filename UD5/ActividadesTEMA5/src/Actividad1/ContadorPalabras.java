package Actividad1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContadorPalabras {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.print("Introduce la palabra a buscar: ");
        String palabraBuscada = scanner.nextLine();

        try {
            // Abrimos el fichero
            BufferedReader br = new BufferedReader(new FileReader("texto.txt"));
            String linea;

            // Leemos línea a línea
            while ((linea = br.readLine()) != null) {

                // Separar la línea en palabras
                String[] palabras = linea.split("\\s+");

                // Recorrer las palabras
                for (String palabra : palabras) {
                    if (palabra.equalsIgnoreCase(palabraBuscada)) {
                        contador++;
                    }
                }
            }

            br.close();

            System.out.println("La palabra \"" + palabraBuscada + "\" aparece " + contador + " veces.");

        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
        }

        scanner.close();
    }
}


