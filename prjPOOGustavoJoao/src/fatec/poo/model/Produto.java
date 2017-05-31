package fatec.poo.model;

/**
 *
 * @author 0030481521021
 */
public class Produto {
    private int Codigo;
    private String Descricao;
    private int QtdeDisponivel;
    private double PrecoUnit;
    private int EstoqueMin;

    public int getQtdeDisponivel() {
        return QtdeDisponivel;
    }

    public void setQtdeDisponivel(int QtdeDisponivel) {
        this.QtdeDisponivel = QtdeDisponivel;
    }

    public double getPrecoUnit() {
        return PrecoUnit;
    }

    public void setPrecoUnit(double PrecoUnit) {
        this.PrecoUnit = PrecoUnit;
    }

    public int getEstoqueMin() {
        return EstoqueMin;
    }

    public void setEstoqueMin(int EstoqueMin) {
        this.EstoqueMin = EstoqueMin;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public Produto(int Codigo, String Descricao) {
        this.Codigo = Codigo;
        this.Descricao = Descricao;
    }
}
