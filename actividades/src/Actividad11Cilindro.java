import java.util.Scanner;

public class Actividad11Cilindro {
    final static double PI=3.14159;
    public static void main(String[] args) {
        //Leer de teclado la altura y el radio
        Scanner sc=new Scanner(System.in);
        double altura;
        double radio;
        //Leer parámetros
        System.out.print("Escribe la altura: ");
        altura= Double.parseDouble(sc.nextLine());
        System.out.print("Escribe el radio: ");
        radio=Double.parseDouble(sc.nextLine());
        imprimeCilindro(altura, radio);

    }
    public static void imprimeCilindro(double altura,double radio){
        System.out.println("El ÁREA del cilindro es: "+(altura*radio*PI));
        System.out.println("El VOLUMEN del cilindro es: "+(altura*(radio*radio)*PI));
    }
}
