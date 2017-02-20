
/**
 *
 * @author aluno
 */
public class Exemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Numero;

        Numero = (int) (Math.random() * 100);
        if (Numero <= 50) {
            System.out.println(Numero + " e menor 50");

        } else {
            System.out.println(Numero + " e maior que 50");

        }

    }

}