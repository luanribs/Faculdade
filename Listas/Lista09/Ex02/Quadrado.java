package Lista9ex2;

public class Quadrado extends Quadrilatero{
    private double lado;

    public Quadrado(Double lado) {
        super(lado,lado,lado,lado);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.getLado() * 4;
    }

    @Override
    public String toString() {
        return  "Quadrado criado com lado medindo: " + String.format("%.2f",this.lado) + 
                "\n- Área do Quadrado: " + String.format("%.2f",this.calcularArea()) + 
                "\n- Perímetro do Quadrado: " + String.format("%.2f",this.calcularPerimetro());
    }
}
