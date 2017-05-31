package src.poo.fatec;

public class Turma {

    private String sigla;
    private int qtdeVagas;
    private Curso cursos;
    private Professor professores;
    private Aluno alunos[];
    private int numalu;
    private int qtdealuno;

    public Turma(String sigla, int qtdeVagas) {
        this.sigla = sigla;
        this.qtdeVagas = qtdeVagas;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }

    public void setQtdeVagas(int qtdeVagas) {
        this.qtdeVagas = qtdeVagas;
    }

    public Curso getCursos() {
        return cursos;
    }

    public void setCursos(Curso cursos) {
        this.cursos = cursos;
    }

    public Professor getProfessores() {
        return professores;
    }

    public void setProfessores(Professor professores) {
        this.professores = professores;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public int getNumalu() {
        return numalu;
    }

    public void setNumalu(int numalu) {
        this.numalu = numalu;
    }

    public void addAluno(Aluno a) {
        alunos[qtdealuno] = a;
        qtdealuno++;
    }

}
