package lista2;

import java.util.Scanner;

public class ExeSelecao08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o valor do lado A: ");
        int A = read.nextInt();
        System.out.print("Digite o valor do lado B: ");
        int B = read.nextInt();
        System.out.print("Digite o valor do lado C: ");
        int C = read.nextInt();

        if (A < B + C && B < A + C && C < A + B) {
            if (A == B && B == C) {
                System.out.println("O triângulo é equilátero.");
            } else if (A == B || B == C || A == C) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo.");
        }

        read.close();
    }
}
