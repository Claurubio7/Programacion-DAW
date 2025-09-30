// import static java.lang.Math.pow;
import java.time.LocalDateTime;
import utilidades.Matematicas;

public class Funciones {

    public static void main(String[] args) {
        //Uso de fechas en JAVA
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println(hoy.toString());
        System.out.println(hoy.getDayOfWeek());

        //Tratamiento de Math
        System.out.println(Math.pow(2,8)); //pow(base, exponente), devuelve double(decimal)

        //Uso de funciones propias (Clase de Matematicas dentro de utilidades)
        System.out.println(Matematicas.suma(3, 4));

        //Números aleatorios
        //Math.random() --> número aleatorio tipo double entre 0.0 (incluido) y 1.0 (excluido).
        int min=1;
        int max=15;
        int aleatorio=(int)(Math.random()*(max-min+1))+min; //+ min --> Esto se hace para desplazar el rango y que empiece en min(1), ahora va de 1-15
        System.out.println(aleatorio);

        //Operadores
        //++ y --
        //No es lo mismo variable++ que ++variable
        int valor=1;
        valor=--valor;//Forzar la diferencia, tú pondrás en código sólo --valor
        System.out.println(valor);
        valor=valor-1;
        System.out.println(valor);

        /*
         * valor-- (postfijo) → usa el valor actual y después lo decrementa.
                   Imprime 5, luego lo baja a 4.
           --valor (prefijo) → primero lo decrementa y después lo usa.
                   Baja de 5 a 4, e imprime 4 directamente.
         */

        //Expresiones relacionales
        System.out.println((5>3)||(5>6));
        /*
         * || (OR lógico)
         * Solo necesita una condición verdadera para que el resultado sea true.
         * && (AND lógico)
         * Necesita que ambas condiciones sean verdaderas para que el resultado sea true.
         */


        //Operador opera-asigna
        int numero11=3;
        int numero12=4;
        numero11+=numero12;
        //numero11 = numero11 + numero12;
        System.out.println(numero11);

        //Operador ternario --> es una forma abreviada de un if-else
        int a=10,b=5;
        //variable = condición ? valor_si_verdadero : valor_si_falso;
        int x=a==10 ? b*2 : a;
        System.out.println(x);
    }
}