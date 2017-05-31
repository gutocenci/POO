package src.poo.fatec;

public class Pessoa {
    private String nome;
    private String dtNascimento;
    private String endereco;
    private String cidade;
    
    private Curso cursos;
    private Turma turmas;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Curso getCursos() {
        return cursos;
    }

    public void setCursos(Curso cursos) {
        this.cursos = cursos;
    }

    public Turma getTurmas() {
        return turmas;
    }

    public void setTurmas(Turma turmas) {
        this.turmas = turmas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
}
