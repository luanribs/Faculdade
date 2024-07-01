package Lista8;

public class Aplicativo {
    public static void main(String[] args) {
        Funcionario fn1 = new Funcionario("Luan", "25312324523");
        Funcionario fn2 = new Funcionario("Giovana", "432124256");

        Gerente g1 = new Gerente("Rafa", "77721345678", "Suporte");

        System.out.println("Dados dos funcionários da empresa: \n Funcionarios: \n");
        System.out.println(fn1 + "\n" + fn2);

        System.out.println("\n Gerente: \n" + g1);
    }
}