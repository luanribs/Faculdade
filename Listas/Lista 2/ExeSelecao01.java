package lista2;

import java.util.Scanner;
public class ExeSelecao01 {
    public static void main(String[] args) {

                Scanner read = new Scanner(System.in);
                System.out.print("Digite um valor: ");
                int valor = read.nextInt();

                if (valor > 100) {
                    System.out.println("O valor é maior que 100.");
                } else {
                    System.out.println("O valor é menor ou igual a 100.");
                }

                read.close();
            }
        }

