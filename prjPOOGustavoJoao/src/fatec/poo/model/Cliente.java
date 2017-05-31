package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author 0030481521021
 */
public class Cliente extends Pessoa {
    private double LimiteCred;
    private double LimiteDisp;
    private ArrayList<Pedido> pedidos;
            
    public Cliente(double LimiteDisp, String CPF, String Nome) {
        super(CPF, Nome);
        this.LimiteCred = LimiteCred;
        this.LimiteDisp = LimiteCred;
    }

    public double getLimiteCred() {
        return LimiteCred;
    }

    public double getLimiteDisp() {
        return LimiteDisp;
    }
    
    public void addPedidos(Pedido pedido){
        pedidos.add(pedido);
    }

    public void setLimiteDisp(double LimiteDisp) {
        this.LimiteDisp = LimiteDisp;
    }
    
    
}
