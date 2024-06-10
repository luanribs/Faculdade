package lista3;

import java.util.Scanner;

public class ExeRepeticao04 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o primeiro valor: ");
            int valor1 = read.nextInt();
            System.out.print("Digite o segundo valor: ");
            int valor2 = read.nextInt();

            if (valor1 == valor2) {
                break;
            } else if (valor1 < valor2) {
                System.out.println("Ordem crescente.");
            } else {
                System.out.println("Ordem decrescente.");
            }
        }

        read.close();
    }
}
