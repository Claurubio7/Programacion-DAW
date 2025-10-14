import java.util.Scanner;

public class App {
    
    // public static void imprimeArray(double[] array){
    //     System.out.println(array[1]);
    // }

    // public static double[] devolverArray(double[] a){
    //     a[1]
    // }
    public static void main(String[] args) throws Exception {
        // String nombre1;
        // String Apellidos1;
        // int edad1;
        // double notaBD1;
        // double notaPROG1;
        // double notaED1;

        // double calificaciones[]={7,8,2,4,8,9};
        // System.out.println(calificaciones[0]);

        
        // // ARRAY DINÁMICO
        // double[] calificaciones2;
        // // System.out.print("Indica el tamaño del array calificaciones2: ");
        // // Scanner sc= new Scanner(System.in);
        // // calificaciones2 = new double[sc.nextInt()];
        // // System.out.println(calificaciones2);

        // //Arrays que apuntan al mismo sitio
        // double[] calificacionesOtro;
        // calificacionesOtro = calificaciones;
        // System.out.println(calificaciones[3]);
        // System.out.println(calificacionesOtro[3]);
        // // calificaciones=null;
        // System.out.println(calificacionesOtro[3]);


        // // matrices
        // String [][] comidas= {{"arroz", "pollo", "manzana"},{"caramelo","hamburguesa", "verduras" }, {"chocolate", "pastel", "cereales"}};
        // String[] aux = comidas[1];
        // System.out.println("Matriz "+ comidas[0][3]);
        // System.out.println(aux[0]);

        
        
        // //Usar la memría diná,ica reservada.
        // calificaciones2[3] = 5;
        // System.out.println(calificaciones2[3]);
        // System.out.println(calificaciones2[1]);

        // //acceeo a args del main
        // System.out.println(args[0]);

        // RECORRER UN VECTOR
        // int[] vector={1,2,3,4};
        // for (int i=vector.length -1;i>0; i--) {
        //     System.out.println(vector[i] + " ");
        // } 
        // System.out.println();

        // int[][] matriz={{1,2},{3,4}}; 
        // for(int i=0;i<2;i++){ 
        //     for (int j=0;j<2;j++) 
        //     System.out.print(matriz[i][j]+" "); 
        // }
        // System.out.println(); 

        // PRÁCTICA RECORRER ARRAY 
        // int[][] matrix={
        //     {1,2,3,4,5},
        //     {2,3,4,5},
        //     {3,4,5},
        //     {4,5},
        //     {5}
        // };
        int[][] matrix1={{3,7,1},{4,-4,2},{5,0,5}};
        for(int i=0;i<matrix1.length;i++){ 
            for (int j=0;j<matrix1[i].length;j++) { //Recorre las filas 
                System.out.print(matrix1[i][j]+" "); 
            }
        System.out.println(); 

        }


        

    }
}
