package Lista4;

import java.util.Scanner;

public class ExeVetor08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] M = new int[10];

        System.out.println("Digite os elementos do vetor M:");
        for (int i = 0; i < M.length; i++) {
            M[i] = read.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int temp = M[i];
            M[i] = M[i + 5];
            M[i + 5] = temp;
        }

        System.out.println("Vetor M modificado:");
        for (int i = 0; i < M.length; i++) {
            System.out.println("M[" + i + "] = " + M[i]);
        }
    }
}
