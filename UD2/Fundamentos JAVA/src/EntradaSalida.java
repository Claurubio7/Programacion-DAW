import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {

        // //Instrucciones de salida por pantalla
        // int valor = 7;
        // System.out.println(valor);

        // //Usar printf (formato)
        // double precio= 13.354789;
        // System.out.printf("El precio del producto %s tiene un valor de %5.2f y se han comprado %d", "Tablet", precio, valor);

        // //Incluir un icono
        // System.out.println("Que ganas tengo de unas vacaciones \u26F1");

        // //Formato reciente de System
        // System.out.println("El precio del producto " + "Tablet " + " tiene un valor de " + precio + " y se han comprado " + valor);

        // //Formato salida texto
        // System.out.printf("%15s, %-15s\n", "Domingo", "Informático");

        // //Formato tabla 
        // System.out.println("\n|----------|----------|----------|");
        // System.out.printf("|%-10s|%-10s|%-10s|", "Producto", "Cantidad", "Valor" );
        // System.out.println("\n|----------|----------|----------|");
        // System.out.printf("|%-10s|%d         |%f |", "Producto", valor, precio );
        // System.out.println("\n|----------|----------|----------|");

        // System.out.println("\n|----------|----------|----------|");
        // System.out.print("|"+ "Producto  " + "|" + "Cantidad  " + "|" + "Valor     " + "|" );
        // System.out.println("\n|----------|----------|----------|");
        // System.out.print("|"+ "Tablet    " + "|" + valor + "         |" + precio + " |" );
        // System.out.println("\n|----------|----------|----------|");

        //Operaciones de entrada por teclado 
        Scanner sc = new Scanner(System.in);
        // System.out.println("Introduce la cadena de texto deseada");
        // String cadena = sc.nextLine();
        // System.out.println("El cadena intoducido es: " +  cadena);

        System.out.print("Introduce Nombre: ");
        //Lee nombre
        String nombre = sc.nextLine();
        //Leer Apellido
        System.out.print("Introduce Apellido: ");
        String apellido = sc.nextLine(); //Si se pidiera de uno en uno hay que poner nextLine()
        //Leer edad
        System.out.print("Introduce Edad: ");
        // //Opción 1 para limpiar el buffer
        // int edad = sc.nextInt();
        // sc.nextLine(); //limpiar el buffer para el salto de linea
        //Opción 2 para limpiar el buffer
        int edad = Integer.parseInt(sc.nextLine());
        //Leer profesión
        System.out.print("Introduce Profesión: ");
        String profesion = sc.nextLine();

        System.out.println("El ususario se llama " + nombre + " " + apellido + ". Tiene " + edad + " años y trabaja de " + profesion );



        sc.close(); //Cierre de el flujo de teclado. Si no lo haces tú ya lo hará el recolector de basura de JAVA 


    }
}
