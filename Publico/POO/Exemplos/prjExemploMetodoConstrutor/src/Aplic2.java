
import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dimas
 */
public class Aplic2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.00");
        Scanner entrada = new Scanner(System.in);
        double medAlt,medBase;
        
        System.out.println("Digite a altura: ");
        medAlt = entrada.nextDouble();
        System.out.println("Digite a base: ");
        medBase = entrada.nextDouble();
        
        Retangulo objRet = new Retangulo(medAlt, medBase);
        
        System.out.println("Altura    : " + df.format(objRet.getAltura()));
        System.out.println("Base      : " + df.format(objRet.getBase()));
        System.out.println("Perimetro : " + df.format(objRet.calcPerimetro()));
        System.out.println("Area      : " + df.format(objRet.calcArea()));
        System.out.println("Diagonal  : " + df.format(objRet.calcDiagonal()));
    }
    
}
