package Lista6;

import java.util.Scanner;

public class Lista06_03_ExeSelecao02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int valor = read.nextInt();

        verificarParOuImpar(valor);
    }

    public static void verificarParOuImpar(int valor) {
        if (valor % 2 == 0) {
            System.out.println(valor + " é par.");
        } else {
            System.out.println(valor + " é ímpar.");
        }
    }
}
