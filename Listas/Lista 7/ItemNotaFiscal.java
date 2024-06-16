package Lista7;

 public class ItemNotaFiscal {
     private String descricao;
     private double precoUnitario;
     private double quantidade;
     private double ICMS;

     public ItemNotaFiscal(String descricao, double quantidade, double precoUnitario, double ICMS)

     {
         this.descricao = descricao;
         this.precoUnitario = precoUnitario;
         this.quantidade = quantidade;
         this.ICMS = ICMS;
     }

     public String getDescricao() {
         return this.descricao;
     }

     public void setDescricao(String descricao) {
         this.descricao = descricao;
     }

     public double getPrecoUnitario() {
         return this.precoUnitario;
     }

     public void setPrecoUnitario(double precoUnitario) {
         this.precoUnitario = precoUnitario;
     }

     public double getQuantidade() {
         return this.quantidade;
     }

     public void setQuantidade(double quantidade) {
         this.quantidade = quantidade;
     }

     public double getICMS() {
         return this.ICMS;
     }

     public void setICMS(double ICMS) {
         this.ICMS = ICMS;
     }

     public double calcularValorTotalDosItens(double precoUnitario, double quantidade, double ICMS) {
         return precoUnitario * quantidade + calcularValorDaICMS(ICMS, precoUnitario * quantidade);
     }

     public double calcularValorDaICMS(double ICMS, double calcularValorTotalDosItens) {
         return ICMS * calcularValorTotalDosItens;
     }

     @Override
     public String toString() {
         return "\n     ITEM" +
                 "\n    Descrição: " + getDescricao() +
                 "\n    Preço Unitário: " + getPrecoUnitario() +
                 "\n    Valor Total: " + calcularValorTotalDosItens(getPrecoUnitario(), getQuantidade(), getICMS()) +
                 "\n    ICMS: " + calcularValorDaICMS(getICMS(), precoUnitario * quantidade);
     }
 }

