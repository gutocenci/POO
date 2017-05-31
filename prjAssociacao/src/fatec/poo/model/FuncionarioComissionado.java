package fatec.poo.model;

public class FuncionarioComissionado extends Funcionario {

    private double SalBase;
    private double TaxaComissao;
    private double TotalVendas;

    public FuncionarioComissionado(int r, String n, String dta, double t) {
        super(r, n, dta);
        TotalVendas = t;
    }

    public double getSalBase() {
        return SalBase;
    }

    public double getTaxaComissao() {
        return TaxaComissao;
    }

    public double getTotalVendas() {
        return TotalVendas;
    }

    public void setSalBase(double SalBase) {
        this.SalBase = SalBase;
    }

    public void addVendas(double vendas) {
        TotalVendas = TotalVendas + vendas;
    }

    @Override
    public double calcSalBruto() {
        double SalBruto;
        SalBruto = SalBase + (TaxaComissao * TotalVendas);
        return (SalBruto);
    }

    public double calcGratificacao() {
        double gratificacao;
        if (TotalVendas <= 10.000) {
            return (gratificacao = 0.035);
        }
        if (TotalVendas > 10.000) {
            return (gratificacao = 0.05);
        } else {
            return (gratificacao = 0);
        }
    }

    @Override
    public double calcSalLiquido() {
        //return (calcSalBruto() - calcDesconto() + calcGratificacao());
        return (super.calcSalLiquido() + calcGratificacao());
    }

}
