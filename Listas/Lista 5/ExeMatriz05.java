package Lista5;

import java.util.Scanner;

import static Lista5.Matriz.mostrarMatriz;
import static Lista5.Matriz.readMatriz;

public class ExeMatriz05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int linhas = 5;
        int colunas = 5;
        int[][] A = new int[linhas][colunas];
        int[][] B = new int[linhas][colunas];
        int[][] S = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz A:");
        readMatriz(read, A);

        System.out.println("Digite os elementos da matriz B:");
        readMatriz(read, B);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                S[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Matriz S (soma de A e B):");
        mostrarMatriz(S);
    }
}