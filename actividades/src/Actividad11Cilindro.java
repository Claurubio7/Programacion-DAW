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
        double area = 2 * PI * radio * (radio + altura);
        double volumen = PI * radio * radio * altura;

        System.out.println("El ÁREA del cilindro es: " + area);
        System.out.println("El VOLUMEN del cilindro es: " + volumen);
    }
}
