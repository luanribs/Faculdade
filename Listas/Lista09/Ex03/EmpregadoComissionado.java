package Lista9ex3;

public class EmpregadoComissionado extends Empregado{

    private Double vendaBrutaMensal;
    private Double taxaDeComissao;

    public EmpregadoComissionado(String nome, String sobrenome, String cpf,Double vendaBrutaMensal,Double taxaDeComissao) {
        super(nome, sobrenome, cpf);
        this.vendaBrutaMensal = vendaBrutaMensal;
        this.taxaDeComissao = taxaDeComissao;
    }

    public Double getVendaBrutaMensal() {
        return vendaBrutaMensal;
    }

    public void setVendaBrutaMensal(Double vendaBrutaMensal) {
        this.vendaBrutaMensal = vendaBrutaMensal;
    }

    public Double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(Double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    @Override
    public double rendimentos() {
        return this.getVendaBrutaMensal() * this.getTaxaDeComissao();
    }

    @Override
    public String toString() {
        return  "\n Empregado Comissionado: " + this.getNome() + " " + this.getSobrenome() +
                "\n Número de CPF: " + this.getCpf() +
                "\n Venda Bruta Mensal: R$" + String.format("%.2f",this.getVendaBrutaMensal()) +
                "\n Taxa de Comissão: " + this.getTaxaDeComissao() +
                "\n -> Recebeu: R$" + String.format("%.2f",this.rendimentos());
    }
}