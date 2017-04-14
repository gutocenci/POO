package fatec.poo.model;

/**
 *
 * @author dimas
 */
public class Retangulo {
    private double Altura;
    private double Base;
    
    public void setAltura(double a){
        Altura = a;
    }
    
    public void setBase(double b){
       Base = b;
    }
    
    public double calcArea(){
        double Area;
        Area = Altura * Base;
        return(Area);
    }
    
    public double calcPerimetro(){
        double Perimetro;
        Perimetro = 2 * (Altura + Base);
        return(Perimetro);
    }
    
    public double calcDiagonal(){
        double Diagonal;
        Diagonal = Math.sqrt(Math.pow(Altura,2) + Math.pow(Base,2)); 
        return(Diagonal);
    }
}

