/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.radinho;

/**
 *
 * @author Luan
 */
public class Radio {
    private boolean ligado;
    private String musicaAtual;
    private long ultimoComando;

    private static final String[] MUSICAS = {
        "Feeling Good - Michael Bublé",
        "Árvore - Edson Gomes",
        "Oceano - Djavan"
    };

    public Radio() {
        this.ligado = false;
        this.musicaAtual = "Nenhuma";
    }

    public boolean isLigado() {
        verificarInatividade();
        return ligado;
    }

    public String getMusicaAtual() {
        verificarInatividade();
        return musicaAtual;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            atualizaTempoComando();
            System.out.println("Rádio ligado.");
            aguardar(500); // Breve pausa ao ligar
        } else {
            System.out.println("O rádio já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            musicaAtual = "Nenhuma";
            System.out.println("Rádio desligado.");
            aguardar(500); // Pausa para simular desligamento
        } else {
            System.out.println("O rádio já está desligado.");
        }
    }

    public void trocarMusica(int opcao) {
        if (!ligado) {
            System.out.println("Ligue o rádio primeiro.");
            return;
        }

        if (opcao >= 1 && opcao <= MUSICAS.length) {
            System.out.println("Trocando música...");
            aguardar(1000); // Pausa de 1 segundo para simular troca de música
            musicaAtual = MUSICAS[opcao - 1];
            atualizaTempoComando();
            System.out.println("Tocando: " + musicaAtual);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private void atualizaTempoComando() {
        ultimoComando = System.currentTimeMillis();
    }

    private void verificarInatividade() {
        if (ligado && (System.currentTimeMillis() - ultimoComando) >= 5 * 60 * 1000) {
            System.out.println("Rádio desligado automaticamente por inatividade.");
            desligar();
        }
    }

    private void aguardar(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Erro ao aguardar.");
        }
    }
}