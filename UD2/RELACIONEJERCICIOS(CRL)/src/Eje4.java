import java.util.Scanner;

public class Eje4 {
    //calcular nota, media, si/no recuperación
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double control1, control2, media;
        String recuperacion= " ";

        System.out.print("Introduce la nota de el primer control: ");
        control1 = sc.nextDouble();
        System.out.print("Introduce la nota de el segundo control: ");
        control2 = sc.nextDouble();

        media =  (control1+control2) /2;

       if (media >= 5) {
            System.out.println("Tu nota media es: " + media);
            System.out.println("Estás aprobado.");
        } else {
            System.out.println("¿Cuál ha sido el resultado de la recuperación (apto/no apto)? ");
            recuperacion = sc.next();

            if (recuperacion.equalsIgnoreCase("apto")) {
                System.out.println("Tu nota final es: 5");
            } else {
                System.out.println("Tu nota final es: " + media);
            }
        }
    }
}