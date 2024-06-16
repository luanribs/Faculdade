package Lista5;

import java.util.Random;

public class ExeMatriz01 {
    public static void main(String[] args) {
      int[][] matriz = new int[7][9];
      Random x = new Random();
      int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = x.nextInt(10);
                soma += matriz[i][j];
            }

        }
        System.out.println("A Matriz é");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); /* só pra dar um espaço*/
        }
        System.out.println("A soma é: " + soma);
    }
}
