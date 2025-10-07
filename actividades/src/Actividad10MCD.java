import java.util.Scanner;

public class Actividad10MCD {
    public static void main(String[] args) {
        //Programa que calcula el Máximo Común Divisor (MCD) de dos números
        
        Scanner teclado = new Scanner(System.in);
        int a, b, resto;

        //Leer los números
        System.out.print("Introduce el primer número: ");
        a = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        b = teclado.nextInt();


        //sin usar funciones de Math
        //Convertir los valores a positivos (valor absoluto) 
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }

        // //usando funciones de la clase Math
        // //Valor absoluto con Math.abs()
        // a = Math.abs(a);
        // b = Math.abs(b);

        

        //Mientras b sea distinto de 0
        while (b != 0) {
            resto = a % b; //resto de la división
            a = b;         //ahora a toma el valor de b
            b = resto;     //y b toma el valor del resto
        }

        //Cuando b llega a 0, el valor de a es el MCD
        System.out.println("El MCD es: " + a);
    }
}
