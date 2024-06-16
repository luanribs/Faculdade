package Lista7;

public class ExeCD {

    private int numeroDeFaixas;
    private int faixaAtual;
    private int estadoDoCD;

    public ExeCD(int numeroDeMusicas) {
        this.numeroDeFaixas = numeroDeMusicas;
        this.faixaAtual = 1;
        this.estadoDoCD = 0;
    }

    public int getNumeroMusicasCD() {
        return numeroDeFaixas;
    }

    public void setNumeroMusicasCD(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getFaixaAtual() {
        return faixaAtual;
    }

    public void setFaixaAtual(int faixaAtual) {
        this.faixaAtual = faixaAtual;
    }

    public int getEstadoDoCD() {
        return numeroDeFaixas;
    }

    public void setEstadoDoCD(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public void tocaCD() {
        this.estadoDoCD = 1;
    }

    public void interompeCD() {
        this.estadoDoCD = 2;
    }

    public void paraCD() {
        this.estadoDoCD = 0;
    }

    public void proximaFaixa() {
        this.faixaAtual += 1;
    }

    public void faixaAnterior() {
        this.faixaAtual -= 1;
    }

    @Override
    public String toString() {
        String comportamentoCD;

        if (estadoDoCD == 1) {
            comportamentoCD = "Tocando";
        } else if (estadoDoCD == 2){
            comportamentoCD = "Pausado";
        } else {
            comportamentoCD = "Parado";
        }

        return "Display: " +
                "\n CD Está " + comportamentoCD +
                "\n Faixa sendo tocada: " + getFaixaAtual();
    }
}


