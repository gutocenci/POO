
import fatec.poo.model.Retangulo;

public class Aplc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* DEFINICAÇÃO DE UM PONTEIRO
           PARA UM OBJETO, OBJETO DA APLICAÇÃO
           PARA UM OBJETO DA CLASE RETANGULO*/
        Retangulo objRet;
        
        
        /*INSTANCIÇÃO DE UM
        OBJETO DA CLASSE RETANGULO
        */
        objRet = new Retangulo();
        
        
        //PASAGEM DE MENSAGENS PARA O OBJETO RETANGULO INSTANCIADO
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Area: " + objRet.CalcArea());
        System.out.println("Perimetro: " + objRet.CalcPerimetro());
    }
    
}
