import java.util.Scanner;

public class Eje6 {

    //generar la nomina de un empleado 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cargo, diasViaje, estadoCivil;
        double sueldoBase = 0, dietas, sueldoBruto, irpf, retencion, sueldoNeto;

        System.out.println(""" 
            Introduce el cargo del empleado:
            1 - Programador junior
            2 - Programador senior
            3 - Jefe de proyecto
                """);
        System.out.print("Opción: ");
        cargo = sc.nextInt();

        System.out.println("\n¿Cuántos días ha estado de viaje visitando clientes? ");
        diasViaje = sc.nextInt();

        System.out.println("\nIntroduce su estado civil:");
        System.out.println("1 - Soltero");
        System.out.println("2 - Casado");
        System.out.print("\nOpción: ");
        estadoCivil = sc.nextInt();

        switch (cargo) {
            case 1: sueldoBase = 950; break;
            case 2: sueldoBase = 1200; break;
            case 3: sueldoBase = 1600; break;
            default: System.out.println("Cargo no válido.");
        }

        dietas = diasViaje * 30;
        sueldoBruto = sueldoBase + dietas;

        if (estadoCivil == 1) { // soltero
            irpf = 0.25;
        } else if (estadoCivil == 2) { // casado
            irpf = 0.20;
        } else {
            irpf = 0; // por si mete un número incorrecto
            System.out.println("Estado civil no válido.");
        }

        retencion = sueldoBruto * irpf;

        // Sueldo neto final
        sueldoNeto = sueldoBruto - retencion;

        System.out.println("----------------------------------------------");
        System.out.printf("| %-20s %10.2f EUR |%n", "Sueldo base", sueldoBase);
        System.out.printf("| %-20s %10.2f EUR |%n", "Dietas (" + diasViaje + " viajes)", dietas);
        System.out.println("|---------------------------------------------|");
        System.out.printf("| %-20s %10.2f EUR |%n", "Sueldo bruto", sueldoBruto);
        System.out.printf("| %-20s %10.2f EUR |%n", "Retención IRPF (" + (int)(irpf*100) + "%)", retencion);
        System.out.println("|---------------------------------------------|");
        System.out.printf("| %-20s %10.2f EUR |%n", "Sueldo neto", sueldoNeto);
        System.out.println("----------------------------------------------");

    }
}
