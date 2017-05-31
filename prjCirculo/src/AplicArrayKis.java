
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AplicArrayKis {

    public static void main(String[] args) {
        DecimalFormat Formato = new DecimalFormat("#0.00");
        Scanner Entrada = new Scanner(System.in);
        ArrayList<Circulo> circulos = new ArrayList<Circulo>();
        double medRaio;

        System.out.println("Digite o valor do raio");
        medRaio = Entrada.nextDouble();

        while (medRaio > 0) {
            Circulo c = new Circulo();
            c.setRaio(medRaio);
            circulos.add(c);

            System.out.println("Digite o valor do raio");
            medRaio = Entrada.nextDouble();
        }

        for (int i = 0; i < circulos.size(); i++) {
            System.out.println("\n\t\tObjeto Circulo numero: " + (i + 1));
            System.out.println("Area:" + Formato.format(circulos.get(i).calcArea()));
            System.out.println("Diamentro: " + Formato.format(circulos.get(i).calcDiametro()));
            System.out.println("Perimetro: " + Formato.format(circulos.get(i).calcPerimetro()));
        }

    }
}