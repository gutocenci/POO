package src.fatec.poo.model;

public abstract class Pessoa {

    private String nome;
    private int anoInscricao;
    private double totalCompras;

    public Pessoa(String n, int a) {
        anoInscricao = a;
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }

    public void addCompras(double compras) {
        totalCompras = totalCompras + compras;
    }

    abstract public double calcBonus(int a);
}
