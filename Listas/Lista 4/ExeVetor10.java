package Lista4;

import java.util.Scanner;

public class ExeVetor10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] pares = new int[10];
        int[] impares = new int[10];
        int countPares = 0, countImpares = 0;

        while (countPares < 10 && countImpares < 10) {
            System.out.print("Digite um número (0 para sair): ");
            int num = read.nextInt();
            if (num == 0) {
                break;
            }
            if (num % 2 == 0) {
                if (countPares < 10) {
                    pares[countPares++] = num;
                }
            } else {
                if (countImpares < 10) {
                    impares[countImpares++] = num;
                }
            }
        }

        System.out.println("Vetor de pares:");
        for (int i = 0; i < countPares; i++) {
            System.out.println("pares[" + i + "] = " + pares[i]);
        }

        System.out.println("Vetor de ímpares:");
        for (int i = 0; i < countImpares; i++) {
            System.out.println("impares[" + i + "] = " + impares[i]);
        }
    }
}
