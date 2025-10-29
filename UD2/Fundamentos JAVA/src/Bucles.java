import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {

        /* 
         * FOR --> conozco cuántas veces se van a ejecutar 
         * While --> mientras s ecumpla la condición
         * DO{} WHILE --> Haz mientras se cumpla la condición
        */


        //Caso básico de bucle

        //for(...) --> es un bucle que se repite varias veces según una condición.
        //i<5; → condición que indica hasta cuándo se repite el bucle. Mientras i sea menor que 5, el bucle sigue.
        // for(int i=0;i<5;i++){
        //     System.out.println(i);
        // }

        // int j=0;
        // //Bucle infinito
        // //while(...)--> es un bucle que se repite mientras la condición sea verdadera.
        // while(j<5){
        //     System.out.println(j);
        //     j++; //Si no se pusiera j++, el bucle nunca terminaría y sería un bucle infinito.
        // }

        // /*for → útil cuando se sabe cuántas veces se quiere repetir algo.
        //   while → útil cuando no se sabe cuántas veces será, pero depende de una condición.(la condición tiene que llegar a false para evitar bucles infinitos.) */

        // //Bucle do While 
        // int k=0;
        // do{
        //     System.out.println(k);
        //     k++;
        // }while(k<5);

        // //COSAS INCORRECTAS
        // for(int i=0; i<5; i++){
        //     System.out.println(i);
        //     if(i==3) break;// con el break es forzarlo 
        // }
        // //mejor forma
        // boolean continua=true;
        // for(int i=0; i<5 && continua; i++){
        //     System.out.println(i);
        //     if(i==3) continua=false;
        // }

        // //Hacerlo mejor con un bucle while
        // int j=0;
        // while (j<5 && continua) {
        //     System.out.println();
        //     if (j==3) continua=false;
        //     j++;
        // }
         
        // //Se repite hasta que se meta el contenido correcto
        // Scanner sc = new Scanner(System.in);
        // int numero = 0;
        // do{
        //     System.out.print("Escribe un número entre 1 y 5: ");
        //     numero = sc.nextInt();
        // }while(numero<1||numero>5);
       

        //BUCLES ANIDADOS
        //  for (int i=1;i<=4;i++){
        //     if (i%2==0) {
        //     for(int j=4;j>=i;j--){
        //             System.out.print("*");
        //         }                
        //     }
        //     System.out.println("");
        // }

        for (int i=1;i<=10;i++){
            for(int j=1;j<=12;j++){
                
                    System.out.println(i+"*"+j+"= "+(i*j));
                
            }
            System.out.println("");
        }
        
    }
}