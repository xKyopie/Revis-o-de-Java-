package atv2;

public class ItemPedido {
    //Campos
    private Produto codProduto;
    private int quantidade;

    //Construtor
    public ItemPedido(Produto codProduto, int quantidade) {
        this.codProduto = codProduto;
        this.quantidade = quantidade;
    }

    //Getters e Setters
    public Produto getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Produto codProduto) {
        this.codProduto = codProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
}
