package Lista4;

import java.util.Scanner;

public class ExeVetor09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = read.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = read.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            C[i] = A[i];
            C[i + 10] = B[i];
        }

        System.out.println("Vetor resultante C:");
        for (int i = 0; i < C.length; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}
