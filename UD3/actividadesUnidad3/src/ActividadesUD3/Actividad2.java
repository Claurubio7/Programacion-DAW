import java.util.Scanner;
//  Realiza un programa que muestra tu horario y qué clases tienes hoy

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] horario = {
            {"IP", "SI", "BD", "BD", "PROG", "PROG"},          
            {"LMSGI", "SI", "SI", "PROG", "PROG", "ED"},       
            {"BD", "BD", "SI", "SI", "PROG", "PROG"},          
            {"PROG", "ED", "ED", "IP", "BD", "SOS"},           
            {"BD", "DIG", "LMSGI", "LMSGI", "IP", "PROG"}      
        };

        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

        System.out.println("***HORARIO DE CLASES***");
        for (int i = 0; i < dias.length; i++) {
            System.out.print(dias[i] + ": ");
            for (int j = 0; j < horario[i].length; j++) {
                System.out.print(horario[i][j]);
                if (j < horario[i].length - 1) System.out.print(", ");
            }
            System.out.println();
        }

        System.out.println("\n¿Qué día quieres consultar?: ");
        String diaUsuario = sc.nextLine().toLowerCase();

        boolean encontrado = false; 

        for (int i = 0; i < dias.length; i++) {
            if (dias[i].toLowerCase().equals(diaUsuario)) {
                System.out.println("\nHorario de día " + dias[i] + ":");
                for (int j = 0; j < horario[i].length; j++) {
                    System.out.print(horario[i][j] + "  ");
                }
                encontrado = true;
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("Día no válido.");
        }
    }
}
