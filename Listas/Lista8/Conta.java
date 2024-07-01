package Lista8;

public class Conta {
    private String numero;
    private String nomeTitular;
    private double saldo = 0;

    public Conta(String numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositarDinheiro(double valor) {
        this.saldo += valor;
        System.out.println("\n Depósito de: R$" + valor);
    }

    public void sacarDinheiro(double valor) {
        this.saldo -= valor;
        System.out.println("\n Saque de: R$" + valor);
    }

    @Override
    public String toString() {
        return "\n Conta: " + getNumero() +
                "\n Titular: " + getNomeTitular() +
                "\n Saldo: " + getSaldo();
    }
}