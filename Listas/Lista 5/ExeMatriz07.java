package Lista5;

import java.util.Scanner;

public class ExeMatriz07 {
    public static void main(String[] args) {
        int linhas = 5;
        int colunas = 5;


        int[][] M = new int[linhas][colunas];


        Scanner read = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz M[5][5]:");
        Matriz.readMatriz(read, M);


        System.out.println("\n Matriz M[5][5]:");
        Matriz.mostrarMatriz(M);


        Matriz.calculosExercicioDoInferno(linhas, colunas, M);


        read.close();
    }
}


