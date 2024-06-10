package lista3;

import java.util.Scanner;

public class ExeRepeticao08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int totalIdadeHomens = 0, totalIdadeMulheres = 0;
        int countHomens = 0, countMulheres = 0;

        while (true) {
            System.out.print("Digite o sexo (M/F) ou 'S' para sair: ");
            String sexo = read.next().toUpperCase();
            if (sexo.equals("S")) {
                break;
            }

            System.out.print("Digite a idade: ");
            int idade = read.nextInt();

            if (sexo.equals("M")) {
                totalIdadeHomens += idade;
                countHomens++;
            } else if (sexo.equals("F")) {
                totalIdadeMulheres += idade;
                countMulheres++;
            } else {
                System.out.println("Sexo inválido. Tente novamente.");
            }
        }

        if (countHomens > 0) {
            System.out.println("Média de idade dos homens: " + (totalIdadeHomens / countHomens));
        } else {
            System.out.println("Nenhum homem registrado.");
        }

        if (countMulheres > 0) {
            System.out.println("Média de idade das mulheres: " + (totalIdadeMulheres / countMulheres));
        } else {
            System.out.println("Nenhuma mulher registrada.");
        }

        read.close();
    }
}
