package Lista7;

public class Carro {
    private String numPlaca;
    private String cor;
    private String modelo;
    private Propietario propietario;

    public Carro(String numPlaca, String cor, String modelo, Propietario proprietario) {
        this.numPlaca = numPlaca;
        this.cor = cor;
        this.modelo = modelo;
        this.propietario = proprietario;
    }

    public String getNumPlaca() {
        return this.numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Propietario getProprietario() {
        return this.propietario;
    }

    public void setProprietario(Propietario proprietario) {
        this.propietario = proprietario;
    }

    @Override
    public String toString() {
        return " \n Número da placa: " + this.numPlaca +
                " \n Cor: " + this.cor +
                " \n Modelo: " + this.modelo +
                " \n Proprietário: " + this.propietario;
    }
}