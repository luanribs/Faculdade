package Lista5;

/* decidi fazer todos os metodos aqui para nao precisar ficar repetindo a criação de matriz e deixar o codigo "mais  limpo" demorou masssssssssss facilitou muito! */

import java.util.Random;
import java.util.Scanner;

public class Matriz {

    public static int[][] gerarMatrizAleatoria(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        Random random = new Random();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] calcularSomaColunas(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[] somaColunas = new int[colunas];

        for (int j = 0; j < colunas; j++) {
            int soma = 0;
            for (int i = 0; i < linhas; i++) {
                soma += matriz[i][j];
            }
            somaColunas[j] = soma;
        }

        return somaColunas;
    }

    public static void mostrarSomaColunas(int[] somaColunas) {
        System.out.println("\n Soma dos elementos de cada coluna:");
        for (int i = 0; i < somaColunas.length; i++) {
            System.out.println("Coluna " + i + ": " + somaColunas[i]);
        }
    }

    public static void calcularSPares(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        System.out.println("\nSoma das linhas pares:");
        for (int i = 0; i < linhas; i += 2) {
            int somaLinha = 0;
            for (int j = 0; j < colunas; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + i + ": " + somaLinha);
        }
    }

    public static void readMatriz(Scanner read, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("numero [" + i + "][" + j + "]: ");
                matriz[i][j] = read.nextInt();

            }
        }
    }

    public static int[] multiplicarMatrizC(int[][] matriz, int es) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[] vetorResultado = new int[linhas * colunas];
        int ind = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                vetorResultado[ind++] = matriz[i][j] * es;
            }
        }

        return vetorResultado;
    }


    public static void mostrarVetor(int[] vetor, int colunas) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\t");
            if ((i + 1) % colunas == 0) {
                System.out.println();
            }
        }

    }
    public static void calculosExercicioDoInferno(int linhas, int colunas, int[][] matriz) {

        int somaLinha4 = 0;
        for (int j = 0; j < colunas; j++) {
            somaLinha4 += matriz[3][j];
        }
        System.out.println("\nSoma da linha 4: " + somaLinha4);


        int somaColuna2 = 0;
        for (int i = 0; i < linhas; i++) {
            somaColuna2 += matriz[i][1];
        }
        System.out.println("Soma da coluna 2: " + somaColuna2);

        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);

        int somaTotal = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                somaTotal += matriz[i][j];
            }
        }
        System.out.println("Soma de todos os elementos da matriz: " + somaTotal);
    }
    public static void diagonalPrincipal(int linhas,int colunas, int[][] matriz) {
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);
    }
    public static int inferno1(int[][] matriz) {
        int tamanho = matriz.length;
        int soma = 0;
        int count = 0;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i + j == tamanho - 1) {
                    soma += matriz[i][j];
                    count++;
                }
            }
        }


        return soma / count;
    }
    public static int[][] inferno(int[][] matriz, int media) {
        int tamanho = matriz.length;
        int[][] matrizResultado = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j) { // Verifica se está na diagonal principal
                    matrizResultado[i][j] = matriz[i][j] * media;
                } else {
                    matrizResultado[i][j] = matriz[i][j];
                }
            }
        }

        return matrizResultado;
    }
}



