public class Ejer7 {

    //Agujas de el reloj
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];
        int[][] rotada = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int)(Math.random() * 101);
            }
        }

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        
        for (int j = 0; j < 4; j++) {
            rotada[0][j + 1] = matriz[0][j];
        }
        for (int i = 0; i < 4; i++) {
            rotada[i + 1][4] = matriz[i][4];
        }
        for (int j = 4; j > 0; j--) {
            rotada[4][j - 1] = matriz[4][j];
        }
        for (int i = 4; i > 0; i--) {
            rotada[i - 1][0] = matriz[i][0];
        }

        for (int j = 1; j < 3; j++) {
            rotada[1][j + 1] = matriz[1][j];
        }
        for (int i = 1; i < 3; i++) {
            rotada[i + 1][3] = matriz[i][3];
        }
        for (int j = 3; j > 1; j--) {
            rotada[3][j - 1] = matriz[3][j];
        }
        for (int i = 3; i > 1; i--) {
            rotada[i - 1][1] = matriz[i][1];
        }
        rotada[2][2] = matriz[2][2];

        System.out.println("\nMatriz rotada:");
        mostrarMatriz(rotada);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}