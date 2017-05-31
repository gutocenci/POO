package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author 0030481521021
 */
public class Pedido {
    private int Numero;
    private String DataEmissaoPedido;
    private String DataPagto;
    private boolean Status;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itemspedidos;
    
    public void addItemPedido(ItemPedido itempedido){
        itemspedidos.add(itempedido);
        itempedido.setPedido(this);
        cliente.setLimiteDisp(cliente.getLimiteDisp()-(itempedido.getQtdeVenda()*itempedido.getProduto().getPrecoUnit()));
    }
    
    public String getDataPagto() {
        return DataPagto;
    }

    public void setDataPagto(String DataPagto) {
        this.DataPagto = DataPagto;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public int getNumero() {
        return Numero;
    }

    public String getDataEmissaoPedido() {
        return DataEmissaoPedido;
    }

    public Pedido(int Numero, String DataPagto, Vendedor vendedor,Cliente cliente) {
        this.Numero = Numero;
        this.DataPagto = DataPagto;
        vendedor.addPedidos(this);
        cliente.addPedidos(this);
    }
}
