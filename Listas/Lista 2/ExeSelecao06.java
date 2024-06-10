package lista2;

import java.util.Scanner;

public class ExeSelecao06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro segmento: ");
        int A = read.nextInt();
        System.out.print("Digite o valor do segundo segmento: ");
        int B = read.nextInt();
        System.out.print("Digite o valor do terceiro segmento: ");
        int C = read.nextInt();

        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("formar um triângulo.");
        } else {
            System.out.println("nao forma um triângulo.");
        }

        read.close();
    }
}
