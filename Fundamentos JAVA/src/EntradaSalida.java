public class EntradaSalida {
    public static void main(String[] args) {
        //Instrucciones de salida por pantalla
        int valor = 7;
        System.out.println(valor);

        //Usar printf (formato)
        double precio= 13.354789;
        System.out.printf("El precio del producto %s tiene un valor de %5.2f y se han comprado %d", "Tablet", precio, valor);

        //Incluir un icono
        System.out.println("Que ganas tengo de unas vacaciones \u26F1");

        //Formato reciente de System
        System.out.println("El precio del producto " + "Tablet " + " tiene un valor de " + precio + " y se han comprado " + valor);

        //Formato salida texto
        System.out.printf("%15s, %-15s\n", "Domingo", "Informático");

        //Formato tabla 
        System.out.println("\n|----------|----------|----------|");
        System.out.printf("|%-10s|%-10s|%-10s|", "Producto", "Cantidad", "Valor" );
        System.out.println("\n|----------|----------|----------|");
        System.out.printf("|%-10s|%d         |%f |", "Producto", valor, precio );
        System.out.println("\n|----------|----------|----------|");

        System.out.println("\n|----------|----------|----------|");
        System.out.print("|"+ "Producto  " + "|" + "Cantidad  " + "|" + "Valor     " + "|" );
        System.out.println("\n|----------|----------|----------|");
        System.out.print("|"+ "Tablet    " + "|" + valor + "         |" + precio + " |" );
        System.out.println("\n|----------|----------|----------|");




    }
}
