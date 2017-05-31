package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author 0030481521021
 */
public class Vendedor extends Pessoa{
    private double SalarioBase;
    private double Comissao;
    private ArrayList<Pedido> pedidos;
    
    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public double getComissao() {
        return Comissao;
    }

    public void setComissao(double Comissao) {
        this.Comissao = Comissao;
    }

    public Vendedor(double SalarioBase, String CPF, String Nome) {
        super(CPF, Nome);
        this.SalarioBase = SalarioBase;
    }
    
    public void addPedidos(Pedido pedido){
        pedidos.add(pedido);
    }
}
