package Aplic;

import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

public class aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat Formato = new DecimalFormat("#0.00");
        Scanner Entrada = new Scanner(System.in);
        
        Circulo objCirculo = new Circulo();
        
        System.out.println("Digite o valor do raio");
        objCirculo.setRaio(Entrada.nextDouble());
               
        System.out.println("Valor da area: " + Formato.format(objCirculo.calcArea()));
        System.out.println("Valor do perimetro: " + Formato.format(objCirculo.calcPerimetro()));
        System.out.println("Valor do diametro: " + Formato.format(objCirculo.calcDiametro()));
    }

}
