
import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dimas
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat Formato = new DecimalFormat("#0.00");
        Scanner Entrada = new Scanner(System.in);
        double medAlt, medBase;
        
        //Definição de um ponteiro
        //para um objeto objeto da
        //classe Retangulo
        Retangulo objRet;
        
        
        //Istanciação de um 
        //objeto da classe Retangulo
        objRet = new Retangulo();
        
        //Entrada de Dados
        System.out.println("Digite a medida da altura: ");
        medAlt = Entrada.nextDouble();
        System.out.println("Digite a medida da base: ");
        medBase = Entrada.nextDouble();
        
        //Passagem de mensagens
        //para o objeto Retangulo instanciado
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
                
        System.out.println("Area: " + Formato.format(objRet.calcArea()));
        System.out.println("Perimetro: " + Formato.format(objRet.calcPerimetro()));        
        System.out.println("Diagonal: "  + Formato.format(objRet.calcDiagonal()));
    }
    
}
