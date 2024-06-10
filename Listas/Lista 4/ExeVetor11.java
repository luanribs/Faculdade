package Lista4;

import java.util.Arrays;
import java.util.Scanner;

public class ExeVetor11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vetor = new int[20];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = read.nextInt();
        }

        Arrays.sort(vetor);

        System.out.println("Vetor ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }
    }
}
