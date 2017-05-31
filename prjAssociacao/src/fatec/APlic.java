
package fatec;

import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;


public class APlic {

    
    public static void main(String[] args) {
        Departamento depl = new Departamento("RH", "Recursos Humanos");
        Departamento dep2 = new Departamento("VD", "Vendas");
        Projeto proj1 = new Projeto("VB", "DotNet", "1 Semestre", "2 Semestre");
        Projeto proj2 = new Projeto("JS", "Web", "1 Semestre", "2 Semestre");
        
        
        FuncionarioHorista funchor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        FuncionarioMensalista funmen = new FuncionarioMensalista(1011, "Gustavo Cenci", "15/07/1991","Aux" ,2.5);
        FuncionarioComissionado funcon = new FuncionarioComissionado(1012, "gu", "10.10.15", 2.5);
        
        //ESTABELECER A ASSOCIAÇÃO BINARIA ENTRE UM 1 OBJETO DA CLASSE FUNCIONARIO COM UM 1 OBJETO DA CLASSE DEPARTAMENTO
        
        funchor.setDepartamento(depl);
        funmen.setDepartamento(depl);
        funcon.setDepartamento(dep2);
        funchor.setProjetos(proj1);
        funmen.setProjetos(proj1);
        funcon.setProjetos(proj2);
        
        
        System.out.println("O funcionario\t" + funchor.getNome() + "\t\tTrabalha no departamento\t" + funchor.getDepartamento().getNome());
        System.out.println("O funcionario\t" + funmen.getNome() + "\t\tTrabalha no departamento\t" + funmen.getDepartamento().getNome());
        System.out.println("O funcionario\t" + funcon.getNome() + "\t\tTrabalha no departamento\t" + funcon.getDepartamento().getNome());
        
        
        //ESTABELCER A ASSOCIAÇÃO BINARIA ENTRE UM 1 OBJETO DEPARTAMENTO COM UM 1 OUTRO MAIS * OBJETOS FUNCIONARIO
        //HORISTA, MENSALISTA OU COMISSIONADO
        
        depl.addFuncionario(funchor);
        depl.addFuncionario(funmen);
        dep2.addFuncionario(funcon);
        
        proj1.addFuncionario(funchor);
        proj1.addFuncionario(funmen);
        proj2.addFuncionario(funcon);
        
        depl.listar();
        dep2.listar();
        proj1.listar();
        proj2.listar();
        
        
    }
    
}
