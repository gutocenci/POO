
import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dimas
 */
public class Aplic {
    public static void main(String[] args) {
         DecimalFormat df = new DecimalFormat("#0.00");
        Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;
        
        //definição da matrtiz de objetos
        Retangulo[] MatRet = new Retangulo[3];
        
        //instanciando objetos da classe Retangulo
        //e armazenando na matriz de objetos
        for (int i=0; i < MatRet.length; i++){
            System.out.println("Digite a altura: ");
            medAlt = entrada.nextDouble();
            System.out.println("Digite a base: ");
            medBase = entrada.nextDouble();
            
            MatRet[i] = new Retangulo(medAlt,medBase);
        }
        
        //acessando os objetos armazenados na matriz
        for (int i=0; i < MatRet.length; i++){
            System.out.println("\nObjeto Retangulo " + (i+1));
            System.out.println("Altura    : " + df.format(MatRet[i].getAltura()));
            System.out.println("Base      : " + df.format(MatRet[i].getBase()));
            System.out.println("Perimetro : " + df.format(MatRet[i].calcPerimetro()));
            System.out.println("Area      : " + df.format(MatRet[i].calcArea()));
            System.out.println("Diagonal  : " + df.format(MatRet[i].calcDiagonal()));
        } 
    }
}
