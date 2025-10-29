import java.time.LocalDateTime;

public class Eje1 {
    // imprima buenos días, buenas tardes y buenas noches según la hora actual.
    public static void main(String[] args) {

        //Obtener la fecha y hora actual 
        LocalDateTime hoy = LocalDateTime.now();

        //Guardar la hora actual en una variable
        int hora = hoy.getHour(); //entre 0 y 23
        System.out.println("Hora actual: " + hora);

        
        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }
    }
}

