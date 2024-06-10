package lista2;

import java.util.Scanner;

public class ExeSelecao07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o número de eleitores: ");
        int eleitores = read.nextInt();
        System.out.print("Digite o número de votos brancos: ");
        int brancos = read.nextInt();
        System.out.print("Digite o número de votos nulos: ");
        int nulos = read.nextInt();
        System.out.print("Digite o número de votos válidos: ");
        int validos = read.nextInt();

        float percBrancos =  brancos * 100 / eleitores;
        float percNulos = nulos * 100 / eleitores;
        float percValidos =  validos * 100 / eleitores;
/*
//lembrar de falar pro sor de como utilizar o significado dos f e % no printf e revisar nos slide */

        System.out.printf("Percentual de votos brancos: %.2f%%\n", percBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percValidos);

        read.close();
    }
}
