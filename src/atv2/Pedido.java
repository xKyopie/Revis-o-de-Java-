package atv2;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemPedido> itens;
    private double valoTotal;

    //Construtor
    public Pedido(){
        this.itens = new ArrayList<>();
    }

    //Method
    public void adicionarItem(ItemPedido novoItem){
        this.itens.add(novoItem);
        atualizaValorTotal(novoItem);
    }

    private void atualizaValorTotal(ItemPedido novoItem) {
        int quant = novoItem.getQuantidade();
        double valor = novoItem.getCodProduto().getValor();
        this.valoTotal = this.valoTotal + valor * quant;
    }

    public double obterTotal(){
        return valoTotal;
    }

}
