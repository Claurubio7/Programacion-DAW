public class Actividad5 {
    public static void main(String[] args) {
        //Mientras repetir de 50 a 200
        //   Si numero%2=0 y numero%3=0
        //       Imprimir numero
        //fin_repestir
        
        //Entre 50 y 200 los múltiplos de 2 y 3
        for(int numero=50; numero<=200; numero++){
            if (numero%2==0 && numero%3==0) {
                System.out.println(numero);
            }
        }
        
    }
}
