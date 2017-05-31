package fatec.poo.model;

public class Departamento {

    private String sigla;
    private String nome;
    private Funcionario funcionarios[];
    private int qtdefunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addFuncionario(Funcionario f) {
        funcionarios[qtdefunc] = f;
        qtdefunc++;
    }

    public void listar() {
        System.out.println("\n\nSigla:" + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. Funcionarios " + qtdefunc);

        System.out.println("Registro\t\tNomw\t\tTipo");
        for (int  i = 0; i < qtdefunc ; i++){
        if (funcionarios[i] instanceof FuncionarioComissionado) {
                System.out.println(funcionarios[i].getNome() + "\t\t" + funcionarios[i].getRegistro() + "\t\t" + "Comissionado");
            } else if (funcionarios[i] instanceof FuncionarioHorista) {
                System.out.println(funcionarios[i].getNome() + "\t\t" + funcionarios[i].getRegistro()+ "\t\t" + "Horista");
            } else {
                System.out.println(funcionarios[i].getNome() + "\t\t" + funcionarios[i].getRegistro()+ "\t\t" + "Mensalista");
            }
        }

    }
}
