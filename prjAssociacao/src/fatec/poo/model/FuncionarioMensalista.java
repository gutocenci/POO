package fatec.poo.model;

public class FuncionarioMensalista extends Funcionario {

    private double valSalMin;
    private double numSalMin;

    public FuncionarioMensalista(int r, String n, String dta, String cargo, double nsm) {
        super(r, n, dta);
        numSalMin = nsm;
    }
    public void apontaValSalMin(double vsm) {
        valSalMin = vsm;
    }

    @Override
    public double calcSalBruto() {
        double SalBruto;
        SalBruto = valSalMin * numSalMin;
        return (SalBruto);
    }
}
