package Lista9ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Job {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Empregado> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários serão inseridos? ");
        int n = read.nextInt();
        read.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Entre com os dados do funcionário #" + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = read.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = read.nextLine();

            System.out.print("CPF: ");
            String cpf = read.nextLine();

            int tipoDeFuncionario;

            do {
                System.out.print("Tipos de contrato: \n1.CLT \n2.Horista \n3.Comissionado?");
                tipoDeFuncionario = read.nextInt();
                read.nextLine();

                if (tipoDeFuncionario == 1) {
                    System.out.print("Salário: ");
                    double salario = read.nextDouble();
                    funcionarios.add(new EmpregadoCLT(nome, sobrenome, cpf, salario));

                } else if (tipoDeFuncionario == 2) {
                    System.out.print("Salário por Hora: ");
                    double salarioPorHora = read.nextDouble();
                    System.out.print("Horas Semanais: ");
                    int horasTrabalhadasSemanais = read.nextInt();
                    funcionarios.add(new EmpregadoHorista(nome, sobrenome, cpf, salarioPorHora, horasTrabalhadasSemanais));
                
                } else if (tipoDeFuncionario == 3) {
                    System.out.print("Venda Bruta Mensal: ");
                    double vendaMensal = read.nextDouble();
                    System.out.print("Comissão: ");
                    double comissao = read.nextDouble();
                    funcionarios.add(new EmpregadoComissionado(nome, sobrenome, cpf, vendaMensal, comissao));
                
                } else  {
                    System.out.println("Opção inválida! \nInsira um valor válido:");
                }
                read.nextLine();
            } while (tipoDeFuncionario != 1 && tipoDeFuncionario != 2 && tipoDeFuncionario != 3);
        }
        System.out.println("Dados dos Funcionários:");
        funcionarios.forEach(System.out::println);

        read.close();
    }
}