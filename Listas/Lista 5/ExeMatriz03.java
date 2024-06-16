package Lista5;

import java.util.Random;

public class ExeMatriz03 {

    public static void main(String[] args) {
        int[][] matriz = Matriz.gerarMatrizAleatoria(5, 5);

        System.out.println("Matriz gerada:");
        Matriz.mostrarMatriz(matriz);

        int[] somaColunas = Matriz.calcularSomaColunas(matriz);


        Matriz.mostrarSomaColunas(somaColunas);
    }
}