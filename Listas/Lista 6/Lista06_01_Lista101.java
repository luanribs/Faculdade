/*(Lista6_01_Lista1_01) Construa programa em Java que leia (via teclado) dois números do tipo inteiro,
calcule o produto entre eles e mostre o resultado.*/

package Lista6;

import java.util.Scanner;

public class Lista06_01_Lista101 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = read.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = read.nextInt();

        int produto = calcularProduto(numero1, numero2);

        System.out.println("O produto entre " + numero1 + " e " + numero2 + " é: " + produto);

    }

    public static int calcularProduto(int a, int b) {
        return a * b;
    }
}