/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.radinho;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ligar rádio"); 
            System.out.println("2. Desligar rádio");
            System.out.println("3. Trocar música");
            System.out.println("4. Ver música atual");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> radio.ligar();
                case 2 -> radio.desligar();
                case 3 -> {
                    System.out.println("Escolha a música:");
                    System.out.println("1. Feeling Good - Michael Bublé");
                    System.out.println("2. Árvore - Edson Gomes");
                    System.out.println("3. Oceano - Djavan");
                    System.out.print("Opção: ");
                    int escolha = scanner.nextInt();
                    radio.trocarMusica(escolha);
                }
                case 4 -> System.out.println("Música atual: " + radio.getMusicaAtual());
                case 0 -> {
                    System.out.println("Desligando o radio.");
                    radio.desligar();
                }
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}