package src.poo.fatec;

public class ContaCorrenta {

    private int numero;
    private double saldo;

    public ContaCorrenta(int n, double s) {
        numero = n;
        saldo = s;
    }

    public void depositar(double d) {

        saldo = saldo + d;

    }

    public void sacar(double s) {

        saldo = saldo - s;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
