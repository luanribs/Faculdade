/*Faça um programa que leia dois vetores (A e B) de 30 posições e crie um
terceiro (C) com a intersecção dos dois primeiros, isto é, coloque em C apenas os
elementos que coexistem em A e B. Mostre C.*/

package Lista6;

import java.util.Scanner;

public class Lista06_08_ExeVetor13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] A = new int[30];
        int[] B = new int[30];

        System.out.println("Digite os elementos do vetor A:");

        for (int i = 0; i < 30; i++) {
            A[i] = read.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");

        for (int i = 0; i < 30; i++) {
            B[i] = read.nextInt();
        }

        int[] vetorC = encontrarInter(A, B);

        System.out.println("Vetor C:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        read.close();
    }

    public static int[] encontrarInter(int[] A, int[] B) {
        int[] vetorC = new int[30];
        int C = 0;

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                if (A[i] == B[j]) {
                    vetorC[C] = A[i];
                    C++;
                    break;
                }
            }
        }

        int[] resultado = new int[C];
        for (int i = 0; i < C; i++) {
            resultado[i] = vetorC[i];
        }
        return resultado;
    }
}