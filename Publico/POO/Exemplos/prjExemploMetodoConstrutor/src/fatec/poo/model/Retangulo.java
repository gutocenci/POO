package fatec.poo.model;

/**
 *
 * @author dimas
 */
public class Retangulo {
    private double altura;
    private double base;
    
    //definição do método construtor
    public Retangulo(double a, double b){
        altura = a;
        base = b;
    }
    
    public double calcArea(){
        double Area;
        Area = altura * base;
        return(Area);
    }
    
    public double calcPerimetro(){
        double Perimetro;
        Perimetro = 2 * (altura + base);
        return(Perimetro);
    }
    
    public double calcDiagonal(){
        double Diagonal;
        Diagonal = Math.sqrt(Math.pow(altura,2) + Math.pow(base,2)); 
        return(Diagonal);
    }
    
    public double getBase(){
        return(base);
    }
    
    public double getAltura(){
        return(altura);
    }
}

