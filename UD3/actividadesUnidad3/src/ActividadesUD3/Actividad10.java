public class Actividad10 {
    //8 REINAS

    public static void imprimirTablero(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] tablero = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},        
        };
        final int primeraColumna = 0;
        tablero[0][primeraColumna] = 1; 
        
        if(resolverTablero(tablero, 1)) {
            imprimirTablero(tablero);
        } else {
            System.out.println("No hay solucion con la reina de esa columna");
        }
    }

    public static boolean resolverTablero(int[][] tablero, int fila) {
        final int N = 8;
        if(fila == N) {
            return true;
        }
        for(int columna = 0; columna < N-1; columna++){
            if(esSeguro(tablero, fila, columna)){
                tablero[fila][columna] = 1;
                if(resolverTablero(tablero, fila+1)){
                    return true;
                }
                tablero[fila][columna] = 0;
            }
        }
        return false;
    }

    public static boolean esSeguro(int[][] tablero, int fila, int columna) {
        for(int i = 0; i < fila-1; i++) {
            if(tablero[i][columna] == 1) {
                return false;
            }
        }
        int i = fila-1;
        int j = columna-1;
        while(i>= 0 && j >= 0) {
            if(tablero[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }
        i = fila-1; j = columna+1;
        while(i>=0 && j < 8 ) {
            if(tablero[i][j] == 1) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    
}