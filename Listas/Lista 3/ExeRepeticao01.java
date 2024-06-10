package lista3;

import java.util.Scanner;

public class ExeRepeticao01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int x = read.nextInt();

        int totalPares = 0 ;
        int totalImpares = 0;
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                totalPares++;
                somaPares += i;
            } else {
                totalImpares++;
                somaImpares += i;
            }
        }

        System.out.println("Total de números pares: " + totalPares);
        System.out.println("Total de números ímpares: " + totalImpares);
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);

        read.close();
    }
}
