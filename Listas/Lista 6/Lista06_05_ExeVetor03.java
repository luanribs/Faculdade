package Lista6;

public class Lista06_05_ExeVetor03 {
    public static void main(String[] args) {
        int[] vetorX = new int[10];

        preencherVetor(vetorX, 30);

        System.out.println("Vetor X após preenchimento:");
        for (int i = 0; i < vetorX.length; i++) {
            System.out.print(vetorX[i] + " ");
        }
    }

    public static void preencherVetor(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = valor;
        }
    }
}
