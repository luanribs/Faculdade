package lista3;

import java.util.Scanner;

public class ExeRepeticao03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = read.nextInt();

        int dv = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                dv += i;
            }
        }

        if (dv == num) {
            System.out.println("O número " + num + " é um número perfeito.");
        } else {
            System.out.println("O número " + num + " não é um número perfeito.");
        }

        read.close();
    }
}
