package fatec.poo.model;

public abstract class Funcionario {

    public void setRegistro(int Registro) {
        this.Registro = Registro;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setDtAdmissao(String DtAdmissao) {
        this.DtAdmissao = DtAdmissao;
    }
    
    private int Registro;
    private String Nome;
    private String DtAdmissao;
    private String Cargo;
    private Departamento departamento;
    private Projeto projetos;

    public Projeto getProjetos() {
        return projetos;
    }

    public void setProjetos(Projeto projetos) {
        this.projetos = projetos;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
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

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    
    public Funcionario(int r, String n, String dta) {
        Registro = r;
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
