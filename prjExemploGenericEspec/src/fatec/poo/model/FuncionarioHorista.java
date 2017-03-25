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

    public double calcSalBruto() {
        double SalBruto;
        SalBruto = ValHorTrab * QtdeHorTrab;
        return (SalBruto);
    }
} // fim classe Funcionario Horista

