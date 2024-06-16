package Lista6;

import java.util.Scanner;

public class Lista06_06_ExeVetor05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 10; i++) {
            A[i] = read.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 10; i++) {
            B[i] =read.nextInt();
        }

        multiplicarVetores(A, B, C);

        System.out.println("Vetor C:");
        for (int i = 0; i < 10; i++) {
            System.out.print(C[i] + " ");
        }
    }

    public static void multiplicarVetores(int[] A, int[] B, int[] C) {
        for (int i = 0; i < 10; i++) {
            C[i] = A[i] * B[i];
        }
    }
}
