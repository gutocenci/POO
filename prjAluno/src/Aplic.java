
import fatec.poo.model.Aluno;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        DecimalFormat Formato = new DecimalFormat("#0.00");
        Scanner entrada = new Scanner(System.in);
        int qtdAprovado = 0, qtdReprovado = 0;

        double nota1, nota2, media;

        Aluno[] aluno = new Aluno[9];

        for (int i = 0; i < aluno.length; i++) {
            System.out.println("Digite a altura");
            nota1 = entrada.nextDouble();
            System.out.println("Digite a base");
            nota2 = entrada.nextDouble();

            aluno[i] = new Aluno(nota1, nota2);
        }

        System.out.println("RA Nome Media Situacao");

        for (int i = 0; i < aluno.length; i++) {
            System.out.print(aluno[i].getRa());
            System.out.print(aluno[i].getNome());
            System.out.print(aluno[i].calcMedia());
            if (aluno[1].isAprovado() == true) {
                System.out.print("Aprovado");
                qtdAprovado++;
            } else {
                System.out.print("Reprovado");
                qtdReprovado++;
            }
        }
        
        System.out.println("Quantidade Aprovado " + qtdAprovado);
        System.out.println("Quantidade Reprovado " + qtdReprovado);
        
    }

}
