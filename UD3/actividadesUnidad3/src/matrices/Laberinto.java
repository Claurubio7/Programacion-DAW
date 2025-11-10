public class Laberinto {
    public static void main(String[] args) {

        final char CAMINO= '0';
        final char PARED='#';
        // Laberinto

        char[][] laberinto = {
            {'0', '0', '#', '0'},
            {'#', '0', '#', '0'},
            {'#', '0', '0', '0'},
            {'#', '#', '0', '0'}
        };

        // Punto de inicio y fin del laberinto
        final int INICIO=0;
        final int filaFIN= laberinto.length;
        final int columnaFIN= laberinto[0].length;

        //Crear la matriz solucion
        int [][] solucion=new int[filaFIN][columnaFIN];
        for (int i=0; i<filaFIN; i++) {
            for (int j=0; j<columnaFIN; j++) {
                solucion[i][j]=0;
            }
        }

        if (resolverDesde(0,0,laberinto,solucion)== true) {
            imprimir(solucion);
        } else 
            System.out.println("No hay salida de el laberinto");
    }

    //Procedimiento imprimir
    public static void imprimir (int[][] matriz){
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Funcion resolverDesde
    public static boolean resolverDesde (int x, int y, char[][] laberinto, int[][] solucion){
        if(x==(laberinto.length-1)&& y==(laberinto[0].length-1)){
            solucion[x][y]=1;
            return true;
        }
        if(esSeguro(x,y,laberinto)==true){
            solucion[x][y]=1;
            //analizo el resto de caminos posibles
            if(resolverDesde(x+1, y, laberinto, solucion)==true) return true;
            if(resolverDesde(x, y+1, laberinto, solucion)==true) return true;
            if(resolverDesde(x-1, y, laberinto, solucion)==true) return true;
            if(resolverDesde(x, y-1, laberinto, solucion)==true) return true;
            //Backtracking
            solucion[x][y]=0;
            return false;
        }
        return false;
    }

    public static boolean esSeguro(int x, int y, char[][]laberinto){
        if(x>=0 && x<=(laberinto.length-1) && y>=0 && y<=(laberinto[0].length-1) && laberinto[x][y]=='0'){
            return true;
        }
        return false;
    }

}
