import java.util.Scanner;

public class Eje2 {
    //calcular el salario semanal, (>40-> 12 / <40->16)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;
        int sueldo;
        
        System.out.print("Por favor introduzca el número de horas trabajadas durante la semana: ");
        horas = sc.nextInt(); 

        if (horas <=40) {
            sueldo= horas*12;
        } else {
            int horasExtras = horas - 40;
            sueldo = (horasExtras*16) + (40*12);
        }
        System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros");
       
    }

   
}