package lista2;

import java.util.Scanner;

public class ExeSelecao10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("-----Lojinha da Claudia-----");
        System.out.println("Produtos disponíveis:");
        System.out.println("1. Banana");
        System.out.println("2. Laranja");
        System.out.println("3. Maçã");
        System.out.println("4. Kiwi");
        System.out.print("Escolha o produto (1-4): ");
        int produto = read.nextInt();

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = read.nextInt();

        if (quantidade > 0) {
            double preco = 0;
            switch (produto) {
                /* perguntar do porque o ? substitiu o if else e porque nao podemos usar sempre ele */
                case 1:
                    preco = (quantidade < 12) ? 0.30 : 0.25;
                    break;
                case 2:
                    preco = (quantidade < 12) ? 0.40 : 0.35;
                    break;
                case 3:
                    preco = (quantidade < 12) ? 0.50 : 0.45;
                    break;
                case 4:
                    preco = (quantidade < 12) ? 0.40 : 0.30;
                    break;
                default:
                    System.out.println("Produto inválido.");
                    read.close();
                    return;
            }
            double total = quantidade * preco;
            System.out.printf("O valor total da compra é: R$ %.2f\n", total);
        } else {
            System.out.println("Quantidade inválida.");
        }

        read.close();
    }
}
