public class FuncionesJava {
    final static double PI=3.14159;
    
    public static int suma(int numero1,int numero2){
        return numero1+numero2;
    }
    public static int suma(int numero1,int numero2,int numero3){
        return numero1+numero2+3;
    }
    public static double suma(double numero1,double numero2){
        int domingo=3;
        return numero1+numero2+PI;
    }
    public static void escribir3Saludos(){
        System.out.println("hola Claudia");
        System.out.println("hola clase de DAW");
        System.out.println("hola :)");
    }

    //Función que devuelve el valor máximo de 2 números
    public static int maximo(int numero1,int numero2){
        if(numero1>=numero2) return numero1;
        return numero2;
    }
    public static void main(String[] args) {
        /*
         * 
         */
        escribir3Saludos();
        double numero=PI+3;
        /*
         * 
         * 
         * 
         */
        escribir3Saludos();

        /*
         * 
         * 
         */
        escribir3Saludos();
        //Operación
        System.out.println(suma(2,3));//Suma con parámetros enteros
        System.out.println(suma(1.5,3.7));//Suma con parámetros reales

        System.out.println(maximo(3, 7));
        //maximo de 5 numeros (11,33,22,7,9)
        System.out.println(maximo(maximo(maximo(11,33),maximo(22,7)),9));
    }    
}
