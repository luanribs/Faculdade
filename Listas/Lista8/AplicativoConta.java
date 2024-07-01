package Lista8;

public class AplicativoConta {
    public static void main(String[] args) {
        ContaC contaCorrente = new ContaC("000", "Adiel", 100);

        contaCorrente.depositarDinheiro(37);
        System.out.println(contaCorrente.toString());

        contaCorrente.sacarDinheiro(50);
        System.out.println(contaCorrente.toString());

        contaCorrente.sacarDinheiro(200);
        System.out.println(contaCorrente.toString());
    }
}