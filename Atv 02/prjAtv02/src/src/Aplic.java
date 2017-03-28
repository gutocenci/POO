package src;

import java.text.DecimalFormat;
import java.util.Scanner;
import src.fatec.poo.model.Pessoa;
import src.fatec.poo.model.PessoaFisica;
import src.fatec.poo.model.PessoaJuridica;

public class Aplic {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        Pessoa[] CadPes = new Pessoa[15];

        String nome, cpf, cgc;
        int anoInscricao, opcao, i;
        double totalCompra, taxaIncentivo, base;

        System.out.println("1 - Cadastrar Pessoa Fisica");
        System.out.println("2 - Cadastrar Pessoa Juridica");
        System.out.println("3 - Listar");
        System.out.println("4 - Sair");
        System.out.println("\nDigite a opcao");
        opcao = entrada.nextInt();

        if (opcao == 1) {
            System.out.println("Informe o nome");
            nome = entrada.next();
            System.out.println("Informe o ano de inscricao");
            anoInscricao = entrada.nextInt();
            System.out.println("Informe o CPF");
            cpf = entrada.next();
            System.out.println("Informe o Base");
            base = entrada.nextDouble();
            CadPes = new PessoaFisica(nome, cpf, anoInscricao);
        }

        if (opcao == 2) {
            System.out.println("Informe o nome");
            nome = entrada.next();
            System.out.println("Informe o ano de inscricao");
            anoInscricao = entrada.nextInt();
            System.out.println("Informe o CGC");
            cgc = entrada.next();
            System.out.println("Informe o Taxa de Incentivo");
            taxaIncentivo = entrada.nextDouble();
        }

        if (opcao == 3) {
            for (int i = 0; i < CadPes.length; i ++){
            System.out.println("Tipo");
            nome = entrada.next();
            System.out.println("Informe o ano de inscricao");
            anoInscricao = entrada.nextInt();
            System.out.println("Informe o CPF");
            cpf = entrada.next();
            System.out.println("Informe o Base");
            base = entrada.nextDouble();
        }
    }

}
