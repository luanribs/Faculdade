package Lista6;

import java.util.Random;
import java.util.Scanner;

import static Lista6.Matriz.gerarMatrizAleatoria;

public class Lista06_10_ExeMatriz02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[][] matriz = gerarMatrizAleatoria(6, 8);
        int[] C = Matriz.negativo(matriz);

        System.out.println("Vetor C:");
        for (int i = 0; i < C.length; i++) {
            System.out.println("Linha " + (i+1) + ": " + C[i]);
        }

        read.close();
    }




}
