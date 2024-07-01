package Lista8;

public class AplicativoFuncionarios {
    public static void main(String[] args) {
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Giovana", "432124256", 1900);
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Luan", "25312324523", 75, 40);

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioHorista);
    }
}