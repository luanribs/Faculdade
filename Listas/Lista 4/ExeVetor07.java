package Lista4;

import java.util.Scanner;

public class ExeVetor07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] X = new int[10];
        int[] Y = new int[10];

        System.out.println("Digite os elementos do vetor X:");
        for (int i = 0; i < X.length; i++) {
            X[i] = read.nextInt();
        }

        for (int i = 0; i < Y.length; i++) {
            if (i % 2 == 0) {
                Y[i] = X[i] * 2;
            } else {
                Y[i] = X[i] * 3;
            }
        }

        System.out.println("Vetor resultante Y:");
        for (int i = 0; i < Y.length; i++) {
            System.out.println("Y[" + i + "] = " + Y[i]);
        }
    }
}
