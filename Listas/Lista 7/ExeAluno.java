package Lista7;

import java.util.Scanner;

public class ExeAluno {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.println("Insira o número de matrícula do aluno: ");
        int matriculaDoAluno = read.nextInt();

        System.out.println("Insira o nome do aluno: ");
        String nomeDoAluno = read.next();

        System.out.println("Insira a primeira nota do aluno: ");
        int primeiraNota = read.nextInt();

        System.out.println("Insira a segunda nota do aluno: ");
        int segundaNota = read.nextInt();

        Aluno aluno = new Aluno(matriculaDoAluno, nomeDoAluno, primeiraNota, segundaNota);

        aluno.alunoApr();

        read.close();
    }
}