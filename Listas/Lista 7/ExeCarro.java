package Lista7;

public class ExeCarro {    public static void main(String[] args) throws Exception {
    Propietario primeiroPropietario = new Propietario("Luan", "Rua minha vida é um inferno", 'm', "234.256.234-82", "122");

    Carro veiculo1 = new Carro("jws215", "preto", "fusca", primeiroPropietario);
    Carro veiculo2 = new Carro("iny294", "preto", "bmw", primeiroPropietario);
    Carro veiculo3 = new Carro("plk128", "preto", "nivus", primeiroPropietario);

    Propietario segundoProprietario = new Propietario("Joana", "Rua Haverá sinais", 'f', "234-452-123-82", "043");

    Carro veiculo4 = new Carro("jpk197", "preto", "v-40", segundoProprietario);
    Carro veiculo5 = new Carro("lkm021", "preto", "corsa", segundoProprietario);

    System.out.println(veiculo1 + "\n" + veiculo2 + "\n" + veiculo3 + "\n" + veiculo4 + "\n" + veiculo5);
}
}

