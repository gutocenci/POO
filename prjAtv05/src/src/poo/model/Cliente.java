package src.poo.model;

import java.util.ArrayList;

public class Cliente {

    private int identificacao;
    private String cpf;
    private double saldo;
    private ArrayList<Lancamento> lancamentos;

    public Cliente(int identificacao, String cpf, double saldo) {
        this.identificacao = identificacao;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public void addLancamentos(Lancamento l, String tipo) {
        if (tipo.equals("C")) {
            saldo += l.getValor();
        } else {
            saldo -= l.getValor();
        }
    }

    public void exibirLancamentos() {
        System.out.println("CPF\t\tSaldo\t\tCodigo\t\tTipo");
        System.out.println(cpf + "\t\t" + saldo + "\t\t" + identificacao);
        for (int i = 0; i < lancamentos.size(); i++) {
            System.out.println(lancamentos.get(i).getCodigo());
            System.out.println(lancamentos.get(i).getTipo());
            System.out.println(lancamentos.get(i).getValor());
        }
    }
}
