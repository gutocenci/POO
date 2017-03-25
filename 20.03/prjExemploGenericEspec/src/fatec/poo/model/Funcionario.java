package fatec.poo.model;

public abstract class Funcionario {

    private int Registro;
    private String Nome;
    private String DtAdmissao;
    private String Cargo;

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

    public Funcionario(int r, String n, String dta, String C) {
        Registro = r;
        Cargo = C;
        Nome = n;
        DtAdmissao = dta;
    }

    abstract public double calcSalBruto();

    public double calcDesconto() {
        double Desconto;
        Desconto = 0.10 * calcSalBruto();
        return (Desconto);
    }

    public double calcSalLiquido() {
        double SalLiq;
        SalLiq = calcSalBruto()
                - calcDesconto();
        return (SalLiq);
    }
} // fim classe Funcionario
