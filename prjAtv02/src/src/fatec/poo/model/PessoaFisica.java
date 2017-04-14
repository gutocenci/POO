package src.fatec.poo.model;

public class PessoaFisica extends Pessoa {

    private String CPF;
    private double Base;

    public String getCPF() {
        return CPF;
    }

    public double getBase() {
        return Base;
    }

    public PessoaFisica(String n, String c, int a) {
        super(n, a);
        CPF = c;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }
    
    @Override
    public double calcBonus(int a){
        double bonus = 0 ;
        if (super.getTotalCompras()> 12000){
            bonus = (2017 - a) * getBase();
        }
        return (bonus);
    }

}
