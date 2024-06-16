package Lista5;

import java.util.Scanner;

import static Lista5.Matriz.mostrarVetor;
import static Lista5.Matriz.readMatriz;

public class ExeMatriz06 {  public static void main(String[] args) {
    final int linhas = 6;
    final int colunas = 6;

    int[][] M = new int[linhas][colunas];
    int[] V = new int[linhas * colunas];

    Scanner read = new Scanner(System.in);
    System.out.println("Digite os elementos da matriz M[6][6]:");
    readMatriz(read, M);

    System.out.print("Digite o valor de A: ");
    int A = read.nextInt();

    V = Matriz.multiplicarMatrizC(M, A);

    System.out.println("Valores do vetor V após multiplicação por A:");
    mostrarVetor(V, colunas);

    read.close();
}
}

