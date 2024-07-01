package Lista8;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario = 1900;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Remover o Calcular rendimentos para o exercicio 1(do override tambem!//
    public double calcularRendimentos() {
        return 0;
    }

    @Override
    public String toString() {
        return "\n Nome: " + getNome() +
                "\n CPF: " + getCpf() +
                "\n Rendimento Mensal: " +
                calcularRendimentos();


    }
}
