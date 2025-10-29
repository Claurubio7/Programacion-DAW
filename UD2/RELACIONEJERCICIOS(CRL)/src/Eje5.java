import java.util.Scanner;

public class Eje5 {
    //horario de clases
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        String lunes = "IPE | SI | BD | BD | PROG";
        String martes = "LMSGI | SI | SI | PROG | PROG | ENT";
        String miercoles = "BD | BD | SI | SI | PROG | PROG";
        String jueves = "PROG | ENT | ENT | IPE | BD | SOST";
        String viernes = "BD | DIG | LMSGI | LMSGI | IPE | PROG";

        do {
            System.out.println("\n===== MENÚ HORARIO DE CLASES =====");
            System.out.println("1. Lunes");
            System.out.println("2. Martes");
            System.out.println("3. Miércoles");
            System.out.println("4. Jueves");
            System.out.println("5. Viernes");
            System.out.println("6. Ver horario completo");
            System.out.println("7. Salir");
            System.out.print("\nElige una opción (1-7): ");
            
            opcion = sc.nextInt();
            System.out.println(); 

            switch (opcion) {
                case 1: System.out.printf("Lunes: %s%n", lunes); break;
                case 2: System.out.printf("Martes: %s%n", martes); break;
                case 3: System.out.printf("Miércoles: %s%n", miercoles); break;
                case 4: System.out.printf("Jueves: %s%n", jueves); break;
                case 5: System.out.printf("Viernes: %s%n", viernes); break;
                case 6:
                    System.out.println("===== HORARIO COMPLETO =====");
                    System.out.printf("%-10s | %s%n", "Lunes", lunes);
                    System.out.printf("%-10s | %s%n", "Martes", martes);
                    System.out.printf("%-10s | %s%n", "Miércoles", miercoles);
                    System.out.printf("%-10s | %s%n", "Jueves", jueves);
                    System.out.printf("%-10s | %s%n", "Viernes", viernes);
                    break;
                case 7: System.out.println("Saliendo del programa... "); break;
                default:
                    System.out.println("Opción no válida. Intenta otra vez.");
            }

        } while (opcion != 7);

    }
}
