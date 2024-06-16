package Lista7;

public class Aluno {
    private int numeroDeMatricula;
    private String nomeDoAluno;

    public int getNumeroDeMatricula() {
        return this.numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public String getNomeDoAluno() {
        return this.nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public double getPrimeiraNota() {
        return this.primeiraNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public double getSegundaNota() {
        return this.segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    private double primeiraNota;
    private double segundaNota;

    public Aluno(int numeroDeMatricula, String nomeDoAluno, double primeiraNota, double segundaNota) {
        this.numeroDeMatricula = numeroDeMatricula;
        this.nomeDoAluno = nomeDoAluno;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    public double media(double primeiraNota, double segundaNota) {
        return (primeiraNota + segundaNota) / 2;
    }

    public void alunoApr() {
        if (media(primeiraNota, segundaNota) >= 7) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
            System.out.println("São necessários " + quantoPrecisa(media(primeiraNota, segundaNota)) + " para passar");
        }
    }

    public double quantoPrecisa(double mediaDasNotas) {
        return (50 - mediaDasNotas * 6) / 4;
    }
}