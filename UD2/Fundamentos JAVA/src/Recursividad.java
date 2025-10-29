public class Recursividad {
    public static int factorial(int n){
        //Caso base
        if (n==0){
            return 1;
        }
        else{//Caso recursivo
            return n*factorial(n-1);
        }
    }
    public static int suma(int n){
        //Caso base
        if (n==1){
            return 1;
        }
        else{//Caso recursivo
            return n+suma(n-1);
        }
    }
    public static void incre(int n){
        if(n>0){
            System.out.println(n);
            incre(n-1);
        }
        else{
            System.out.println();
        }
    }
    public static void main(String[] args){
        // System.out.println(factorial(4));
        // System.out.println(suma(4));
        incre(4);
    }
}