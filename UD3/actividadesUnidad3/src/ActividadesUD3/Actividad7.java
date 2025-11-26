import java.util.ArrayList;
import java.util.Scanner;

//Usar Arraylist, mostrar los nombres ordenados
public class Actividad7 {

    public static void main(String[] args) {
        ArrayList<String> nombreLista = insertarNombres();
        System.out.println(nombreLista);
        nombreLista.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(nombreLista);
        
    }

    public static ArrayList<String> insertarNombres() {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> nombreLista = new ArrayList<>();
        boolean salir = false;
        do { 
            System.out.print("Introduce un nombre(fin): ");
            String nombre = sc.nextLine();
            if(nombre.toLowerCase().equals("fin")) {
                salir = true;
            } else if(!nombreLista.contains(nombre)){
                nombreLista.add(nombre);
            } 
        } while (!salir);
        return nombreLista; 
    }
    
}