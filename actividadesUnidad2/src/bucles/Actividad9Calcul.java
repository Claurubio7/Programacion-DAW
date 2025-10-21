import java.util.Scanner;

public class Actividad9Calcul {
    public static void main(String[] args) {
        int opcion;
        int numero1,numero2;
        boolean salida=false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("**** CALCULADORA DAW ****");
            System.out.println("1- Hacer la suma");
            System.out.println("2- Hacer la resta");
            System.out.println("3- Hacer la multiplicación");
            System.out.println("Introduce una opción o -1 para salir: ");
            opcion=sc.nextInt();
            switch(opcion){
                case 1: System.out.println("Introduzca los números: ");
                        numero1=sc.nextInt();
                        numero2=sc.nextInt();
                        System.out.println("La suma es: "+(numero1/numero2));
                        break;
                default: //Caso -1
                        salida=true;
                        break;
            }
        } while (opcion!=-1);
    }
}
