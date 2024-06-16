package Lista7;

import java.util.Scanner;

public class ExeNotaFiscal {public static void main(String[] args) throws Exception {
    Scanner read = new Scanner(System.in);

    String descricao;
    double  quantidade, ICMS, precoUnitario;
    ItemNotaFiscal[] itens = new ItemNotaFiscal[3];

    for(int i = 0; i < 3; i++) {
        System.out.println("Insira a descrição do item número " + (i + 1));
        descricao = read.next();

        System.out.println("Insira o preço unitário do item número: " + (i + 1 ));
        precoUnitario = read.nextDouble();

        System.out.println("Insira a quantidade do item número: " + (i + 1 ));
        quantidade = read.nextDouble();

        System.out.println("Insira o ICMS (em %, ex: 30% = 0.30) do item número: " + (i + 1 ));
        ICMS = read.nextDouble();

        itens[i] = new ItemNotaFiscal(descricao, precoUnitario, quantidade, ICMS);
    }

    NotaFiscal notaFiscal = new NotaFiscal(itens[0], itens[1], itens[2]);
    System.out.println(notaFiscal.toString());
}
}

