package lista2;

import java.util.Scanner;

public class ExeSelecao09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a quantidade de laranjas compradas: ");
        int quantidade = read.nextInt();

        if (quantidade > 0) {
            double preco;
            if (quantidade < 12) {
                preco = 0.30;
            } else {
                preco = 0.25;
            }
            double total = quantidade * preco;
            System.out.printf("O valor total da compra é: R$ %.2f\n", total);
        } else {
            System.out.println("Quantidade inválida.");
        }

        read.close();
    }
}
