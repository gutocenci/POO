
import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic2 {

    
    public static void main(String[] args) {
        
    DecimalFormat Formato = new DecimalFormat("#0.00");
        
        Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;

        System.out.println("Digite a altura: ");
        medAlt = entrada.nextDouble();
        System.out.println("Digite a base: ");
        medBase = entrada.nextDouble();

        Retangulo objRet = new Retangulo(medAlt, medBase);

        System.out.println("Altura:    " + Formato.format(objRet.getAltura()));
        System.out.println("Base:      " + Formato.format(objRet.getBase()));
        System.out.println("Area:      " + Formato.format(objRet.CalcArea()));
        System.out.println("Perimetro: " + Formato.format(objRet.CalcPerimetro()));
        System.out.println("Diagonal:  " + Formato.format(objRet.calcDiagonal()));
    }
}
