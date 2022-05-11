package atv2;

public class Main{
    public static void main(String[] args) {
        //Criar um obj de Produto 
        Produto prod1 = new Produto(250, 1200, "Colar de pérola.");
        Produto prod2 = new Produto (40, 250, "Brinco Rubi");

        //Criar obj ItemPedido
        ItemPedido itemProd1 = new ItemPedido(prod1, 200);
        ItemPedido itemProd2 = new ItemPedido(prod2, 500);
        
        //Imprimir dados do Produto que tá em ItemPedido
        System.out.println("Descriação: " + itemProd1 .getCodProduto() .getDescricao());
        System.out.println("Valor: " + itemProd1 .getCodProduto() .getValor() * itemProd1 .getQuantidade());

        System.out.println("Descriação: " + itemProd2 .getCodProduto() .getDescricao());
        System.out.println("Valor: " + itemProd2 .getCodProduto() .getValor() * itemProd2 .getQuantidade());

        //Criar um obj do tipo Pedido
        Pedido pedidos = new Pedido();

        //Adicionar um ItemPedido ao Pedido
        pedidos.adicionarItem(itemProd1);
        pedidos.adicionarItem(itemProd2);

        //Imprimir o valor total
        System.out.println("Valor total: " + pedidos.obterTotal());


}
}

