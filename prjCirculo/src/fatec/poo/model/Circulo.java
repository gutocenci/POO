package fatec.poo.model;

public class Circulo {

    private double Raio;

    public void setRaio(double r) {
        Raio = r;
    }

    public double calcArea() {
        double area;
        area = Math.PI * Math.pow(Raio, 2);
        return (area);
    }
    
    public double calcPerimetro(){
        double perimetro;
        perimetro = 2 * Math.PI * Raio;
        return(perimetro);
    }
    
    public double calcDiametro(){
        double diametro;
        diametro = 2 * Raio;
        return (diametro);
    }
}
