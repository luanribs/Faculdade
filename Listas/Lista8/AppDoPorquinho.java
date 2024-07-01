package Lista8;

public class AppDoPorquinho {
    public static void main(String[] args) throws Exception {
        Moeda cincoCentavos = new Moeda(0.5, "Moeda de Cinco Centavos");
        Moeda dezCentavos = new Moeda(0.10, "Moeda de Dez Centavos");
        Moeda vinteECincoCentavos = new Moeda(0.25, "Moeda de Vinte Cinco Centavos");
        Moeda cinquentaCentavos = new Moeda(0.50, "Moeda de Cinquenta Centavos ");
        Moeda umReal = new Moeda(1.00, "Moeda de 1 real");

        Porquinho pc = new Porquinho();

        pc.adicionarMoeda(cincoCentavos);
        pc.adicionarMoeda(dezCentavos);
        pc.adicionarMoeda(vinteECincoCentavos);
        pc.adicionarMoeda(cinquentaCentavos);
        pc.adicionarMoeda(umReal);

        System.out.println(pc.toString());
    }
}