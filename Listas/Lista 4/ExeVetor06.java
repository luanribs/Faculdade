package Lista4;

public class ExeVetor06 {
    public static void main(String[] args) {
        int[] vetor = {10, -3, 14, -5, 7, 20, -30, 40, 0, 11, -7, 2, 15, -9, 6, 18, -4, 8, 5, -6, 19, -2, 1, 13, -8, 3, 17, -1, 12, -10};

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                System.out.println("vetor[" + i + "] = " + vetor[i]);
            }
        }
    }
}
