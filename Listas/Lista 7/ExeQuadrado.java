package Lista7;

import java.util.Scanner;

public class ExeQuadrado {

    public static void main(String[] args) throws Exception {
    Scanner read = new Scanner(System.in);

    System.out.println("Insira a medida do lado do seu quadrado :");
    double medidaLadoDoQuadrado = read.nextDouble();

    Quadrado quadrado = new Quadrado();
    quadrado.setLadoDoQuadrado(medidaLadoDoQuadrado);
    System.out.println("Área do quadrado: " + quadrado.getAreaQuadrado());
    System.out.println("Perímetro do quadrado: " + quadrado.getPerimetroQuadrado());
    System.out.println("Valor da diagonal do quadrado: " + quadrado.getDiagonalQuadrado());

    read.close();
}
}

