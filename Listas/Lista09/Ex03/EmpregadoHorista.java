package Lista9ex3;

public class EmpregadoHorista extends Empregado{

    private Double salarioPorHora;
    private Integer horasSemanais;

    public EmpregadoHorista(String nome, String sobrenome, String cpf,Double salarioPorHora,Integer horasSemanais) {
        super(nome, sobrenome, cpf);
        this.salarioPorHora = salarioPorHora;
        this.horasSemanais = horasSemanais;
    }

    public Double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(Double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public Integer getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(Integer horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    @Override
    public double rendimentos() {
        return (this.getHorasSemanais() <= 40) 
        ? 
        this.getHorasSemanais() * this.getSalarioPorHora()        
        : 
        40 * this.getSalarioPorHora() + (this.getHorasSemanais() - 40) * this.getSalarioPorHora() * 1.5;
    }

    @Override
    public String toString() {
        return  "\n Empregado Horista: " + this.getNome() + " " + this.getSobrenome() +
                "\n Número de CPF: " + this.getCpf() +
                "\n Salário por Hora: R$" + String.format("%.2f",this.getSalarioPorHora()) +
                "\n Horas Trabalhadas: " + this.getHorasSemanais() +
                "\n -> Recebeu: R$" + String.format("%.2f",this.rendimentos());
    }
}