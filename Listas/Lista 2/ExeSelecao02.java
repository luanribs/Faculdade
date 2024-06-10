package lista2;

import java.util.Scanner;

public class ExeSelecao02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = read.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O valor é par.");
        } else {
            System.out.println("O valor é ímpar.");
        }

        read.close();
    }
}

