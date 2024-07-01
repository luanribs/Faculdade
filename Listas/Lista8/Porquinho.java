package Lista8;

import java.util.ArrayList;

public class Porquinho {
    private ArrayList<Moeda> moedas;

    public Porquinho() {
        this.moedas = new ArrayList<Moeda>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(Moeda moeda) {
        moedas.remove(moeda);
    }

    public int getQuantidadeMoeda() {
        return moedas.size();
    }

    public ArrayList<Moeda> getMoedas() {
        return this.moedas;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Moeda moeda : moedas) {
            total += moeda.getValor();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(); //Cria "Váriavel" para armazenar string que será chamada

        sb.append("Porquinho esta com tantas moedas:\n");
        for (Moeda moeda : moedas) {
            sb.append(moeda.toString()).append("\n");
        }
        sb.append(String.format("Valor total: R$%.2f", calcularTotal()));

        return sb.toString();
    }
}