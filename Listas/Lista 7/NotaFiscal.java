package Lista7;

public class NotaFiscal {
    private ItemNotaFiscal item1;
    private ItemNotaFiscal item2;
    private ItemNotaFiscal item3;

    public NotaFiscal(ItemNotaFiscal item1, ItemNotaFiscal item2, ItemNotaFiscal item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public double calcularValorTotalDaNota() {
        return
                (item1.calcularValorTotalDosItens(item1.getPrecoUnitario(), item1.getQuantidade(), item1.calcularValorDaICMS(item1.getICMS(), item1.getPrecoUnitario() * item1.getQuantidade()))) +
                        (item2.calcularValorTotalDosItens(item2.getPrecoUnitario(), item2.getQuantidade(), item2.calcularValorDaICMS(item2.getICMS(), item2.getPrecoUnitario() * item2.getQuantidade()))) +
                        (item3.calcularValorTotalDosItens(item3.getPrecoUnitario(), item3.getQuantidade(), item3.calcularValorDaICMS(item3.getICMS(), item3.getPrecoUnitario() * item3.getQuantidade())));
    }

    @Override
    public String toString() {
        return item1.toString() +
                item2.toString() +
                item3.toString() +
                "\n Valor Total da Nota: " + calcularValorTotalDaNota();
    }
}