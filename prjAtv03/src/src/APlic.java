package src;

import java.text.DecimalFormat;
import java.util.Scanner;
import src.poo.fatec.ContaCorrenta;

public class APlic {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        ContaCorrenta[] Conta = new ContaCorrenta[15];

        int opcao, cont = 15, numero, existe = 0, aux = (-1);
        double saldo, saque;

        System.out.println("Informe os dados das 15 contas");
        for (int i = 0; i < cont; i++) {
            System.out.println("Informe o numero da conta");
            numero = entrada.nextInt();
            System.out.println("Informe o saldo incial");
            saldo = entrada.nextDouble();
            Conta[i] = new ContaCorrenta(numero, saldo);
        }

        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Listar Contas");
        System.out.println("5 - Sair");
        opcao = entrada.nextInt();

        while (true) {
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Listar Contas");
            System.out.println("5 - Sair");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                System.out.println("Informe o numero da conta corrente a sacar");
                numero = entrada.nextInt();
                for (int i = 0; i < cont; i++) {
                    if (Conta[i].getNumero() == numero) {
                        existe = 1;
                        aux++;
                        break;
                    }
                    aux++;
                }
                if (existe == 0) {
                    System.out.println("Conta nao existe");
                } else {
                    System.out.println("Informe o valor a sacar");
                    saque = entrada.nextDouble();
                    if (saque > Conta[aux].getSaldo()) {
                        System.out.println("Saque nao permitido - Sua conta ficara negativa");
                    } else {
                        Conta[aux].sacar(saque);
                        System.out.println("Saque realizado com sucesso");
                    }
                }
            }
            if (opcao == 2) {
                System.out.println("Informe o numero da conta corrente a depositar");
                numero = entrada.nextInt();
                for (int i = 0; i < cont; i++) {
                    if (Conta[i].getNumero() == numero) {
                        existe = 1;
                        aux++;
                        break;
                    }
                    aux++;
                }
                if (existe == 0) {
                    System.out.println("Conta nao existe");
                } else {
                    System.out.println("Informe o valor a depositar");
                    saque = entrada.nextDouble();
                    Conta[aux].depositar(saque);
                    System.out.println("Deposito realizado com sucesso");
                }
            }

            if (opcao == 3) {
                System.out.println("Informe o numero da conta corrente a consultar saldo");
                numero = entrada.nextInt();
                for (int i = 0; i < cont; i++) {
                    if (Conta[i].getNumero() == numero) {
                        existe = 1;
                        aux++;
                        break;
                    }
                    aux++;
                }
                if (existe == 0) {
                    System.out.println("Conta nao existe");
                } else {
                    System.out.println("Saldo da conta numero " + Conta[aux].getNumero() + " eh :");
                    System.out.println(Conta[aux].getSaldo());
                }
            }

            if (opcao == 4) {
                System.out.println("Lista de contas cadastradas");
                System.out.println("Numero\t\tSaldo");
                for (int i = 0; i < cont; i++) {
                    System.out.println(Conta[i].getNumero() + "\t\t" + Conta[i].getSaldo());
                }
            }

            if (opcao == 5) {
                System.out.println("Aplicação Finalizda");
                break;
            }
        }
    }
}
