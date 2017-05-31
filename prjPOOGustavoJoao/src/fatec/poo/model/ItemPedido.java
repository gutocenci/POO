package fatec.poo.model;

/**
 *
 * @author 0030481521021
 */
public class ItemPedido {
    private int NumeroItem;
    private int QtdeVenda;
    private Pedido pedido;
    private Produto produto;
    
    public int getQtdeVenda() {
        return QtdeVenda;
    }

    public void setQtdeVenda(int QtdeVenda) {
        this.QtdeVenda = QtdeVenda;
    }

    public int getNumeroItem() {
        return NumeroItem;
    }
    
    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public ItemPedido(int NumeroItem, int QtdeVenda, Pedido pedido, Produto produto) {
        this.NumeroItem = NumeroItem;
        this.QtdeVenda = QtdeVenda;
        this.pedido = pedido;
        this.produto = produto;
        produto.setQtdeDisponivel(produto.getQtdeDisponivel()-QtdeVenda);
    }
    
    
}
