package Lista9ex3;

public class EmpregadoCLT extends Empregado{

    private Double salario;

    public EmpregadoCLT(String nome, String sobrenome, String cpf,Double salario) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public double rendimentos() {
        return this.getSalario();
    }

    @Override
    public String toString() {
        return  "\n Empregado CLT: " + this.getNome() + " " + this.getSobrenome() + 
                "\n Número de CPF: " + this.getCpf() + 
                "\n Salário: R$" + String.format("%.2f",this.getSalario()) + 
                "\n -> Recebeu: R$" + String.format("%.2f",this.rendimentos());
    }
}