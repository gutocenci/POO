package src.fatec.poo.model;

public class PessoaJuridica extends Pessoa {
    
    private String cgc;
    private double taxaIncentivo;

    public PessoaJuridica (String n, String g, int a){
        super(n,a);
        cgc = g;
    }
    
    public String getCgc() {
        return cgc;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }

    public void setTaxaIncentivo(double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo/100;
    }
    
    @Override
    public double calcBonus(int a){
        double bonus;
        bonus = (taxaIncentivo * getTotalCompras()) * (2017 - a);
        return (bonus);
    }
    
}
