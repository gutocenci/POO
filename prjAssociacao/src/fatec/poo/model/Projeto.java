package fatec.poo.model;

public class Projeto {

    private String sigla;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private Funcionario funcionarios[];
    private int qtdeFunc;

    public Projeto(String sigla, String descricao, String dataInicio, String dataTermino) {
        this.sigla = sigla;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        funcionarios = new Funcionario[5];
    }

    public void addFuncionario(Funcionario f) {
        funcionarios[qtdeFunc] = f;
        qtdeFunc++;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public void listar() {
        System.out.println("\n\nSigla:" + sigla);
        System.out.println("Descricao: " + descricao);
        System.out.println("Dt.Inicio " + dataInicio);
        System.out.println("Dt.Termino " + dataTermino);
        System.out.println("Dt.Termino " + dataTermino);
        System.out.println("Qtde.Funcionarios " + qtdeFunc);

        System.out.println("Registro\t\tNomw\t\tDepartamento");
        for (int i = 0; i < qtdeFunc; i++) {
            if (funcionarios[i] instanceof FuncionarioComissionado) {
                System.out.println(funcionarios[i].getNome() + "\t\t" + funcionarios[i].getRegistro() + "\t\t"
                                   + funcionarios[i].getDepartamento().getNome());
            } else if (funcionarios[i] instanceof FuncionarioHorista) {
                System.out.println(funcionarios[i].getNome() + "\t\t" + funcionarios[i].getRegistro() + "\t\t" +
                        funcionarios[i].getDepartamento().getNome());
            } else {
                System.out.println(funcionarios[i].getNome() + "\t\t" + funcionarios[i].getRegistro() + "\t\t" 
                + funcionarios[i].getDepartamento().getNome());
            }
        }

    }

}
