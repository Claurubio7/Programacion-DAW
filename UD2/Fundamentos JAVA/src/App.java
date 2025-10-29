public class App {

    //Definición de variables y constante globales
    public static boolean logico= true;
    final static double PI= 3.141697;
    public static void main(String[] args) throws Exception {//En esta función se ejecuta lo que lleve dentro 
    /*Estructura de la variable
     * (TIPO) IDENTIFICADOR = VALOR
    */

        String cadena = "Me llamo Claudia";
        int edad = 40;
        double salario= 14.56789635268;
        int x=5;   int y=7;     int z=10;
        int xx=5,  yy=7 , zz=10;

    //Definir una variable, inicializarla e imprimirla
        int variable= 0;
        System.out.println(variable); //Si no se inicializa dará error
        variable= 33;
        System.out.println(variable);

        System.out.println(cadena);

    //Hay que guardar los datos en variables correctamente...
        int valor = 1/3;
        double valor2 = 1/3.0;
        System.out.println(valor);
        System.out.println(valor2);
    //Es posible guardar variables de un tipo en otro compatible usando cast
        double a = (int)2.6;
        System.out.println(a);
        boolean logico2 = false;

        
        System.out.println(logico);
        System.out.println(PI);
        
        int b = 'b';// un caracter se guarda en un entero según ASCII
        System.out.println(b);
        char c = 97; //Un entero se guarda en un caracter según ASCII
        System.out.println(c);

        System.out.print("Hola");
        System.out.println("Hola");
    }

    /**
     * Programa para imprimir texto
     * @author Claudia Raquel Rubio Lazo
     * @Claurubio7
     */
    public static void imprimirTexto(){
            int logico=3;
    }
}
