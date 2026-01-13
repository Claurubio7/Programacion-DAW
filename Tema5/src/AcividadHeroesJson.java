import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class AcividadHeroesJson {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try{
            FileReader reader = new FileReader("./Tema5/heroes.json");
            // 1. Parsear el archivo a un objeto JSONArray
            Object obj = parser.parse(reader);
            JSONArray listaHeroes = (JSONArray) obj;

            System.out.println("=== Héroes de Marvel Comics ===");

            // 2. Iterar sobre el array de héroes
            for (Object item : listaHeroes) {
                JSONObject heroe = (JSONObject) item;

                // 3. Obtener el valor de "publisher"
                String editorial = (String) heroe.get("publisher");

                // 4. Filtrar por Marvel Comics
                if (editorial.equals("Marvel Comics")) {
                    String nombre = (String) heroe.get("superhero");
                    String alterEgo = (String) heroe.get("alter_ego");
                    
                    System.out.println("Superhéroe: " + nombre + " | Identidad: " + alterEgo);
                }
            }

        } catch (IOException e) {
            System.err.println("Error de lectura: " + e.getMessage());
        } catch (ParseException e) {
            System.err.println("Error de parseo JSON: " + e.getMessage());
        }
    }
}