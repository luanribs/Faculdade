/*Ler um vetor X de 10 elementos (ler pelo teclado os 10 elementos do tipo
inteiro). Crie um vetor Y da seguinte forma: (a) os elementos de ordem par de Y (elementos
com índice 0, 2, 4, 6, 8) receberão os respectivos elementos de X multiplicados por 2; (b)
Os elementos de ordem ímpar de Y (elementos com índices 1, 3, 5, 7, 9) receberão os
respectivos elementos de X multiplicados por 3. Escrever o vetor Y.*/

package Lista6;

import java.util.Scanner;

public class Lista06_07_ExeVetor07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[] X = new int[10];
        int[] Y = new int[10];

        System.out.println("digite os elementos do  X:");

        for (int i = 0; i < 10; i++) {
            X[i] = read.nextInt();
        }

        calcularVetorY(X,Y);

        mostrarVetorY(Y);
    }

    public static void calcularVetorY(int[] X, int[] Y) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                Y[i] = X[i] * 2;
            } else {
                Y[i] = X[i] * 3;
            }
        }
    }

    public static void mostrarVetorY(int[] vetorY) {
        System.out.println("Vetor resultante:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorY[i] + " ");
        }
    }
}