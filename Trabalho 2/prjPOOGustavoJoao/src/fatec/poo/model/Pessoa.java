package fatec.poo.model;

/**
 *
 * @author 0030481521021
 */
public abstract class Pessoa {
    private String CPF;
    private String Nome;
    private String Endereco;
    private String Cidade;
    private String Cep;
    private String Uf;
    private String Ddd;
    private String Telefone;

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getUf() {
        return Uf;
    }

    public void setUf(String Uf) {
        this.Uf = Uf;
    }

    public String getDdd() {
        return Ddd;
    }

    public void setDdd(String Ddd) {
        this.Ddd = Ddd;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public Pessoa(String CPF, String Nome) {
        this.CPF = CPF;
        this.Nome = Nome;
    }
}
