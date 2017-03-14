
import fatec.poo.model.Retangulo;

public class Aplic1 {

    public static void main(String[] args) {
        //instanciação do objeto
        //da clasee retangulo
        
        Retangulo objRet = new Retangulo(3.0, 4.0);
        
        System.out.println("Altura: "    + objRet.getAltura());
        System.out.println("Base: "      + objRet.getBase());
        System.out.println("Area: "      + objRet.CalcArea());
        System.out.println("Perimetro: " + objRet.CalcPerimetro());
        System.out.println("Diagonal: "  + objRet.calcDiagonal());
    }
    
}
