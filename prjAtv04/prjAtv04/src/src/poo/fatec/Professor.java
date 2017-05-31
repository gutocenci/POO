package src.poo.fatec;

public class Professor extends Pessoa{
    private String regFunc;
    private int titularidade;
    private int areaAtucao;

    public Professor(String regFunc, String nome) {
        super(nome);
        this.regFunc = regFunc;
    }

    public String getRegFunc() {
        return regFunc;
    }

    public void setRegFunc(String regFunc) {
        this.regFunc = regFunc;
    }

    public int getTitularidade() {
        return titularidade;
    }

    public void setTitularidade(int titularidade) {
        this.titularidade = titularidade;
    }

    public int getAreaAtucao() {
        return areaAtucao;
    }

    public void setAreaAtucao(int areaAtucao) {
        this.areaAtucao = areaAtucao;
    }
    
    
}
