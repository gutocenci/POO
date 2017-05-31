
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        //Instanciação
        DecimalFormat df = new DecimalFormat("#,##0.00");

        Scanner entrada = new Scanner(System.in);

        int registro;
        String nome, dataAdmissao, dataAdissao, cargo;

        System.out.println("Informe os dados do Funcionario horista");

        System.out.println("Informe o numero de regitro");
        registro = entrada.nextInt();
        System.out.println("Informe o nome do funcionario");
        nome = entrada.next();
        System.out.println("Informe a data de admissão");
        dataAdmissao = entrada.next();
        System.out.println("Informe o cargo do funcionario");
        cargo = entrada.next();

        FuncionarioHorista funchor = new FuncionarioHorista(registro, nome, dataAdmissao, cargo, 10);
        funchor.apontarHoras(90);

        System.out.println("Registro        = " + funchor.getRegistro());
        System.out.println("Nome            = " + funchor.getNome());
        System.out.println("Data Admissão   = " + funchor.getDtAdmissao());
        System.out.println("Cargo           = " + funchor.getCargo());
        System.out.println("Salario Bruto   = " + df.format(funchor.calcSalBruto()));
        System.out.println("Deconto         = " + df.format(funchor.calcDesconto()));
        System.out.println("Salario Liquido = " + df.format(funchor.calcSalLiquido()));

        System.out.println("Informe os dados do Funcionario horista");

        System.out.println("Informe o numero de regitro");
        registro = entrada.nextInt();
        System.out.println("Informe o nome do funcionario");
        nome = entrada.next();
        System.out.println("Informe a data de admissão");
        dataAdmissao = entrada.next();
        System.out.println("Informe o cargo do funcionario");
        cargo = entrada.next();

        FuncionarioMensalista funmen = new FuncionarioMensalista(registro, nome, dataAdmissao, cargo, 10.10);
        funmen.apontaValSalMin(900);

        System.out.println("Funcionario Mensalista");
        System.out.println("Registro        = " + funmen.getRegistro());
        System.out.println("Nome            = " + funmen.getNome());
        System.out.println("Data Admissão   = " + funmen.getDtAdmissao());
        System.out.println("Cargo           = " + funmen.getCargo());
        System.out.println("Salario Bruto   = " + df.format(funmen.calcSalBruto()));
        System.out.println("Desconto        = " + df.format(funmen.calcDesconto()));
        System.out.println("Salario Liquido = " + df.format(funmen.calcSalLiquido()));
    }

}
