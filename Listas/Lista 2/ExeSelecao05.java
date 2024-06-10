package lista2;

import java.util.Scanner;

public class ExeSelecao05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = read.nextInt();

        if (valor > 100 && valor < 200) {
            System.out.println("O valor está no intervalo (100, 200).");
        } else {
            System.out.println("O valor não está no intervalo (100, 200).");
        }

        read.close();
    }
}
