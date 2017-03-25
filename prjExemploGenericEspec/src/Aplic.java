
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

public class Aplic {

    public static void main(String[] args) {
        //Instanciação
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funchor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        FuncionarioMensalista funmen = new FuncionarioMensalista(1011, "Gustavo Cenci", "15/07/1991", 2);
        
        funchor.apontarHoras(90);
        funmen.apontaValSalMin(900);

        System.out.println("Funcionario horista");
        System.out.println("Salario Bruto   = " + df.format(funchor.calcSalBruto()));
        System.out.println("Deconto         = " + df.format(funchor.calcDesconto()));
        System.out.println("Salario Liquido = " + df.format(funchor.calcSalLiquido()));
        
        
        System.out.println("Funcionario Mensalista");
        System.out.println("Salario Bruto   = " + df.format(funmen.calcSalBruto()));
        System.out.println("Desconto        = " + df.format(funmen.calcDesconto()));
        System.out.println("Salario Liquido = " + df.format(funmen.calcSalLiquido()));

    }

}
