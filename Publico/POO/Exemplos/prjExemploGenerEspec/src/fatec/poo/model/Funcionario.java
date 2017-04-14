package fatec.poo.model;

/**
 *
 * @author dimas
 */
public abstract class Funcionario {
    private int Registro;
    private String Nome;
    private String DtAdmissao;
    private String Cargo;
    
    public Funcionario(int r, String n, String dta) {
        Registro = r;
        Nome = n;
        DtAdmissao = dta; 
    }

    //método abstrato
    abstract public double calcSalBruto();

    public double calcDesconto() {
        double Desconto;
        Desconto = 0.10 * calcSalBruto();
        return (Desconto);
    }

    public double calcSalLiquido() {
        double SalLiq;
        SalLiq = calcSalBruto() - calcDesconto();
        return (SalLiq);
    }

    public int getRegistro() {
        return Registro;
    }

    public String getNome() {
        return Nome;
    }

    public String getDtAdmissao() {
        return DtAdmissao;
    }

    public String getCargo() {
        return Cargo;
    }
    
    public void setCargo(String c){
        Cargo = c;
    }
    
    
}
