package Lista8;

public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, String cpf, String departamento) {
        super(nome, cpf);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double getSalario() {
        return super.getSalario() * 1.20;
    }
}