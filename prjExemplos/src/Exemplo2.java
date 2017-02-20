import javax.swing.JOptionPane;

public class Exemplo2{
	public static void main(String[] args){
		
		int Idade;
		double Peso;
		String Nome,aux;
		Idade = 30;
		Peso = 72.1;
		Nome = "Ana Beatriz";
		
		aux=JOptionPane.showInputDialog("OHHHHHHHH");
		
		System.out.println(aux);
		
		System.out.println("Idade: " + Idade);
		System.out.println("Peso: "  + Peso);
		System.out.println("Nome "   + Nome);
	}
}