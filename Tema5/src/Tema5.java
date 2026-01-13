import java.io.*;

public class Tema5 {
    
    public static void main(String[] args) {
        File archivo=null;
        FileReader reader=null;
        BufferedReader buffer = null;
        // System.out.println("Directorio actual: "+ new File(".").getAbsolutePath());
        try{
            // // archivo = new File("./Tema5/numeros.txt");
            // // reader = new FileReader(archivo);
            // // buffer=new BufferedReader(reader);
            // buffer=new BufferedReader(new FileReader(new File("./Tema5/numeros.txt")));
            // double contador=0,suma=0, numero;
            // double media=0;
            // String linea;
            // //Vamos a leer el fichero de principio a fin
            // while((linea=buffer.readLine())!=null){
            //     System.out.println(linea);
            //     numero=Integer.parseInt(linea);//Convierte la cadena de texto en un número
            //     suma=suma+numero;
            //     contador++;
            // }
            // media=suma/contador;
            // //Sacar resultados
            // System.out.println("Hay "+contador+" números y la suma es "+suma+" y la media es "+media);
            // //Vamos a cerrar el descriptor de archivo
            // // reader.close();
        //     archivo = new File("./Tema5/numeros.txt");
        //     double suma=0, contador=0,media=0;
        //     Scanner fichero = new Scanner(archivo);
        //     //Vamos a leer su contenido
        //     while(fichero.hasNextInt()){
        //         int numero=fichero.nextInt();
        //         System.out.println(numero);
        //         contador++;
        //         suma+=numero;
        //     }
        //     media=suma/contador;
        //     System.out.println("Hay "+contador+" números y la suma es "+suma+" y la media es "+media);
        //     fichero.close();

        //Actividad 2
        // Scanner myObj = new Scanner(new File("./Tema5/numeros.txt"));

        // // Change delimiter
        // myObj.useDelimiter(",");
        // double suma=0,contador=0,media=0;
        // // Read the contents of the scanner
        // while (myObj.hasNext()) {
        //     int numero=Integer.parseInt(myObj.next());
        //     suma+=numero;
        //     contador++;
        // }
        // media=suma/contador;
        // System.out.println("Hay "+contador+" números y la suma es "+suma+" y la media es "+media);

        archivo=new File("./Tema5/numeros.txt");
        reader=new FileReader(archivo);
        buffer=new BufferedReader(reader);

        String linea= buffer.readLine();
        System.out.println(linea); //Hasta aquí tengo la línea de números separados por ','
        String[] numeros=linea.split(";");
        //Procesar el array de String
        double contador=0,suma=0,media=0;
        for(int i=0;i<numeros.length;i++){
            contador++;
            suma+=Integer.parseInt(numeros[i]);
        }
        media=suma/contador;
        System.out.println("Hay "+contador+" números y la suma es "+suma+" y la media es "+media);
        buffer.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}