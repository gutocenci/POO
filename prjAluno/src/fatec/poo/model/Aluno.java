package fatec.poo.model;

public class Aluno {

    private int ra;
    private String nome;
    private String situacao;
    private double nota1;
    private double nota2;

    public int getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Aluno(double a, double b) {
        nota1 = a;
        nota2 = b;
    }

    public double calcMedia() {
        double media;
        media = (nota1 + nota2) / 2;
        return (media);
    }

    public boolean isAprovado() {
        double media;
        media = (nota1 + nota2) / 2;
        if (media >= 6) {
            return (true);

        } else {
            return (false);
        }
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

}
