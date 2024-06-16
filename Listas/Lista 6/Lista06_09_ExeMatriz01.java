package Lista6;
import java.util.Random;
import java.util.Scanner;

import static Lista6.Matriz.calcularSomaMatriz;
import static Lista6.Matriz.gerarMatrizAleatoria;

public class Lista06_09_ExeMatriz01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[][] matriz = gerarMatrizAleatoria(7, 9);
        Matriz.mostrarMatriz(matriz);

        int soma = calcularSomaMatriz(matriz);
        System.out.println("A soma dos elementos da matriz é: " + soma);
    }


    }

