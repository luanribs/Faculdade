package Lista4;

public class ExeVetor04 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int countPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
            if (vetor[i] % 2 == 0) {
                countPares++;
            }
        }

        System.out.println("Total de valores pares: " + countPares);
    }
}
