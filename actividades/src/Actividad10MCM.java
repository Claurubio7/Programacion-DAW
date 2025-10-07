import java.util.Scanner;

public class Actividad10MCM {
    public static void main(String[] args) {
        //Programa que calcula el Mínimo Común Múltiplo (MCM)
       
        Scanner teclado = new Scanner(System.in);
        int a, b, mayor, mcm;

        //Leer los números
        System.out.print("Introduce el primer número: ");
        a = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        b = teclado.nextInt();


        //sin usar funciones de Math
        //Convertir los valores a positivos manualmente
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }

        //Determinar cuál es el mayor de los dos
        if (a > b) {
            mayor = a;
        } else {
            mayor = b;
        }

        //usando funciones de la clase Math
        //Valor absoluto con Math.abs()
        // a = Math.abs(a);
        // b = Math.abs(b);

        // //Determinar el mayor usando Math.max()
        // mayor = Math.max(a, b);

        

        //Inicializar el MCM con el número mayor
        mcm = mayor;

        //Mientras mcm no sea múltiplo de ambos números
        while ((mcm % a != 0) || (mcm % b != 0)) {
            mcm = mcm + mayor; //sumar el mayor hasta encontrar el múltiplo común
        }

        //Mostrar resultado
        System.out.println("El MCM es: " + mcm);
    }
}

