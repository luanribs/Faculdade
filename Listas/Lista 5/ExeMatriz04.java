package Lista5;

public class ExeMatriz04 {
    public static void main(String[] args) {
        int[][] matriz = Matriz.gerarMatrizAleatoria(10,10);
        Matriz.mostrarMatriz(matriz);
        Matriz.calcularSPares(matriz);
    }
}
