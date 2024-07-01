package Lista9ex2;

public class Retangulo extends Quadrilatero{

    private double base, altura;

    public Retangulo(double base,double altura) {
        super(base,base,altura,altura);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.getBase() * this.getAltura();
    }

    @Override
    public double calcularPerimetro() {
        return this.getBase() * 2 + this.getAltura() * 2;
    }

    @Override
    public String toString() {
        return  "Retângulo criado bom base medindo: " + String.format("%.2f",this.getBase()) + " e altura: " + String.format("%.2f",this.getAltura())+ 
                "\n- Área Retângulo:" + String.format("%.2f",this.calcularArea())+ 
                "\n- Perímetro Quadrado" + String.format("%.2f",this.calcularPerimetro());
    }
}