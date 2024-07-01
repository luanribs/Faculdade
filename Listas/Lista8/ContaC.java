package Lista8;

public class ContaC extends Conta {
    private double limite = 500;

    public ContaC(String numero, String nomeTitular, double saldo) {
        super(numero, nomeTitular, saldo);
    }

    public double getLimite() {
        return this.limite;
    }

    @Override
    public void sacarDinheiro(double valor) {
        if (valor > 0 && valor <= (getSaldo() + limite)) {
            double novoSaldo = getSaldo() - valor;
            if (novoSaldo < 0) {
                limite += novoSaldo;
                super.depositarDinheiro(-novoSaldo);
            } else {
                super.sacarDinheiro(valor);
            }
        }
    }

    @Override
    public String toString() {
        return  "\n Conta: " + getNumero() +
                "\n Titular: " + getNomeTitular() +
                "\n Saldo: " + getSaldo() +
                "\n Limite: " + getLimite();
    }
}