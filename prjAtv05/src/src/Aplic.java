package src;

import com.sun.security.ntlm.Client;
import java.text.DecimalFormat;
import java.util.Scanner;
import src.poo.model.Cliente;

public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00#");
        Scanner in = new Scanner(System.in);

        Cliente cli1 = new Cliente(10, "404.323.078-85", 1500);
        Cliente cli2 = new Cliente(15, "707.808.909-10", 2000);
        Cliente cli3 = new Cliente(20, "505.606.707-80", 3000);

        while (true) {
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Apontar Lançamentos");
            System.out.println("3 - Exibir Lançamentos do Cliente");
            System.out.println("4 - Sair");
            
            
        }

    }
}
