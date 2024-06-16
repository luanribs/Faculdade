package Lista6;

import java.util.Scanner;

public class Lista06_04_ExeSelecao03 {



    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = read.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = read.nextInt();

        MaiorValor(valor1, valor2);

        read.close();
    }

    private static void MaiorValor(int valor1, int valor2) {
        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }
    }
}
