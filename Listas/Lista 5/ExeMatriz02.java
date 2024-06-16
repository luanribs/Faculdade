package Lista5;

import java.util.Random;

public class ExeMatriz02 {
        public static void main(String[] args) {
            int[][] M = new int[6][8];
            int[] C = new int[6];
            Random x = new Random();

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 8; j++) {
                    M[i][j] = x.nextInt(101) - 50;
                }
            }

            for (int i = 0; i < 6; i++) {
                int n = 0;
                for (int j = 0; j < 8; j++) {
                    if (M[i][j] < 0) {
                        n++;
                    }
                }
                C[i] = n;
            }

            System.out.println("Matriz M:");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(M[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("Vetor C:");
            for (int i = 0; i < 6; i++) {
                System.out.println("Linha " + i + ": " + C[i] + " negativos");
            }
        }
    }
