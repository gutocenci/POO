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
        int anoInscricao, opcao, i, totalPes = (-1), aux = 1, total;
        double totalCompra, taxaIncentivo, base, valCompra;

        while (true) {
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
                totalPes++;
                CadPes[totalPes] = new PessoaFisica(nome, cpf, anoInscricao);
                do {
                    System.out.println("Adicone valores de compra");
                    valCompra = entrada.nextDouble();
                    CadPes[totalPes].addCompras(valCompra);
                } while (valCompra != 0);

                System.out.println("Funcionario Fisico Cadastrado\n");
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
                totalPes++;
                CadPes[totalPes] = new PessoaJuridica(nome, cgc, anoInscricao, taxaIncentivo);
                System.out.println("Funcionario Juridico Cadastrado\n");
                do {
                    System.out.println("Adicone valores de compra");
                    valCompra = entrada.nextDouble();
                    CadPes[totalPes].addCompras(valCompra);
                } while (valCompra != 0);
            }

            if (opcao == 3) {
                System.out.println("\nTipo\t\tCPF/CGC\t\tNome\t\tAno Inscrição\t\tBonus");
                for (i = 0; i <= totalPes; i++) {
                    if (CadPes[i] instanceof PessoaFisica) {
                        System.out.print("Fisica\t\t");
                        System.out.print(((PessoaFisica) CadPes[i]).getCPF() + "\t\t");
                        System.out.print(CadPes[i].getNome() + "\t\t");
                        System.out.print(CadPes[i].getAnoInscricao() + "\t\t\t");
                        System.out.println(((PessoaFisica) CadPes[i]).calcBonus(2017) + "\t\t");
                    }
                    if (CadPes[i] instanceof PessoaJuridica) {
                        System.out.print("Juridica\t");
                        System.out.print(((PessoaJuridica) CadPes[i]).getCgc() + "\t\t");
                        System.out.print(CadPes[i].getNome() + "\t\t");
                        System.out.print(CadPes[i].getAnoInscricao() + "\t\t\t");
                        System.out.println(((PessoaJuridica) CadPes[i]).calcBonus(2017) + "\t\t");
                    }
                }
                System.out.println("\nFinal da Lista");

            }

            if (opcao == 4) {
                System.out.println("\nAplicação encerrada");
                break;
            }
        }
    }
}
