import java.util.ArrayList;
import java.util.Arrays;

public class ClasesOtras {
    public static void main(String[] args) throws Exception {
        // int vec[]={6,8,3,5,4,9,0,2,1,7};
        //     System.out.print("Vector sin ordenar: ");
        //     for(int i=0;i<vec.length;i++){
        //         System.out.print(vec[i]+" ");
        //     }
        //     //Ordenamiento
        //     for(int i=0; i < vec.length-1; i++){
        //            for(int j=0; j < (vec.length-1-i); j++){  
        //                 if(vec[j] > vec[j+1]){  
        //                         int aux=vec[j];                 
        //                         vec[j]=vec[j+1];           
        //                         vec[j+1]=aux;
        //                  }    
        //            }
        //       }
        //     System.out.print("\nVector ordenado: ");
        //     for(int i=0;i<vec.length;i++){
        //         System.out.print(vec[i]+" ");
        //     }
        //     System.out.println();

        // //Utilizando métodos de clases que ya existen
        // int vector[]={6,8,3,5,4,9,0,2,1,7};
        // Arrays.sort(vector);
        // System.out.print("\nVector ordenado: ");
        // for(int i=0;i<vector.length;i++){
        //         System.out.print(vector[i]+" ");
        //     }
        //     System.out.println();
        

        // //comprobar si dos vectores son iguales
        // System.out.println(Arrays.equals(vec,vector));



        // //Uso de ARRAYLIST
        // ArrayList<Integer> array= new ArrayList<>();
        // array.add(3);
        // array.add(7);
        // for(int i=0;i<array.size();i++){
        //     System.out.print(array.get(i)+" ");
        // }
        // System.out.println();
        // System.out.println("Quitar el último");
        // int valor=array.removeLast();
        // for(int i=0;i<array.size();i++){
        //     System.out.print(array.get(i)+" ");
        // }
        // System.out.println();

        // if (array.contains(3))
        //     System.out.println("El array contiene el 3");



        //USO DE STRING
        String cadena="viernes";
        System.out.println(cadena);
        if(cadena.equals("viernes")){
            System.out.println("HOY ES HALLOWEEN");
        }
        System.out.println(cadena.charAt(3));

        String resultado=cadena.concat(" es festivo");
        System.out.println(resultado);

        String halloween="      HOY ES HALLOWEEN";
        
        System.out.println(halloween.toLowerCase());

        System.out.println(halloween.replace('L','Ñ'));

        System.out.println(halloween.trim());


        String texto="hola, domingo, buenos, días";
        String[] salida=texto.split(",");
        for(int i=0;i<salida.length;i++){
            System.out.print(salida[i]+" ");
        }
        System.out.println();

    }
}