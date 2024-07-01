package Lista8;

public class FuncionarioCLT extends Funcionario {
    private double salarioMensal;

    public FuncionarioCLT(String nome, String cpf, double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;

    }

    public double getSalarioMensal() {
        return this.salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularRendimentos() {
        return getSalarioMensal();
    }

}