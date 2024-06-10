package lista3;

import java.util.Scanner;

public class ExeRepeticao02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int A = read.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = read.nextInt();

        if (A >= B) {
            System.out.println("O valor de A deve ser menor que B.");
            read.close();
            return;
        }

        int dv5 = 0;

        System.out.println("Números divisíveis por 5 entre " + A + " e " + B + ":");
        for (int i = A; i <= B; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                dv5 += i;
            }
        }

        System.out.println("Soma dos números divisíveis por 5: " + dv5);

        read.close();
    }
}
