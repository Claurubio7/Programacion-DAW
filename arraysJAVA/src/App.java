import java.util.Scanner;

public class App {
    public static void imprimeArray(double[] array){
        System.out.println("no imprime nada");
    }
    public static void main(String[] args) throws Exception {
        String nombre1;
        String Apellidos1;
        int edad1;
        double notaBD1;
        double notaPROG1;
        double notaED1;

        double calificaciones[]={7,8,2,4,8,9};

        double calificaciones2[];

        System.out.println(calificaciones[0]);

        // System.out.println("Introduce el tamaño del array");
        // Scanner teclado = new Scanner(System.in);
        // int numero=teclado.nextInt();
        // calificaciones2=new double[numero];
        calificaciones2=calificaciones;
        System.out.println(calificaciones2[0]);
        calificaciones=null;
        
        imprimeArray(calificaciones2);

        int[][] matriz={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matriz);
    }
}
