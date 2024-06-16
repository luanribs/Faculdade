package Lista5;

public class ExeMatriz08 {
    public static void main(String[] args) {
       int[][] matriz = Matriz.gerarMatrizAleatoria(10,10);
        System.out.println("aqui a matriz:");
        Matriz.mostrarMatriz(matriz);
        Matriz.diagonalPrincipal(10,10,matriz);
    }
}
