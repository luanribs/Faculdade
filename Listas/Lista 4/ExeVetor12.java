package Lista4;

import java.util.Scanner;

public class ExeVetor12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vetor = new int[6];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = read.nextInt();
        }

        System.out.println("Escolha a opcao desejada:");
        System.out.println("1- Soma dos elementos");
        System.out.println("2- Produto dos elementos");
        System.out.println("3- Média dos elementos");
        System.out.println("4- Mostre o vetor");

        int opcao = read.nextInt();

        switch (opcao) {
            case 1:
                int soma = 0;
                for (int i : vetor) {
                    soma += i;
                }
                System.out.println("Soma dos elementos: " + soma);
                break;
            case 2:
                int produto = 1;
                for (int i : vetor) {
                    produto *= i;
                }
                System.out.println("Produto dos elementos: " + produto);
                break;
            case 3:
                int total = 0;
                for (int i : vetor) {
                    total += i;
                }
                float media = (float) total /  vetor.length;
                System.out.println("Média dos elementos: " + media);
                break;
            case 4:
                System.out.println("Vetor:");
                for (int i = 0; i < vetor.length; i++) {
                    System.out.println("vetor[" + i + "] = " + vetor[i]);
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
