
import fatec.poo.model.Retangulo;

/**
 *
 * @author dimas
 */
public class Aplic1 {
    public static void main(String[] args) {
       //Instanciação do objeto da 
       //classe Retangulo
       Retangulo objRet = new Retangulo(3.0,4.0);
    
       System.out.println("Altura    : " + objRet.getAltura());
       System.out.println("Base      : " + objRet.getBase());
       System.out.println("Perimetro : " + objRet.calcPerimetro());
       System.out.println("Area      : " + objRet.calcArea());
       System.out.println("Diagonal  : " + objRet.calcDiagonal());
       
    }
    
}
