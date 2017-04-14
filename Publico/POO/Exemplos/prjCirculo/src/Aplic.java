
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dimas
 */
public class Aplic {
    public static void main(String[] args) {
       Scanner Entrada = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("#0.00");
       double medRaio;
       
       Circulo objCirc = new Circulo();
       
       System.out.println("Digite a medida do raio: ");
       medRaio = Entrada.nextDouble();
       
       objCirc.setRaio(medRaio);       
       
       System.out.println("Area: " + df.format(objCirc.calcArea()));
       System.out.println("Perimetro: " + df.format(objCirc.calcPerimetro()));
       System.out.println("Diâmetro: " + df.format(objCirc.calcDiametro()));                  
    }
}
