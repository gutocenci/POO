package fatec.poo.model;

public class FuncionarioHorista extends Funcionario {

    private double ValHorTrab;
    private int QtdeHorTrab;

    public FuncionarioHorista(int r, String n, String dta, double vht) {
        super(r, n, dta); // chamada ao método construtor da superclasse
        ValHorTrab = vht;
    }

    public void apontarHoras(int qht) {
        QtdeHorTrab = qht;
    }

    @Override
    public double calcSalBruto() {
        double SalBruto;
        SalBruto = ValHorTrab * QtdeHorTrab;
        return (SalBruto);
    }

    public double calcGratificacao() {
        double gratificacao;
        gratificacao = calcSalBruto() * 0.075;
        return (gratificacao);
    }
    
    @Override
    public double calcSalLiquido() {
        //return (calcSalBruto() - calcDesconto() + calcGratificacao());
        return (super.calcSalLiquido() + calcGratificacao() - calcDesconto());
    }
}

