package Lista6;

import java.util.Scanner;

public class Lista06_07_ExeVetor07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] X = new int[10];
        int[] Y = new int[10];

        System.out.println("digite os elementos do  X:");

        for (int i = 0; i < 10; i++) {
            X[i] = read.nextInt();
        }

        calcularVetorY(X,Y);

        mostrarVetorY(Y);
    }

    public static void calcularVetorY(int[] X, int[] Y) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                Y[i] = X[i] * 2;
            } else {
                Y[i] = X[i] * 3;
            }
        }
    }

    public static void mostrarVetorY(int[] vetorY) {
        System.out.println("Vetor resultante:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorY[i] + " ");
        }
    }
}
