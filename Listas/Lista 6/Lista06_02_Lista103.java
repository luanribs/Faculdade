package Lista6;

import java.util.Scanner;
public class Lista06_02_Lista103 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = read.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = read.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        int numero3 = read.nextInt();

        System.out.println("Digite o quarto número inteiro:");
        int numero4 = read.nextInt();

        float media = calcularMedia(numero1, numero2, numero3, numero4);

        System.out.printf("A média aritmética é:" + media);
    }

    public static float calcularMedia(int a, int b, int c, int d) {
        return (a + b + c + d);
    }
}
