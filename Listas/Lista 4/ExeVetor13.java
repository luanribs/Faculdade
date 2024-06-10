package Lista4;

import java.util.Scanner;
import java.util.ArrayList;
/* não consegui fazer só com o chat gpt perguntar pro sor*/
public class ExeVetor13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] A = new int[30];
        int[] B = new int[30];
        ArrayList<Integer> C = new ArrayList<>();

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = read.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = read.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j] && !C.contains(A[i])) {
                    C.add(A[i]);
                }
            }
        }

        System.out.println("Vetor resultante C (intersecção):");
        for (int i = 0; i < C.size(); i++) {
            System.out.println("C[" + i + "] = " + C.get(i));
        }
    }
}
