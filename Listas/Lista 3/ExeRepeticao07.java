package lista3;

import java.util.Scanner;

public class ExeRepeticao07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número positivo: ");
            int x = read.nextInt();

            if (x == 0) {
                break;
            }

            for (int i = 1; i <= x; i++) {
                System.out.println(x + " x " + i + " = " + x * i);
            }
        }

        read.close();
    }
}
