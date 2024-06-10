package lista2;

import java.util.Scanner;

public class ExeSelecao04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = read.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = read.nextInt();

        if (valor1 < valor2) {
            System.out.println("O menor valor é: " + valor1);
        } else {
            System.out.println("O menor valor é: " + valor2);
        }

        read.close();
    }
}
