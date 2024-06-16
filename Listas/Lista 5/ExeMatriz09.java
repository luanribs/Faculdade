package Lista5;


import static Lista5.Matriz.*;

public class ExeMatriz09 {

    public static void main(String[] args) {
        int[][] matriz = gerarMatrizAleatoria(3,3);

        System.out.println("aqui esta a matriz");
        Matriz.mostrarMatriz(matriz);

    // Calculando a média da diagonal secundária
    int mediaDiagonalSecundaria = inferno1(matriz);


    int[][] matrizResultado = inferno(matriz, mediaDiagonalSecundaria);

    // Mostrando a matriz resultante
    System.out.println("Acabou ultima matriz:");
    Matriz.mostrarMatriz(matrizResultado);
}



}

