public class Bucles {
    public static void main(String[] args) {

        //Caso básico de bucle

        //for(...) --> es un bucle que se repite varias veces según una condición.
        //i<5; → condición que indica hasta cuándo se repite el bucle. Mientras i sea menor que 5, el bucle sigue.
        for(int i=0;i<5;i++){
            System.out.println(i);
        }

        int j=0;
        //Bucle infinito
        //while(...)--> es un bucle que se repite mientras la condición sea verdadera.
        while(j<5){
            System.out.println(j);
            j++; //Si no se pusiera j++, el bucle nunca terminaría y sería un bucle infinito.
        }

        /*for → útil cuando se sabe cuántas veces se quiere repetir algo.
          while → útil cuando no se sabe cuántas veces será, pero depende de una condición.(la condición tiene que llegar a false para evitar bucles infinitos.) */
    }
}