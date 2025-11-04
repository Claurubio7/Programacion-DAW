import java.util.Scanner;

public class Repaso {
    
    
    public static void main(String[] args) {
    //    //Elimina los 2
    //    int vector[][]={{1,2,3},{4,5,6},{7,8,9}};
    //     for(int i=0;i<vector.length;i++){
    //         for(int j=0;j<vector[0].length;j++){
    //             System.out.print(vector[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    //     int vector3[][]={{1,2,3},{4,5,6},{7,8,9}};
    //     vector3[0][0]=vector3[1][0];
    //     int vector2[][]={{4,1,2},{7,5,3},{8,9,6}};
    //     for(int i=0;i<vector.length;i++){
    //         for(int j=0;j<vector[0].length;j++){
    //             System.out.print(vector2[i][j]+" ");
    //         }
    //         System.out.println();
    //     }



        //Ejemplo actividad eliminar elementos de un vector
        int array[]={2,5,14,7,8,2,9}; //-> {5,14,7,8,9}
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        //Buscar las veces que sale el 2
        int contador=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==2) contador++;
        }
        //Generar el array dinámico
        int array2[]=new int[array.length-contador];
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=2) array2[j++]=array[i];
        }
        //Sacar el resultado
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[i]+ " ");
        }
        System.out.println();
    }   
}